package corelesson5;

import java.util.HashMap;
import java.util.Random;

public class ThreadDemo20 {
	private static HashMap<Thread, Integer> data = new HashMap<Thread, Integer>();
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>();

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					int value = new Random().nextInt(1000);
					data.put(Thread.currentThread(), value);
					tl.set(value);
					System.out.println("put to "
							+ Thread.currentThread().getName() + " value is:"
							+ value + "...threadLocal...");
					A a1 = new A();
					a1.getData();
					B b1 = new B();
					b1.getData();
					C c1 = new C();
					c1.getData();
				}
			}).start();
		}
	}

	static class A {
		public void getData() {
			Thread t = Thread.currentThread();
			int value = data.get(t);
			System.out.println(t.getName() + " from A get data is :" + value
					+ "..threadlocal..." + tl.get());
		}
	}

	static class B {
		public void getData() {
			Thread t = Thread.currentThread();
			int value = data.get(t);
			System.out.println(t.getName() + " from B get data is :" + value
					+ "..threadlocal..." + tl.get());
		}
	}

	static class C {
		public void getData() {
			Thread t = Thread.currentThread();
			int value = data.get(t);
			System.out.println(t.getName() + " from C get data is :" + value
					+ "..threadlocal..." + tl.get());
		}
	}
}
