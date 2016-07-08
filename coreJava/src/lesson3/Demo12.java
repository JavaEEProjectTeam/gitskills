package lesson3;

public class Demo12 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.test3();
		
		System.out.println("================");
		
		Outer1.Inner inner = new Outer1.Inner();
		inner.innertest();
		System.out.println("=====================");
		inner.innertest2();
	}
}
class Outer1{
	public void test1(){
		System.out.println("hello");
	}
	public static void test2(){
		System.out.println("world");
	}
	public void test3(){
		Inner inner = new Inner();//在成员方法中直接使用
		inner.innertest();
	}
	//静态内部类  ---->类似于静态成员
	static class Inner{
		public void innertest(){
			System.out.println("innertest1");
			
		}
		//静态内部类中只能访问外部类的静态成员--->静态的只能访问静态的
		public void innertest2(){
			test2();
		}
	}
}
