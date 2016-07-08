package corelesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

public class ChartServer {
	private static HashMap<String, Socket> users = new HashMap<String, Socket>();

	public static void addClient(String addr, Socket socket) {
		users.put(addr, socket);
	}

	public static Socket findClient(String addr) {
		return users.get(addr);
	}

	public static HashMap<String, Socket> getUsers() {
		return users;
	}

	public static void main(String[] args) {
		new ChartServer().startServer();
	}

	public void startServer() {
		try {
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服务器已经开启...");
			while (true) {
				Socket socket = s.accept();
				// 存储起来
				String addr = socket.getInetAddress().getHostAddress()+UUID.randomUUID().toString();
				System.out.println("接受到"+addr+"的访问");
				ChartServer.addClient(addr, socket);
				new Service(socket,addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Service extends Thread {
	private Socket socket;
	private PrintStream ps;// 往当前的客户端
	private PrintStream clientToClient;// 私聊往外写的
	private PrintStream toAll;// 群聊往外写的。
	private BufferedReader br;
	private String addr;

	public Service(Socket socket,String addr) {
		this.socket = socket;
		try {
			ps = new PrintStream(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.addr =addr;
		this.start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				String str = br.readLine();
				if ("".equals(str) || str == null)
					continue;
				if ("exit".equals(str)) {
					System.out.println("有客户端退出...");
				}
				int index = str.indexOf("/");
				if (index == -1) {
					// 群聊--->遍历所有的socket进行写操作
					for (String ip : ChartServer.getUsers().keySet()) {
						Socket clientSocket = ChartServer.getUsers().get(ip);
						toAll = new PrintStream(clientSocket.getOutputStream());
						toAll.println(str);
					}
				} else {
					// 私聊
					String ip = str.split("/")[0];
					String content = str.split("/")[1];
					String text = this.addr + "/" + content;// 最后要发送的内容
					Socket clientSocket = ChartServer.findClient(ip);
					if (clientSocket == null) {
						ps.println("服务器直接给反馈：您要发送的客户端不存在!");
					} else {
						clientToClient = new PrintStream(
								clientSocket.getOutputStream());
						clientToClient.println(text);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
