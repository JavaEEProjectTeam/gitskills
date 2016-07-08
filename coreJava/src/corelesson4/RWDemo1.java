package corelesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RWDemo1 {
	public static void main(String[] args) {
		try {
//			InputStreamReader in = new InputStreamReader(
//					new FileInputStream(
//					"D:\\javalessons\\coreJava\\javaSE-core\\Office.java"));
			
			//aa.txt文件是utf-8编码
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\aa.txt"),"utf-8");
			
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream(
							"D:\\javalessons\\coreJava\\javaSE-core\\1.txt"));
			/*int c;
			while((c = in.read())!=-1){
				System.out.print((char)c);
				out.write(c);
				out.flush();//字符流都带有缓冲区
			}*/
			int chars;
			char[] c = new char[1000];
			while((chars = in.read(c,0,c.length) )!=-1){
				String s = new String(c,0,chars);
				System.out.print(s);
				out.write(c,0,chars);
				out.flush();
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
