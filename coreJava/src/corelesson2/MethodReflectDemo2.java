package corelesson2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodReflectDemo2 {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要执行的动作:");
		String action = s.nextLine();
		UserSevice us = new UserSevice();
		/*if("login".equals(action)){
			us.login();
		}else if("update".equals(action)){
			us.update();
		}else if("delete".equals(action)){
			us.delete();
		}*/
		/*
		 * 获取的action 字符串的内容就是方法名称
		 * 我们可以直接通过方法名称获取方法对象
		 * 然后通过方法的反射直接调用
		 */
		try {
	        Class c = us.getClass();
	        Method method = c.getMethod(action, new Class[]{});
	        method.invoke(us, new Object[]{});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class UserSevice{
	public void login(){
		System.out.println("login...");
	}
	public void update(){
		System.out.println("update...");
	}
	public void delete(){
		System.out.println("delete...");
	}
}
