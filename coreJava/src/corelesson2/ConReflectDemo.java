package corelesson2;

import java.lang.reflect.Constructor;

public class ConReflectDemo {
	public static void main(String[] args) {
		try {
			Class c = Student.class;
			// 获取无参数的构造方法了
			Constructor constructor = c.getConstructor(new Class[] {});
			// 通过构造函数的反射创建对象
			Student stu = (Student) constructor.newInstance(new Object[] {});
			stu.setAge(30);
			System.out.println(stu.getAge());
			System.out.println("==========================");
			Constructor constructor2 = c.getConstructor(new Class[] {
					String.class, int.class });

			Student stu1 = (Student) constructor2.newInstance(new Object[] {
					"zhangsan", 30 });
			System.out.println(stu1.getName() + "," + stu1.getAge());

			System.out.println("================");
			Constructor<Student> constructor3 = c
					.getConstructor(new Class[] {});
			Student student1 = constructor3.newInstance(new Object[] {});

			Constructor<Student> constructor4 = c.getConstructor(new Class[] {
					String.class, int.class });
			Student stu4 = constructor4.newInstance(new Object[]{"zhangliu",20});
			System.out.println(stu4.getName()+","+stu4.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
