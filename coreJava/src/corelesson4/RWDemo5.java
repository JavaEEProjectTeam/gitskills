package corelesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RWDemo5 {
	public static void main(String[] args) {
		try {
			// 从键盘一次读一行，读到end结束
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter out = new PrintWriter(System.out,true);
			while(true){
				String str = br.readLine();
				//System.out.println(str);
				out.println(str);
				
				if("end".equals(str))break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
