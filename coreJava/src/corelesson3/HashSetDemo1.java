package corelesson3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Student stu1 = new Student("001","zhangsan",22);
		Student stu2 = new Student("002", "lisi", 23);
		Student stu3 = new Student("003","wangwu",22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println(students.size());
		System.out.println(students);
		System.out.println("================");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("===============");
		Iterator<Student> itor = students.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		System.out.println("=================");
		
		//students.add(stu3);加入重复元素会自动过滤加不进去
		System.out.println(students.size());
		
		Student stu4 = new Student("003","wangwu",22);
		System.out.println(stu3.equals(stu4));
		/*重复元素到底如何去定义
		 * stu3/stu4创建对象时是两个对象
		 * 但在实际应用中是同一个学员
		 * 在这个场景中必须用唯一标识对象的属性来重写
		 * equals和hashCode方法
		 * hashCode方法是一种散列算法，现在不用关心如何去写
		 * 它和HashSet中数据的存放有直接关系
		 */
		students.add(stu4);
		System.out.println(students.size());
	}

}
