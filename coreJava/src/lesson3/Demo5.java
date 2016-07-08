package lesson3;

public class Demo5 {
	public static void main(String[] args) {
	}
}
class P{
	public final void test(){
		a();
		b();
		c();
	}  //test方法必须a,b,c这个顺序，以后永远不能改动,子类不能去重写它，那该方法只要用final修饰即可
	private void a(){}
	private void b(){}
	private void c(){}
}
class P1 extends P{
	//public void test(){} 不能重写
}
final class Q{
	
}
/*class Q1 extends Q{
	
}*///final修饰的类是不能继承的

