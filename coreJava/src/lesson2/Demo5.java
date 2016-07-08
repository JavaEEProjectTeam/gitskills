package lesson2;

public class Demo5 {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.f());
		//System.out.println(d.g());
	}
}
class C{
	public int i = 27;
	//public int f(){return i;}
	public int f(){return this.g();}
	private int g(){return i;}//把private换成public试试结果
}
class D extends C{
	public int i = 47;
	public int g(){return i;}   
	//public int g(){return super.i}
	//子类中直接访问的i都是子类自己声明的
	//父类继承过来的必须通过父类的继承过来的方法访问或者super
}
