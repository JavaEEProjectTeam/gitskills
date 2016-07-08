package lesson4;

public class Demo9 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);//e.toString();  异常类型+message
			e.printStackTrace();//异常类型+message+异常是在哪个类的哪方法产生的，怎么调用的
		}
	}
}
