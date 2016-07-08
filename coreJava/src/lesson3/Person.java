package lesson3;

public class Person {
	public void drawShape(Shape shape){
		shape.draw();
		System.out.println(shape.getArea());
	}
	public Shape getOneShape(){
		//return new Circle(new Point(20,20), 20);
		return new Rectangle(new Point(20,20), 20, 20);
	}
}
