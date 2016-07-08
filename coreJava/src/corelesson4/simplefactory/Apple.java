package corelesson4.simplefactory;

public class Apple implements Fruit{

	@Override
	public void grow() {
	     System.out.println("apple growing...");
	}

	@Override
	public void harvest() {
		System.out.println("apple harvest...");
	}
}
