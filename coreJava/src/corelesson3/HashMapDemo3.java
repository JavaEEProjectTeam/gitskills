package corelesson3;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("x", 10);
		hm.put("y", 20);
		/*key相同 会覆盖之前的value key如何才能相同key
		 * 注意equals方法和hashCode方法的实现
		*/
		hm.put("x", 30);
		System.out.println(hm);
		System.out.println("========================");
		//计算每个字符出现的次数
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
		/*
		 * 思路：拿到每个字符，作为key放入HashMap中如果
		 * 如果map中不存在 那么put(key,1)
		 * 如果已经存在  那么put(key,value+1);
		 */
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		for(int i = 0; i < s.length();i++){
			String str = s.substring(i,i+1);
			if(hm1.containsKey(str)){
				hm1.put(str, hm1.get(str)+1);
			}else{
				hm1.put(str, 1);
			}
		}
		System.out.println(hm1);
		
	}

}
