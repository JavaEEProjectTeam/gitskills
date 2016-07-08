package lesson3;
public abstract class Shape {
	private Point location;
	public Shape(Point location){
		this.location = location;
	}
	public Shape(){}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public abstract double getArea();
	public abstract double getLength();
	public abstract void draw();
	public void printLocation(){
		System.out.println("Í¼ÐÎµÄÎ»ÖÃ:"+location.getX()+","+location.getY());
	}
	public void printData(){
		System.out.println(location.getX()+location.getY());
	}
}
