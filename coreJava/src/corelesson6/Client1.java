package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9000);
			System.out.println("客户端连接服务器");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader br1 = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			while(true){
				String str = br.readLine();
				if("exit".equals(str))break;
				out.println(str);
				String str1 = br1.readLine();
				System.out.println(str1);
			}
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
