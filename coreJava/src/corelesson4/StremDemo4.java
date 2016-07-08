package corelesson4;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StremDemo4 {
	public static void main(String[] args) {
		//write();
		read();
	}

	public static void write() {
		try {
			// 把1.txt文件作为字节输出流，并且直接可以写java的数据类型
			/*
			 * DataOutputStream dos = new DataOutputStream( new
			 * FileOutputStream("d:\\1.txt"));
			 */
			// 把1.txt文件作为字节输出流，并且先写入缓冲区，并且可以直接写java的数据类型
			/*
			 * DataOutputStream dos1 = new DataOutputStream( new
			 * BufferedOutputStream( new FileOutputStream("d:\\1.txt")));
			 */

			// 发现特殊功能的流类都是有基本的流流，嵌套构造而来，其实是装饰模式
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\data.txt"));
		    /*
		     * 如果是FileOutputStream out
		     * out.write(10000); write方法只能写一个字节 
		     * 但是10000 是32个字节，所以它只会写后8位
		     * DataOutputStream dos对象的writeInt
		     * 方法一定是利用out对象的write方法写4次每次写8位
		     * writeInt内部一定是
		     * out.write(10000>>24)
		     * out.write(10000>>16)
		     * out.write(10000>>8)
		     * out.write(10000)
		     */
			dos.writeInt(1000);
			dos.writeBoolean(true);
			dos.writeDouble(10.03);
			dos.writeUTF("helloworld");
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() {
		try {
			DataInputStream dis = new DataInputStream(new 
					FileInputStream("D:\\javalessons\\coreJava\\javaSE-core\\data.txt"));
			/*
			 * readInt方法是用
			 * InputStream 的read读4次然后拼接
			 * 看源码
			 */
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
