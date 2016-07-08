package corelesson5;

public class ThreadDemo1 {
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();//启动线程
		//主函数本身是一个线程，我们习惯称为主线程
		for(;;){
			System.out.println("world");
		}
		/*
		 * 观察运行结果整体来看，两个线程在同时运行
		 * 其实:t1和主线程在切换运行
		 * cpu在点时刻只运行一个线程（所有线程同时运行
		 * 其实是线程在切换运行），肉眼
		 * 感觉很多线程在同时运行时因为，肉眼感觉的时间对
		 * cpu来说已经很长了。
		 */
	}
}
class A implements Runnable{
	@Override
	public void run() {//线程要执行的任务
		for(;;){
			System.out.println("hello");
		}
	}
}
