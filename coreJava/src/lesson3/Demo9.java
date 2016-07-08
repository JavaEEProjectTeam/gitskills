package lesson3;

public class Demo9 {
	public static void main(String[] args) {
	   System.out.println(V.i);
	 //  v.i = 20;
	   System.out.println(V1.i);
	}
}
class V1  implements V{
	@Override
	public void walk() {}
}
interface V{
	int i = 11;//public static final int i = 11;完全等价
	void walk();
}
