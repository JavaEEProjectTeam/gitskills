package corelesson4;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
	      try {
			RandomAccessFile raf = new RandomAccessFile(
					  "D:\\javalessons\\coreJava\\javaSE-core\\raf.dat","rw");
			System.out.println(raf.getFilePointer());
		    raf.writeInt(1000);
		    System.out.println(raf.getFilePointer());
		    raf.write(1000>>24);
		    raf.write(1000>>16);
		    raf.write(1000>>8);
		    raf.write(1000);
		    System.out.println(raf.getFilePointer());
		    raf.writeUTF("hello");
		    System.out.println(raf.getFilePointer());
		    
		    
		   /* byte[] b = new byte[10000];
		    int bytes = raf.read(b,0,b.length);*/
		    System.out.println("===================");
		    raf.seek(0);
		    int a = raf.readInt();
		    System.out.println(raf.getFilePointer());
		    System.out.println(a);
		    raf.seek(8);
		    System.out.println(raf.readUTF());
	      } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 网络下载的时候，其实会把大的文件拆分
	 * 成多个小文件分别下载
	 * 下载后就是多个临时文件然后拼接成一个文件
	 * 涉及到定位到文件的某个位置
	 * 从文件的某个位置开始写
	 */
}
