package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		Product product1 = new Product("001", "我赢java课程", 10000);
		Product productx = new Product("001", "我赢java课程", 10000);
		Product product2 = new Product("002","我赢android课程",12000);
		Product product3 = new Product("003","我赢ui课程",9000);
		ArrayList list = new ArrayList();//可以容纳任何对象
		//添加元素
		list.add(product1);
		list.add(product2);
		list.add(product3);
		//查看有效元素的个数
		System.out.println(list.size());
		//直接打印集合对象，会打印容器中容纳的每个对象的toString
		System.out.println(list);
		//获取某个元素，根据数据下标获取
		Product product = (Product)list.get(0);
		System.out.println(product);
		//System.out.println(list.get(8)); 8这个位置上没有元素 会抛出数据下标越界的异常
		//list.add(5,product1);数组下标越界因为前面放了3个元素，这个元素只能放在0,1,2,3这个4个位置
	    /* list.add(2,product1);//list集合中可以容纳重复的元素
	     System.out.println(list);*///可以相当于在数组中插入元素
		System.out.println("=======================");
		//遍历
		for(int i = 0; i < list.size();i++){
			Product pro = (Product)list.get(i);
			System.out.println(pro);
		}
		System.out.println("===================");
		/*通过迭代器遍历
		 * 如果有一个聚集，就应该提供
		 * 访问聚集中某个元素和遍历所有元素的方式
		 * 并且不暴露集合的实现
		 * 
		 * 迭代器设计模式
		 * ArrayList类已经提供了迭代器
		 * java.util.Iterator
		 */
		Iterator itor = list.iterator();
		while(itor.hasNext()){
			Product pro = (Product)itor.next();
			System.out.println(pro);
		}
		System.out.println("==================");
		//foreach遍历
		for(Object object : list){
			Product pro = (Product)object;
			System.out.println(pro);
		}
	   
		//判断某个元素是否包含在集合中--->true
		System.out.println(list.contains(product1));
		/*--->false对象创建是两个，但是实际应用中这两个对象应该是同一个。
		 * 和实际应用有出入，如何解决，我们看源码。
		 * list集合中contains方法的实现是哪传入的实际参数
		 * 和集合中的元素进行equals比较来判断是否包含
		 * equals方法Object类中比较的是两个对象的地址
		 * 而在实际应用中我们一般认为equals返回true
		 * 就是两个相同的对象，所以实际应用中应该
		 * 根据实际情况重写equals方法
		 */
		
		System.out.println(list.contains(productx));
		System.out.println(product1.equals(productx));
		System.out.println("====================");
		//移除元素
		//list.remove(0);//返回的是被移除的对象
		list.remove(product1);
		System.out.println(list);
		
		
	}

}
