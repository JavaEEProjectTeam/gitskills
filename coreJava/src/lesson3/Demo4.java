package lesson3;

public class Demo4 {
	public static void main(String[] args) {
		final int i = 10;
		//i = 11;错,final修饰的变量只能赋值一次
		T t = new T(5);
		T t1 = new T(6);
		
		final M m = new M(10);//final修饰了m m只能赋值一次，只能指向这个地址 不能指向其它地址了
		//m = new M(20);//错的
		m.setI(1000);//m的i属性并没有用final修饰所以可以改动
		
		
	}
}
class T{
	private final int i;  //final修饰成员变量必须有初始，要么构造函数要么，要么定义初始化赋值
    //普通成员变量，每个对象拥有一份，所以每个对象的i都只能赋值一次
	//private final int i = 值
	public T(int i ){
		this.i = i;
	}
	public int getI() {
		return i;
	}
}
class M{
	private int i ;
	public M(int i ){
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
