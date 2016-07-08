package lesson3;

public class Demo11 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod1();
		System.out.println("=======================");
		/*现在这个成员内部类访问权限是默认的，那么在同一包下就可以
		 * 直接访问,现在我们如何直接创建内部类的对象
		*/
		Outer.Inner inner = outer.new Inner("lisi",40);
		System.out.println(inner);
		inner.innermethod1();
		System.out.println("=======================");
		inner.innermethod2();
	}
}
class Outer{
	String xxx;
	private int i;
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void outerMethod1(){
		//成员函数访问了另外一个成员，只不过这个成员正好是一个类
		Inner inner = new Inner("zhangsan"	, 30);
		System.out.println(inner);
		inner.innermethod1();
		
	}
	public void outerMethod2(){
		System.out.println("outerMethod2方法的使用");
	}
	/*现在是默认的权限、可以为public等，这个类的地位就等价于一个
	 * 类的一个普通成员
	*/
   class Inner{
	     private String name;
	     private int age; 
	     public Inner(String name,int age){
	    	 this.name = name;
	    	 this.age = age;
	     }
	     public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	    
		@Override
		public String toString() {
			return "Inner [name=" + name + ", age=" + age + "]";
		}
		public void innermethod1(){
	    	 System.out.println("innerMethod1...");
	    }
		public void innermethod2(){
			System.out.println("调用外部类的成员方法");
			/*在成员内部直接访问外部类的成员
		    等价一个成员访问了另外一个成员
		    一个非静态的成员访问非静态的成员，前面省略了this
		    那么在非静态成员内部类中，调用外部类的其它非静态成员
		    是否也省略了this
		    如果直接用this会认为是内部类的当前对象
		    如果指定是外部类的当前对象呢？外部类的类名.this
		    */
			//outerMethod2(); 或者
			/*Outer.this可以省略代表外部类的当前对象
			 * 将来在其它一些应用中可能不能省略
			 */
			Outer.this.outerMethod2();
		}
	}
}
