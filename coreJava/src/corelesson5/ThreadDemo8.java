package corelesson5;

public class ThreadDemo8 {
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
		int j = 100;
		while(true){
			Thread.yield();
			if(j!=100)break;
		}
		for(int i=1;i<=10;i++){
			System.out.println("hello");
		}
	}
}
class MyThread3 extends Thread{
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
