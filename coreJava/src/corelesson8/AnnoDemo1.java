package corelesson8;

public class AnnoDemo1 {
	public static void main(String[] args) {
		/*
		 * 如何获取注解 类的注解---->Class 方法的注解---->Method 成员的注解---->Field
		 */
		Class c = User.class;
		// User类是否有Entity注解修饰
		System.out.println(c.isAnnotationPresent(Entity.class));
		if (c.isAnnotationPresent(Entity.class)) {
			// 获取注解实例
			Entity entity = (Entity) c.getAnnotation(Entity.class);
			// 调用注解的方法获取注解的数据
			System.out.println(entity.value());
			System.out.println("================");
			int[] a = entity.testArray();
			for (int i : a) {
				System.out.println(i);
			}
			System.out.println(entity.testEnum());
			System.out.println("===============");
			System.out.println(entity.testAnno().value());
		}
	}
}

/*
 * 注解的实例化
 * 
 * @注解类名(方法名=返回值) 如果注解实例化时只有value方法要实现时那么value=可以省略
 *  注解中方法常用的
 *  返回值都有哪些 
 *  返回数组
 * 注解中的方式是可以返回默认值 
 * 返回枚举类型
 * 也可以返回注解
 */
// @Entity(value="这是bbs中的User类",testArray=1)
// @Entity(value="这是bbs_user表",testArray={1,2,3,4})
 @Entity
// @Entity("world")
//@Entity(testArray = { 1, 2, 3, 4 }, testEnum = WeekDay2.MON, value = "bbs_user")
//@Entity(testAnno=@Id("id...."))
class User {
	 @Column(name="user_name")
	private String name;
	 @Column(name="user_age")
	private int age;
    @MethodAnno(methoddes="这是getName方法")
	public String getName() {
		return name;
	}
    @MethodAnno(methoddes="这是setName方法")
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
