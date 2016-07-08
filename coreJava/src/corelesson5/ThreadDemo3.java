package corelesson5;
public class ThreadDemo3 {
	public static void main(String[] args) {
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(;;){
					System.out.println("hello");
				}
			}
		}).start();
		
		new Thread(){
			public void run() {
				for(;;){
					System.out.println("world");
				}
			}
		}.start();*/
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(;;){
					System.out.println("hello");
				}
			}
		}){
			public void run() {
				for(;;){
					System.out.println("world");
				}
			}
		}.start();
	}

}
