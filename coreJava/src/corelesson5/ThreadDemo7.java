package corelesson5;

public class ThreadDemo7 {
	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		thread.start();
		try {
			thread.join();//主线程等待thread线程运行结束
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++){
			System.out.println("hello");
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
