package corelesson3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		System.out.println(v.size());
		System.out.println(v);
		//遍历
		for(int i = 0; i < v.size();i++){
			System.out.println(v.get(i));
		}
		System.out.println("===============");
		for(String str:v){
			System.out.println(str);
		}
		System.out.println("================");
		Iterator<String> itor = v.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		System.out.println("==================");
		//还有一种遍历方式老版本的
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println("===============");
		v.addElement("bye-bye");
		System.out.println(v);
		
	}

}
