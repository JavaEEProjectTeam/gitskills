package corelesson4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Work {
	public static void main(String[] args) {
//		HashMap<String,Integer> students = getStudents();
//		System.out.println(students);
		TreeSet<T> ts = sortStudent();
		System.out.println(ts);
	}
	static class T implements Comparable<T>{
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
			return name+"_"+count;
		}
		@Override
		public int compareTo(T o) {
			if(this.count!=o.count)
				return o.count - this.count;
			return this.name.compareTo(o.name);
		}
		
	}
    public static TreeSet<T> sortStudent(){
    	TreeSet<T> ts = new TreeSet<T>(new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
			    if(o1.getCount()!=o2.getCount())
			    	return o2.getCount()-o1.getCount();
			    return o2.getName().compareTo(o1.getName());
			}
    		
		});
    	//遍历Map集合让后把key/value包装成T的实例放入TreeSet中即可
    	HashMap<String,Integer> students = getStudents();
    	for(String key : students.keySet()){
    		T t1 = new T(key,students.get(key));
    		ts.add(t1);
    	}
    	return ts;
    }
	public static HashMap<String, Integer> getStudents() {
		HashMap<String, Integer> students = new HashMap<String, Integer>();
		try {
//			BufferedReader br = new BufferedReader(new FileReader(
//					"src/corelesson4/student.txt"));
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("src/corelesson4/student.txt")));
			String str = null;
			while ((str = br.readLine()) != null) {
				String[] ss = str.split(",");
				/*for (String string : ss) {
					System.out.print(string + "  ");
				}
				System.out.println();*/
				if(students.containsKey(ss[1])){
					students.put(ss[1], students.get(ss[1])+1);
				}else{
					students.put(ss[1], 1);
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}
