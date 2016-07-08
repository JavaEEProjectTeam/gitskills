package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "abc123def345sig5677xx";
		//找出其中的数字
		String regex = "\\d+";  
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		int sum = 0;
		while(matcher.find()){
			//System.out.println(matcher.group());
			sum += Integer.parseInt(matcher.group());
		}
		System.out.println(sum);
		System.out.println("=========================");
		String[] ss = s.split("\\D+");
		System.out.println(Arrays.toString(ss));
		System.out.println("================");
		regex = "[0-9]+";//数字出现1次或者多次
		regex = "[^0-9]+";
		ss = s.split(regex);
		System.out.println(Arrays.toString(ss));
		ss = s.split("[a-zA-Z]+");
		System.out.println(Arrays.toString(ss));
	}

}
