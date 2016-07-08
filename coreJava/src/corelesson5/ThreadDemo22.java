package corelesson5;

public class ThreadDemo22 {
	public static void main(String[] args) {
		/*
		 * 创建了10个线程，执行了10个任务--->不希望无休止的创建线程
		 * 不管有多少任务都交给固定的线程数的线程来执行这个任务
		 * 可以让一个线程来执行多个任务
		 */
		
		

		for(int i = 1; i <= 10;i++){
			final int task = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("任务"+task);
				}
			}).start();
		}
	}

}
