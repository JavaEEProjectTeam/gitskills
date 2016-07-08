package lesson3;

public  class Circle extends Shape {
	private double r;
    public Circle(Point location,double r) {
		super(location);
		this.r = r;
	}
	@Override
	public double getArea() {
		return 3.14 * r * r;
	}
	@Override
	public double getLength() {
		return 2 * 3.14 * r;
	}
	@Override
	public void draw() {
		System.out.println("drawing... circle");
	}

}
