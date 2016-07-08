package corelesson1;

public class RegexDemo5 {
	public static void main(String[] args) {
		/*常用的正则表达式都可以从网络中搜索到，不一定都要自己去写
		 * 必须认为正则表达式
		 * 我现在定义一个邮箱
		 * cedar_c@163.com     (.com.cn)
		 * 
		 * 假设：
		 * 名字是数字字母_都可以后面跟@
		 * @后面是数字字母
		 * 在后面（.字母）一个或者多个
		 */
		String regex = "^\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+$";
		
		
				
	}

}
