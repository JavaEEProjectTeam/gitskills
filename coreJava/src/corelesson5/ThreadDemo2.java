package corelesson5;

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		for(;;){
			System.out.println("world");;
		}
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(;;){
			System.out.println("hello");
		}
	}
}
