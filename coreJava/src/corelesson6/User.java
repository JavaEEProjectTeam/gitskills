package corelesson6;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private int age;
	public User(){}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
