package corelesson6;

import java.io.BufferedReader;
import java.io.PrintWriter;
//从键盘读取数据写入到socket管道流
public class WriterThread extends Thread{
	private BufferedReader br;
	private PrintWriter out;
	
	public WriterThread(BufferedReader br, PrintWriter out) {
		super();
		this.br = br;
		this.out = out;
	}

	@Override
	public void run() {
		try {
			while(true){
			String str = br.readLine();
			out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
