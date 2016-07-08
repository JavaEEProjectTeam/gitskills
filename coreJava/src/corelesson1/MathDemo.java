package corelesson1;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		//舍
		System.out.println(Math.floor(10.3));
		System.out.println(Math.floor(10.5));
		//四舍五入
		System.out.println(Math.round(10.2));
		System.out.println(Math.round(10.5));
		//入
		System.out.println(Math.ceil(10.5));
		System.out.println(Math.ceil(10.3));
		
		
		System.out.println(Math.max(1000, 100));
		
		//随机值返回到0到1之间的随机值
		System.out.println(Math.random());
		int a = (int)(Math.random()*100);
		System.out.println(a);
	}

}
