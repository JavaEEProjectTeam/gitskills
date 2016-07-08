package lesson4;

public class Demo12 {
	public static void main(String[] args) {
	}

	public static int dosomething(int age) {
		PersonB pb = new PersonB();

		 try {
		 pb.setAge(age);
		 return pb.getAge();
		 } catch (AgeException e) {
		 System.out.println(e.getMessage());
		 return 0;
		 }finally{
			 System.out.println("finally..");
		 }

//		int age1 = 0;
//		try {
//			pb.setAge(age);
//			age1 = pb.getAge();
//		} catch (AgeException e) {
//			System.out.println(e.getMessage());
//		}finally{
//			System.out.println("finally...");
//		}
//		return age1;
	}
}
