package corelesson6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.163.com");
			System.out.println(address.getHostAddress());

			// 本机默认IP是127.0.0.1
			InetAddress address1 = InetAddress.getByName(null);
			System.out.println(address1.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
