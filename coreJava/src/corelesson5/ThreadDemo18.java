package corelesson5;

public class ThreadDemo18 {
	public static void main(String[] args) {
		final Business1 bus = new Business1();
		new Thread(new Runnable() {
			@Override
			public void run() {
			  for(int i = 1; i <= 50;i++){
				  bus.a();
			  }
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
			  for(int i = 1; i <= 50;i++){
				  bus.b();
			  }
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
			  for(int i = 1; i <= 50;i++){
				  bus.c();
			  }
			}
		}).start();
		
	}
}
class Business1{
	int flag=1;
	public void a(){
		synchronized (this) {
			while(flag!=1){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i = 1; i <= 10;i++){
				System.out.println("A线程循环"+i+"次");
			}
			flag = 2;
			this.notifyAll();
		}
	}
	public void b(){
		synchronized (this) {
			while(flag!=2){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i = 1 ; i <= 20;i++){
				System.out.println("B线程循环"+i+"次");
			}
			flag =3;
			this.notifyAll();
		}
	}
	public void c(){
		synchronized (this) {
			while(flag!=3){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i = 1 ; i <= 30;i++){
				System.out.println("C线程循环"+i+"次");
			}
			flag =1;
			this.notifyAll();
		}
	}
}
