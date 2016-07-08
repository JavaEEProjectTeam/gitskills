package lesson4;

public class Demo11 {
	public static void main(String[] args) {
		PersonB pb = new PersonB();
		/*try {
			pb.setName("helloworldxxxx");
		} catch (NameException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		try {
			pb.setAge(10000);
		} catch (AgeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	
	}
}
class PersonB{
	private int age;
	private String name;
	public void setName(String name)throws NameException {
		if(name.length()<5 || name.length() >=10)
			throw new NameException("姓名长度有误!");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age)throws AgeException {
		if(age < 0 || age >120)
			throw new AgeException("年龄有误必须是0到120");
		this.age = age;	
	}
	public int getAge() {
		return age;
	}
}
