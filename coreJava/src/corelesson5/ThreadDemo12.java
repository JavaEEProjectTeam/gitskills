package corelesson5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo12 {
	public static void main(String[] args) {
		final Output1 output = new Output1();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					output.print("hello");
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					output.print("WORLD");
				}
			}
		}).start();
	}
}
class Output1{
	//创建了锁对象
	Lock lock = new ReentrantLock();
	public void print(String name){
		lock.lock();
		try{
			for(int i = 0; i < name.length();i++){
				System.out.print(name.charAt(i));
			}
			System.out.println();	
		}finally{
			lock.unlock();
		}
	}
}
