package corelesson4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWDemo2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(
					"D:\\javalessons\\coreJava\\javaSE-core\\Office.java");
			FileWriter fw = new FileWriter(
					"D:\\javalessons\\coreJava\\javaSE-core\\2.txt");
			char[] c = new char[1000];
			int chars;
			while((chars = fr.read(c,0,c.length))!=-1){
				String s= new String(c,0,chars);
				System.out.print(s);
				fw.write(c,0,chars);
				fw.flush();
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
