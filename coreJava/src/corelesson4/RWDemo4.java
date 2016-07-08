package corelesson4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RWDemo4 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"D:\\javalessons\\coreJava\\javaSE-core\\Office.java")));
//			PrintWriter pw = new PrintWriter(new FileOutputStream(
//					"D:\\javalessons\\coreJava\\javaSE-core\\4.txt"));
			PrintWriter pw = new PrintWriter(new FileOutputStream(
				"D:\\javalessons\\coreJava\\javaSE-core\\4.txt"),true);//自动刷新缓冲区
			String str = null;
			while((str = br.readLine())!=null){
				System.out.println(str);
				pw.println(str);
				//pw.flush();
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
