package corelesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JButton;

public class ClassDemo3 {
	public static void main(String[] args) {
		//System.out.println(ClassDemo3.class.getClassLoader().getClass().getName());
		printClassMessage("hello");
	}
	public static void printClassMessage(Object obj){
		/*要获取类的信息，先获取其类类型
		 * 3种方式根据已有条件选择
		 */
		Class c = obj.getClass();
		//获取类名
		System.out.println(c.getName());
		//获取不包含包名的类名
		System.out.println(c.getSimpleName());
		/*获取类的方法--->方法也是对象
		 * java.lang.reflect.Method类的对象
		 * 
		 * getMethods获取了所有的public的方法，
		 * 父类继承的也是
		 * getDeclaredMethods() 是自己声明的方法，不问访问权限
		 * 继承的得不到
		 */
		Method[] ms = c.getMethods();
		for(int i = 0 ; i < ms.length;i++){
			//获取的是方法的返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+"  ");
			System.out.print(ms[i].getName()+"(");
			//获取的是方法的参数列表的类类型
			Class[] paramsType = ms[i].getParameterTypes();
			for(int j = 0; j < paramsType.length;j++){
				System.out.print(paramsType[j]+",");
			}
			System.out.println(")");
		}
		System.out.println("===============================");
		/*
		 *  成员变量也是对象java.lang.reflect.Field
		 * getDeclaredFields获取所有自己声明的成员变量
		 * getFields方法获取所有public的成员变量
		 */
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//获取的是成员变量的类类型
			Class fieldType = field.getType();
			System.out.println(fieldType.getName()+" "+field.getName());
		}
		
		System.out.println("===========================");
		/*
		 * 所有的构造函数都是java.lang.reflect.Constructor类的对象
		 * getDeclaredConstructors
		 * getConstructors
		 */
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			//获取了构造函数的参数列表的类类型
			Class[] paramsType = constructor.getParameterTypes();
			for (Class class1 : paramsType) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
		
		System.out.println("======================");
		Package package1 = c.getPackage();
		System.out.println(package1.getName());
		System.out.println("=====================");
		System.out.println(c.isInterface());
	}
}

