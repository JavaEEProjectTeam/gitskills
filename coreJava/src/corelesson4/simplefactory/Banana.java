package corelesson4.simplefactory;

public class Banana implements Fruit{

	@Override
	public void grow() {
	     System.out.println("banana growing...");
	}

	@Override
	public void harvest() {
		System.out.println("banana harvest...");
	}
}
