package lesson3;

public class Demo16 {
	public static void main(String[] args) {
		Student student = new Student();
		/*student.drawShape(new Shape1(10,10){
			public void draw() {
				System.out.println("drawing .shape...");
			}
		});*/
		final double x = 10;
		final double y = 10;
		student.drawShape(new Shape1(x,y){
			public void draw() {
				System.out.println("drawing .shape...location is:"+x+","+y);
			}
		});
		System.out.println("=========================");
		student.getOneShape(20, 20).draw();
		
	}
}
class Student{
	public void drawShape(Shape1 shape){
		shape.draw();
	}
	
	public Shape1 getOneShape(final double x,final double y){
		return new Shape1(x,y){
			@Override
			public void draw() {
				System.out.println("draw shape location is:"+x+","+y);
			}
		};
	}
}
abstract class Shape1{
	private Point location;
	//public Shape1(){}
	public Shape1(Point location){
		this.location = location;
	}
	public Shape1(double x,double y){
		this(new Point(x,y));
	}
	public abstract void draw();
}
