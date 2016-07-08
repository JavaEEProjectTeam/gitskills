package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9000);
			System.out.println("客户端连接服务器");
			// 客户端键盘读一行数据发送给服务器
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String str = br.readLine();
			// 写到服务器端 --->服务器端进行读操作
			// 字节流----》一次写一行的流类
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(str);
			BufferedReader br1 = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			String str1 = br1.readLine();
			System.out.println(str1);
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
