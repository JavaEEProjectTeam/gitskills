package corelesson5;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo19 {
	public static void main(String[] args) {
		final Businessx business = new Businessx();
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
class Businessx{
	private  int theValue;
	private boolean flag;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	//模拟生产者
	public void send(){
		for(int i = 1; i<=5;i++){
			lock.lock();
			try{
				while(flag){
					try {
						condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				theValue = new Random().nextInt(1000);
				System.out.println("send the value is:"+theValue);
				flag = true;
				condition.signal();
			}finally{
				lock.unlock();
			}
		}
	}
	//模拟消费者
	public void rec(){
		while(true){
	       lock.lock();
	       try{
				while(!flag){
					try {
					    condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("receiver the value is:"+theValue);
				flag = false;
				condition.signal();
	       }finally{
	    	   lock.unlock();
	       }
		}
	}
}
