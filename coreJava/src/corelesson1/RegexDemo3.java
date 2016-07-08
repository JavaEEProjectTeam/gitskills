package corelesson1;

import java.util.Scanner;

public class RegexDemo3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z]\\w{4,9}$";
		while(true){
			System.out.println("请输入用户名，必须是以字母开头，" +
					"可以根数字字母_ 长度5到10");
			String name = s.nextLine();
			if(name.matches(regex)){
				System.out.println(name);
				break;
			}
			System.out.println("输入的用户名不合法请重新输入");
		}
	}

}
