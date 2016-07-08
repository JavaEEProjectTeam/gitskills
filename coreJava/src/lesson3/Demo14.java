package lesson3;

public class Demo14 {
	public static void main(String[] args) {
		PersonZ pz = new PersonZ();
		pz.getOneCanFly().fly();
		System.out.println("=====================");
		pz.getOneShape().draw();
	}
}
class PersonZ{
	public CanFly getOneCanFly(){
		//返回的类型是接口，那么要获取实现了该接口的类的实例
		//符合条件 已知接口获取实现了该接口的类的对象
		return new CanFly(){
			@Override
			public void fly() {
				System.out.println("bird fly...");
			}
		};
	}
	public Shape getOneShape(){
		/*
		 * 返回值类型是一个抽象类，那么返回的是该抽象类子类的实例
		 * 已知父类获取其子类的对象
		 * 可以直接使用匿名类的对象
		 */
		return new Shape(){
			@Override
			public double getArea() {return 0;}
			public double getLength() {return 0;}
			@Override
			public void draw() {
				System.out.println("draw ..shape...");
			}
		};
	}
}
