package corelesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RWDemo3 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"D:\\javalessons\\coreJava\\javaSE-core\\Office.java")));
			// BufferedReader br1 = new BufferedReader(
			// new
			// FileReader("D:\\javalessons\\coreJava\\javaSE-core\\Office.java"));
			// 普通的读方法都有，主要的是readLine方法
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(
							"D:\\javalessons\\coreJava\\javaSE-core\\3.txt")));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);// 一次读一行，不直接读取换行符，以后需要自己换行
				bw.write(str, 0, str.length());
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
