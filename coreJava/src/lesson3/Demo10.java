package lesson3;

public class Demo10 {
	public static void main(String[] args) {
	}
}
interface TT{
	void a();
	void b();
	void c();
	void d();
	void e();
}
/*class A1 implements TT{
	public void a() {
		System.out.println("aa..");
	}
	public void b() {}
	public void c() {}
	public void d() {}
	public void e() {} //方法只要有{}就叫有实现
}
class A2 implements TT{
	public void a() {}
	public void b() {System.out.println("bb...");}
	public void c() {}
	public void d() {}
	public void e() {} //方法只要有{}就叫有实现
}*/
abstract class TTAdapter implements TT{
	public void a() {}
	public void b() {}
	public void c() {}
	public void d() {}
	public void e() {} 
}  //这个类没有必要有任何对象 所以适配器类可以直接声明成abstract
class A1 extends TTAdapter{
	public void a() {System.out.println("a...");}
}
class A2 extends TTAdapter{
	public void b() {System.out.println("b...");}
}
