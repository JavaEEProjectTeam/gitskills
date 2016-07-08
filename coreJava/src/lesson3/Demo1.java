package lesson3;

public class Demo1 {
	public static void main(String[] args) {
	
		Circle c = new Circle(new Point(10,10), 10);
		c.printLocation();
		System.out.println(c.getArea());
		Rectangle r = new Rectangle(new Point(10,10), 10, 10);
		System.out.println(r.getArea());
		System.out.println("=====================");
		//Shape s = new Shape();抽象类不能实例化
		
		Shape s = new Circle(new Point(5,5),5);
		System.out.println(s.getArea());
		Shape s2 = new Rectangle(new Point(4,4), 3, 3);
		System.out.println(s2.getArea());
	    System.out.println("===================");
	    Person person = new Person();
	    //person.drawShape(r);
	    person.drawShape(c);
	    System.out.println("=======================");
	    person.getOneShape().draw();
	}

}
