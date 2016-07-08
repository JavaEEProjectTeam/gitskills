package corelesson4;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class StreamDemo6 {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream(new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\print.txt"));
			//System.out 目标是标准输出设备   System.in标准输入设备
			ps.println("helloworld");
			ps.println("bye-bye");//ps.print("hello");不输出换行
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
