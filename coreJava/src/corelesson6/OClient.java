package corelesson6;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class OClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",9000);
			User user = new User("zhangsan",30);
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());
			oos.writeObject(user);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
