package corelesson4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1111.txt文件默认就是当前项目下
			FileOutputStream out = new FileOutputStream("1111.txt");
		    out.write(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
