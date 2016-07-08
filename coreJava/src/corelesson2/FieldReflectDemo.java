package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo {
	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		try {
			Class c = u.getClass();
			Field field = c.getDeclaredField("name");
			field.setAccessible(true);//方法对象也有该函数
			//通过Field对象直接获取其属性的值
			String name = (String)field.get(u);
			System.out.println(name);
			//修改其属性
			field.set(u, name.toUpperCase());
			System.out.println(u.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
