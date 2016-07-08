package lesson2;

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		/*
		 * a1为什么能调用equals方法
		 * java.lang.Object类是一切类的父类
		 * Object类中的方法就继承到了A类中
		*/
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		//打印对象，直接打印对象的toString方法的返回值
		System.out.println(a1.toString());
		
	}
}
class A{
	int i ;
	/*
   public boolean equals(Object obj) {
        return (this == obj);
    }
	 */
	/*public boolean equals(A aa){
		return this.i == aa.i;
	}  */ //和父类继承过来的方法构成了重载，就近原则
	public boolean equals(Object obj){
		//return true;
		//A xx = (A)obj;//传过来的的确是A对象实例的引用就可以转换
		if(obj instanceof A){
			A xx = (A)obj;
			return this.i==xx.i;
		}
		return false;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
	
}
