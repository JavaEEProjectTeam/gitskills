package lesson4;

public class Demo4 {
	public static void main(String[] args) {
         try {
     	    int a = Integer.parseInt(args[0]);
    		int b = Integer.parseInt(args[1]);
    		System.out.println(a/b);
		}catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("数组下标越界了!");
		}catch(ArithmeticException e){
			System.out.println("除数不能为0！");
		}catch(Exception e){
			System.out.println("其它异常");
		}finally{
			System.out.println("最终需要关闭的资源!");
		}
	}
}
