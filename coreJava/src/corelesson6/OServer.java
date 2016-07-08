package corelesson6;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OServer {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服务已经开启... ...");
			Socket socket = s.accept();
			System.out.println("接受到客户端的访问");
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());
			User user = (User)ois.readObject();
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
