package lesson2;

public class Demo1 {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(5,5), 5);
		c.printLocation();
		System.out.println(c.getArea());
	}
}
