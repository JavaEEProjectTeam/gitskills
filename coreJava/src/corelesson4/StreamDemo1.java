package corelesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {
	public static void main(String[] args) {
		// test1();
		 //test2();
		//test3();
		test4();
	}

	// 所有的IO操作都有IOException产生
	public static void test1() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			// 如果1.txt不存在直接创建，存在会删除然后再创建
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\2.txt");

			int c;
			/*
			 * 问题1：对于单字节编码字符都没有问题， 对于一个字符占用多个字节的文字直接打印会有乱码 问题2： 对于比较大的文件读取效率比较低
			 */
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			in.close();// 最好在finally中去关闭
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test2() {
		try {
			// 快捷键 选中区域ctrl+/
			// FileInputStream in = new FileInputStream(
			// "D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			// FileOutputStream out = new FileOutputStream(
			// "D:\\javalessons\\coreJava\\javaSE-core\\3.txt");
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\a.jpg");
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\b.jpg");
			byte[] b = new byte[1024 * 5];
			/*
			 * 往b字节数组中放，从第0个位置开始最多放b.length个 返回的是读取的字节的个数
			 */

			/*
			 * int bytes = in.read(b,0,b.length);//批量读取效率较高 String s = new
			 * String(b,0,bytes); System.out.println(s);
			 */
			// long start = System.currentTimeMillis();
			int bytes;
			// 读取大的文件建议使用这种方式
			while ((bytes = in.read(b, 0, b.length)) != -1) {
				String s = new String(b, 0, bytes);
				System.out.print(s);
				out.write(b, 0, bytes);
			}
			// long end = System.currentTimeMillis();
			// System.out.println(end - start);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test3() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\4.txt");
			int length = in.available();// 返回的可读的字节数
			/*
			 * 如果文件很大，开辟的内存空间就太大了也不合适 建议都用test2方法中的方式读取文件
			 */
			byte[] b = new byte[length];
			in.read(b);
			String s = new String(b);
			System.out.println(s);
			out.write(b);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void test4(){
    	try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\aa.txt");
			
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\bb.txt");
			byte[] b = new byte[1000];
			int bytes = in.read(b,0,b.length);
			/*
			 * aa.txt文件是utf-8编码的字节序列，转换成字符串
			 * 时要用utf-8
			 */
			String s = new String(b,0,bytes,"utf-8");
			System.out.println(s);
			out.write(b,0,bytes);
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
