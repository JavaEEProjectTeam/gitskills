package corelesson5;

import java.util.Random;

public class ThreadDemo14 {
	public static void main(String[] args) {
		FlagSend send = new FlagSend();
		FlagRec rec = new FlagRec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		t1.start();
		t2.start();
	}
}
class FlagSend implements Runnable{
	int theValue;
	boolean flag;
	@Override
	public void run() {
		for(int i = 1; i <= 5;i++){
			while(flag){
				Thread.yield();
			}
			theValue = new Random().nextInt(1000);//制造食物
			System.out.println("send the value is:"+theValue);
			//自己去等待，让食客去吃
			flag = true;
		}
	}
}
class FlagRec implements Runnable{
	private FlagSend flagSend;
	public FlagRec(FlagSend flagSend) {
		super();
		this.flagSend = flagSend;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5;i++){
			while(!flagSend.flag){
				Thread.yield();
			}
			System.out.println("receiver the value is:"+flagSend.theValue);
			flagSend.flag = false;
			
		}
	}
	
}
