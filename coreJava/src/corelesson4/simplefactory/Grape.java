package corelesson4.simplefactory;

public class Grape implements Fruit{

	@Override
	public void grow() {
	     System.out.println("grape growing...");
	}

	@Override
	public void harvest() {
		System.out.println("grape harvest...");
	}
}
