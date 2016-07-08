package corelesson5;

import java.util.Random;

public class ThreadDemo16 {
	public static void main(String[] args) {
		final Business business = new Business();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				business.send();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				business.rec();
			}
		});
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
class Business{
	private  int theValue;
	private boolean flag;
	//模拟生产者
	public void send(){
		for(int i = 1; i<=5;i++){
			synchronized (this) {
				while(flag){
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				theValue = new Random().nextInt(1000);
				System.out.println("send the value is:"+theValue);
				flag = true;
				this.notify();
			}
		}
	}
	//模拟消费者
	public void rec(){
		while(true){
			synchronized (this) {
				while(!flag){
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("receiver the value is:"+theValue);
				flag = false;
				this.notify();
			}
		}
	}
}
