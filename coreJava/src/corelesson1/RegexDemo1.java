package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {
		String s = "xxab+defab+xyzab+dddab+nnn";
		//要用ab+来分割字符串
		String[] ss = s.split("ab\\+");//如果ab+代表a后面跟bb可以出现一次或者多次
		/*正则表达式.  *  +   ? 有特殊意义  不能单独表示它们，如果
		 * 非要表示就需要用\
		 * 而java中\在字符串需要用\\表示
		 * 所以要表示以上四个字符就应该用\\.、\\+、\\?、\\*
		 * 如果不转移它就有特殊意义
		 */
		System.out.println(Arrays.toString(ss));
		
		System.out.println("================");
		String regex = "ab\\+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		//判断一个字符串是否匹配一个正则表达式
		System.out.println(matcher.matches());
		System.out.println(s.matches(regex));
		//在一个字符串中找出匹配正则表达式的元素
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
