package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Product product1 = new Product("001", "我赢java课程", 10000);
		Product product2 = new Product("002","我赢android课程",12000);
		Product product3 = new Product("003","我赢ui课程",9000);
		/*泛型操作，指明products这个集合中只存放Product类型的实例
		 * 优点：在编译阶段防止错误输入
		 *          实际操作中不需要做强制类型转换
		 */
		ArrayList<Product> products = new ArrayList<Product>();
		//products.add("hello");编译不通过
		products.add(product1);
		products.add(product2);
		products.add(product3);
		//遍历
		for(int i = 0; i < products.size();i++){
			System.out.println(products.get(i));
		}
		System.out.println("================");
		//迭代器遍历
		Iterator<Product> itor = products.iterator();
		while(itor.hasNext()){
			Product pro = itor.next();
			System.out.println(pro);
		}
		System.out.println("====================");
		//forEach遍历
		for(Product product : products){
			System.out.println(product);
		}
	}

}
