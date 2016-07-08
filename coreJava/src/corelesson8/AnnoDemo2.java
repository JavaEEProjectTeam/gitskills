package corelesson8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnoDemo2 {
	public static void main(String[] args) {
		Class c = User.class;
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			if(field.isAnnotationPresent(Column.class)){
				Column column = field.getAnnotation(Column.class);
				System.out.println(column.name());
			}
		}
		System.out.println("====================");
		Method[] ms = c.getMethods();
		for (Method method : ms) {
			if(method.isAnnotationPresent(MethodAnno.class)){
				MethodAnno ma = method.getAnnotation(MethodAnno.class);
				System.out.println(ma.methoddes());
			}
		}
		System.out.println("=====================");
		System.out.println(c.isAnnotation());
		System.out.println(MethodAnno.class.isAnnotation());
	}

}
