package lesson4;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 如下代码写完之后，编译能通过
		 * 说明异常类型是jvm能自动捕获的
		 * 也可以自己捕获
		 */
         try {
     	    int a = Integer.parseInt(args[0]);
    		int b = Integer.parseInt(args[1]);
    		System.out.println(a/b);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("数组下标越界了!");
		}catch(ArithmeticException e){
			System.out.println("除数不能为0！");
		}
	}
}
