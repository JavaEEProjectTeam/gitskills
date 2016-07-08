package corelesson5;

public class ThreadDemo10 {
	public static void main(String[] args) {
		Data1 data = new Data1();
		// 数据共享的问题
		Thread t1 = new Thread(data);
		Thread t2 = new Thread(data);
		t1.start();
		t2.start();
	}
}

class Data1 implements Runnable {
	private int i;

	@Override
	public synchronized void  run() {
		int h;
		for (int j = 1; j <= 10; j++) {
			h = i + 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i = h;
			System.out.println(i);
		}
	}
}
