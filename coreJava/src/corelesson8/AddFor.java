package corelesson8;

import java.util.ArrayList;

public class AddFor {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		/*for(int i = 0; i < a.length;i++){
			System.out.print(a[i]+",");
		}*/
		//ÔöÇ¿forÑ­»·
		for(int i : a){
			System.out.print(i+",");
		}
		System.out.println("\n=================");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		for(String s:list){
			System.out.println(s);
		}
	}
	public int add(int...a){
		int sum = 0;
		for(int i : a){
			sum+=i;
		}
		return sum;
	}
	
}
