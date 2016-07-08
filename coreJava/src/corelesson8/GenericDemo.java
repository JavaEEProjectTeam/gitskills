package corelesson8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class GenericDemo {
	public static void main(String[] args) {
		//泛型只在编译阶段有效--->请参考集合章节代码
	  ArrayList<String> list = new ArrayList<String>();
	  list.add("hello");
	  list.add("world");
	  ArrayList list1 = new ArrayList();
	  System.out.println(list.getClass()==list1.getClass());
	  System.out.println("=====================");
	  //参数化类型可以引用原始类型
	  ArrayList<String> obj1 = new ArrayList();//可以的--->警告信息
	  obj1.add("hello");
	  //obj1.add(100);只能放入String类型在编译阶段
	  //原始类型也可以引用参数化类型
	  ArrayList obj2 = new ArrayList<String>();//可以的--->警告信息
	  obj2.add("hello");
	  obj2.add(100);
	  System.out.println("====================");
	  //参数化的类型不考虑继承关系
	//  ArrayList<Object> obj = new ArrayList<String>();不可以
	   // ArrayList<String> obj = ArrayList<Object>();不可以
	  
	  Vector v1 = new Vector<String>();
	  Vector<Object> v = v1;
	  System.out.println("=============");
	  print(list);
	  HashSet<Integer> hs = new HashSet<Integer>();
	  hs.add(100);
	  print(hs);
	  
	  //泛型实例化的时候必须是Number or 其子类
	  Vector<? extends Number> x = new Vector<Integer>();
	  Vector<? extends Number> z = new Vector<Double>();
	//  Vector<? extends Number> y = new Vector<Object>();//错误的
	  //实例化的时候必须是Integer的父类包换integer  通配符总是包含自己
	  Vector <? super Integer> x1 = new Vector<Number>();
	  Vector <? super Integer> x2 = new Vector<Integer>();
	  System.out.println("=====================");
	  print(10,10);//print(int a,int b);
	  print(10.5,10.5);//print(double a,double b);
	  System.out.println("===============");
	  //class B{int a,b;public B(int a,int b){this.a=a;this.b=b}}
	  B<Integer> b = new B<Integer>(10, 10);
	  B<String> b1 = new B<String>("hello","world");
	  b.print();
	  b1.print();
	  System.out.println("=================");
	  C<Integer, String> c = new C<Integer, String>(10,"hello");
	  C<Double,Double> c1 = new C<Double, Double>(10.1, 10.2);
	  
	}
	public static void print(Collection<?> collection){
		//方法内部只能调用跟泛型无关的方法
		System.out.println(collection.size());
		//collection.add("hello"); add方法参数是泛型的，所以不能用
	}
	public static <T> void print(T a,T b){
		System.out.println(a+","+b);
	}
}
interface Dao<T>{
	public T findById();
	public List<T> findAll();
}
class DaoSupport<T> implements Dao<T>{

	@Override
	public T findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		List<T> list = new ArrayList<T>();
		return list;
	}
	
}
class UserDao extends DaoSupport<User>{
}
class XXDao extends DaoSupport<String>{
	
}
class B<T>{
	T a,b;
	public B(T a,T b){
		this.a = a;
		this.b =b;
	}
	public void print(){
		System.out.println(a+","+b);
	}
}
class C<T,E>{
	private T a;
	private E b;
	public C(T a,E b){
		
	}
	public void print(){
		System.out.println(a+","+b);
	}
}
