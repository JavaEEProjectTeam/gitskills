package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9000);
			System.out.println("客户端连接服务器");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader br1 = new BufferedReader(
			new InputStreamReader(socket.getInputStream()));
			new WriterThread(br, out).start();
			new ReadThread(br1).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
