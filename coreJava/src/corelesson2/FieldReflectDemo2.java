package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo2 {
	public static void main(String[] args) {
		User u = new User("zhangsan", 30);
		//changeValue(u);
		//System.out.println(u.getName() + "," + u.getAge());
		System.out.println(getSql(u));
	}

	/**
	 * 得到insert into 类名（属性1，属性2..)values(?,?...)
	 * 
	 * @param obj
	 * @return
	 */
	public static String getSql(Object obj) {
		/*
		 * 获取类的信息 类名和属性名 然后做拼接
		 */
		StringBuilder s = new StringBuilder();
		s.append("insert into ");
		Class c = obj.getClass();
		String className = c.getSimpleName();
		s.append(className).append("(");
		Field[] fs = c.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			s = i == 0 ? s.append(fs[i].getName()) : s.append(",").append(
					fs[i].getName());
		}
		s.append(")values").append(getString(fs.length));
		
		return s.toString();
	}

	private static String getString(int length) {
		StringBuilder s = new StringBuilder();
		s.append("(");
		for (int i = 0; i < length; i++) {
			s = i == 0 ? s.append("?") : s.append(",?");
		}
		return s.append(")").toString();
	}

	/**
	 * 修改对象的属性值 字符串属性值全部变成大写 int类型的属性值，全部加上100
	 * 
	 * @param object
	 */
	public static void changeValue(Object object) {
		/*
		 * object对象有哪些属性并不清楚 所以我们需要遍历其所有属性 找出属性String类型的 int类型的属性
		 * 找到属性之后通过成员变量的反射操作
		 */
		// 1.获取类类型
		Class c = object.getClass();
		// 2.获取所有的属性
		Field[] fs = c.getDeclaredFields();
		// 3.遍历所有的属性
		for (Field field : fs) {
			// 4.得到属性的类型
			Class fieldType = field.getType();
			// 5.判断
			/*
			 * if(fieldType.getSimpleName().equals("String")){ }
			 * if(fieldType.getSimpleName().equals("int")){ }
			 */
			try {
				if (fieldType == String.class) {
					// 6.成员变量反射的操作
					field.setAccessible(true);
					String oldValue = (String) field.get(object);
					field.set(object, oldValue.toUpperCase());
				}
				if (fieldType == int.class) {
					field.setAccessible(true);
					int oldValue = (Integer) field.get(object);
					field.set(object, oldValue + 100);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
