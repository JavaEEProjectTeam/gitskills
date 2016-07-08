package corelesson4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo2 {
	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("D:\\javalessons\\coreJava\\javaSE-core\\a.jpg"));
		    BufferedOutputStream bos = new BufferedOutputStream(
		    		new FileOutputStream("D:\\javalessons\\coreJava\\javaSE-core\\d.jpg"));
//		FileOutputStream bos=	
//				new FileOutputStream("D:\\javalessons\\coreJava\\javaSE-core\\e.jpg");
			/*
		    * 内部操作会下把文件放置到内存中（缓冲区字节数组)
		    * 我们读的时候从内存中读取
		    */
			byte[] b = new byte[10000];
		     int bytes;
		     while((bytes = bis.read(b,0,b.length))!=-1){
		    	  //先写入缓冲区，刷新缓冲区才会写入磁盘  缓冲区满了自动刷新
				    bos.write(b,0,bytes);
				    bos.flush();
		     }
		    bos.close();//close也会自动刷新
		    bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
