package corelesson1;

import java.util.Scanner;

public class RegexDemo4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//该电话号码必须以1开头后面是3or5or8后面9位
		String regex = "^1[358]\\d{9}$";
		while(true){
			System.out.println("请输入手机号码:");
			String t = s.nextLine();
			if(t.matches(regex)){
				System.out.println(t);
				break;
			}
			System.out.println("输入不合法，请重新输入");
		}
	}

}
