package corelesson5;

import java.util.Random;

public class ThreadDemo15 {
	public static void main(String[] args) {
		WaitSend send = new WaitSend();
		WaitRec rec = new WaitRec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		//把t2设置成守护线程，当程序只有守护线程运行时，程序自动退出
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
class WaitSend implements Runnable{
	boolean flag;
	int theValue;
	@Override
	public void run() {
		for(int i = 1; i <= 5;i++){
			synchronized (this) {
				while(flag){//why需要用while 存在中断和虚假唤醒
					try {
						this.wait();//wait会释放同步的钥匙
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//生产者生产食物
				theValue = new Random().nextInt(1000);
				System.out.println("send the value is:"+theValue);
				//自己去等待
				flag = true;
				//唤醒消费者
				this.notify();
			}
		}
	}
}
class WaitRec implements Runnable{
	private WaitSend send;
	public WaitRec(WaitSend send) {
		super();
		this.send = send;
	}
	@Override
	public void run() {
		//不知道生产者生产了多少食物，生产多少消费多少
		while(true){
			synchronized (send) {
				while(!send.flag){
					try {
						send.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//消费食物
				System.out.println("recevie the value is:"+send.theValue);
				//自己去等待
				send.flag = false;
				send.notify();
			}
		}
	}
}
