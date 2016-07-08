package corelesson4;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class StreamDemo3 {
	public static void main(String[] args) {
		try {
			//管道流
			PipedInputStream in = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream(in);
			Send send = new Send(out);
			Receiver rec = new Receiver(in);
			send.send();
			rec.rec();
			//关闭省略了
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Send{
	OutputStream out;

	public Send(OutputStream out) {
		super();
		this.out = out;
	}
	public void send(){
		try {
			byte value =(byte)(Math.random()*100);
			System.out.println("send the value is:"+value);
			out.write(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Receiver{
	InputStream in;

	public Receiver(InputStream in) {
		super();
		this.in = in;
	}
	public void rec(){
		try {
			byte value =(byte)in.read();
			System.out.println("rec the value is :"+value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
