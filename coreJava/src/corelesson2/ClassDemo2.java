package corelesson2;

public class ClassDemo2 {
	public static void main(String[] args) {
		Class c = int.class;
		Class c2 = double.class;
		Class c3 = Double.class;
		System.out.println(c2==c3);
	    Class c4 = void.class;
		System.out.println(c4.getName());

	}

}
