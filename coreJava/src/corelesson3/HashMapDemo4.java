package corelesson3;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapDemo4 {
	public static void main(String[] args) {
		/*对如下字符串进行计数，看出现的次数
		 * 输出时要求按照次数降序排序，如果次数相同
		 * 按照字母升序排序
		 * 
		 * 思路：通过HashMap集合就可以实现计算次数的操作
		 * 如果要进行排序我们可以采用TreeSet集合
		 * 并且是根据放入TreeSet中的对象的属性进行排序的
		 * 我们可以抽取出一个类完成这个工作
		*/
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		for(int i = 0; i < s.length();i++){
			String str = s.substring(i,i+1);
			if(hm1.containsKey(str)){
				hm1.put(str, hm1.get(str)+1);
			}else{
				hm1.put(str, 1);
			}
		}
		//System.out.println(hm1);
		/*
		 * 遍历HashMap集合，然后把每一个key/value都包装
		 * 成T对象的实例放入TreeSet集合，就完成了排序
		 */
		TreeSet<T> ts = new TreeSet<T>();
		for(String key : hm1.keySet()){
			T t = new T(key,hm1.get(key));
			ts.add(t);
		}
		System.out.println(ts);
	}
}
class T implements Comparable<T>{
	private String name;
	private int count;
	public T(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return name+"出现的次数是:"+count;
	}
	@Override
	public int compareTo(T o) {
		if(this.count!=o.count)
			return o.count-this.count;
		return this.name.compareTo(o.name);
	}
	
}
