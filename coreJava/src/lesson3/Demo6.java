package lesson3;

public class Demo6 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		
		Plane p1 = new Plane();
		p1.fly();
		System.out.println("=========================");
		/*
		 * 需要一个会飞的东西
		 * 实现了CanFly接口的才认为是会飞的
		 * 赋值时给一个实现了CanFly接口的类的实例对象即可。
		 * 从语法角度，一样可以认为是父类的引用引用了子类的实例
		 * （实际不要认为是子父类关系，是具备了某种功能)
		 */
		CanFly fly1 = new Bird();
		fly1.fly();//调用实现了接口的类的方法
		CanFly fly2 = new Plane();
		fly2.fly();
		System.out.println("===========================");
		
		Person1 person1 = new Person1();
		person1.toFly(bird);
		
		System.out.println("==================");
		person1.getOneCanFly().fly();
	}
}
interface CanFly{
	void fly();//public abstract void fly();
}
class Bird implements CanFly{
	public void fly() {
		System.out.println("bird fly....");
	}
}
class Plane implements CanFly{
	public void fly() {
		System.out.println("plane fly...");
	}
}
class Person1{
	/*
	 * 该方法参数类型是一个接口，调用该方法时要传递的是
	 * 实现了该接口的类的对象
	 */
	public void toFly(CanFly f1){
		f1.fly();
	}
	public CanFly getOneCanFly(){
		//该方法的返回值类型是接口，
		//返回的是实现了该接口的类的实例对象
		//return new Bird();
		return new Plane();
	}
}
