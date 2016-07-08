package corelesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriDemo1 {
	public static void main(String[] args) {
		Student stu = new Student(1000, "zhangsan", 30);
		try {
			// Ð´²Ù×÷
		
//			  ObjectOutputStream out = new ObjectOutputStream( new
//			  FileOutputStream(
//			  "D:\\javalessons\\coreJava\\javaSE-core\\data1.dat"));
//			  out.writeObject(stu); 
//			  out.flush(); 
//			  out.close();
			 

			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\data1.dat"));
			Student stu1 =(Student) in.readObject();
			System.out.println(stu1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
