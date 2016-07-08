package lesson2;

public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student(1000,"zhangsan",18,"沃赢java1班");
		Student student2 = new Student(1000,"zhangsan",18,"沃赢java1班");
		/*我们在实际应用当中一般习惯、大家默认都是通过
		 * equals方法来比较两个对象，如果返回true就认为是同一个
		 * 对象，false认为不是
		 * 
		 * 在实际应用中，如果对象有了唯一标识别
		 * 就应该用唯一标识来生成equals方法和hashCode方法（暂时不要关心这个方法)
		 * 
		 */
		System.out.println(student.equals(student2));
		
	     System.out.println(student);
	}
}
