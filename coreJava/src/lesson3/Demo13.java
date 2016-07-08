package lesson3;

public class Demo13 {
	public static void main(String[] args) {
		Persony person = new Persony();
		person.getOneCanFly().fly();
		System.out.println("================");
		Shape s = person.getOneShape();
		s.draw();
		System.out.println(s.getLength());
	}
}
class Persony{
	public Shape getOneShape(){
		/*
		 * 看到函数的返回值类型是一个抽象类
		 * 返回的一定是该抽象类子类的实例
		 * 只想在这个函数中使用
		 */
		class Line extends Shape{
			private Point last;//起点
			private Point end;//终点
			public Line(){}
			public Line(Point last,Point end){
				this.last = last;
				this.end = end;
			}
			public double getArea() {return 0;}
			public double getLength() {
				return last.getDistance(end);
			}
			public void draw() {
			    System.out.println("line draw...");
			}
		}
		return new Line(new Point(5,5),new Point(10,10));
	}
	public CanFly getOneCanFly(){
		/*
		 * 看到函数的返回值类型是接口，返回的是实现了该接口的类的对象
		 * 因为在这里可能只有这个函数中使用所以
		 * 我们可以直接在函数内部创建类
		 */
		class Bird implements CanFly{
			public void fly() {
				System.out.println("bird..fly...");
			}
		}//这个类声明在了一个函数的内部，这就是局部内部类，只在该函数内有效
		return new Bird();
	}
}
/*
 *   Outer$Inner.class---->成员内部类
 *   Outer1$Inner.class---->静态内部类
 *   Persony$1Bird.class---->局部内部类
*/