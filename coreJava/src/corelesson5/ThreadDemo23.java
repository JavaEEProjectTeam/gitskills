package corelesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo23 {
	public static void main(String[] args) {
		// 创建了一个固定线程数的线程池
	//	ExecutorService threadPool = Executors.newFixedThreadPool(3);
		//创建了单一的线程
		//ExecutorService threadPool = Executors.newSingleThreadExecutor();
		ExecutorService threadPool = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10; i++) {
			final int task = i;
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					for (int j = 1; j <= 10; j++) {
						System.out.println(Thread.currentThread().getName()
								+ "执行第" + task + "个任务的第" + j + "次循环");
					}
				}
			});
		}
		threadPool.shutdown();
	}

}
