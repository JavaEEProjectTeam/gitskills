package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo3 {

	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		System.out.println(getValueByPropertyName("age", u));

	}
	/**
	 * 根据标准javaBean的属性名获取其属性值
	 * @param propertyName 属性的名称
	 * @param object  对象
	 * @return
	 */
	public static Object getValueByPropertyName(
			String propertyName,Object object){
		/*
		 * 标准的javaBean都有getter/setter方法
		 * 根据属性名获取get方法
		 * 然后通过get方法的反射操作即可
		 */
		//1.获取类类型
		Class c = object.getClass();
		//2.获取方法名称
		String methodName = "get"+propertyName.substring(0,1)
				.toUpperCase()+propertyName.substring(1);
		//3.获取方法对象---->get方法无参数
		try {
			Method m = c.getMethod(methodName, new Class[]{});
			//4.方法的反射操作
			Object value = m.invoke(object, new Object[]{});
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

