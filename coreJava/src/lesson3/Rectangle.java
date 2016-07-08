package lesson3;

public class Rectangle extends Shape{
   private int w,h;
   public Rectangle(Point location,int w,int h){
	   super(location);
	   this.w = w;
	   this.h = h;
   }
	@Override
	public double getArea() {
		return w * h;
	}

	@Override
	public double getLength() {
		return 2 * (w + h);
	}

	@Override
	public void draw() {
		System.out.println("drawing ... rect....");		
	}

	
}
