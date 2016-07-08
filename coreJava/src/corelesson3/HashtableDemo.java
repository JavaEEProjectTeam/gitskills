package corelesson3;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> hs = new Hashtable<String,String>();
		hs.put("aa", "hello");
		hs.put("bb", "world");
		System.out.println(hs);
		for(String key:hs.keySet()){
			System.out.println(key+"="+hs.get(key));
		}
		
		HashMap hm = new HashMap();
		hm.put(null, null);
		System.out.println(hm);
		hs.put(null, null);
	}

}
