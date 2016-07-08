package lesson4;

public class Demo7 {
	public static void main(String[] args) {
		try {
			PersonA pa = new PersonA();
			pa.setAge(100);
			System.out.println(pa.getAge());
		} catch (Exception e) {
			System.out.println("年龄范围不正确");
		}
	}
}
class PersonA{
	private int age;
	/*
	 * setAge方法先完之后，是给别人去调用的
	 * 所以我想让调用者去处理该异常
	 * 这样自己可以不处理，但是现在的情况
	 * 自己不处理程序编译不通过
	 * 那么java提供了另外一种机制叫throws 
	 * 回避异常，自己可以通过编译
	 * 并告知使用者可能会有哪些异常产生，
	 * 
	 */
	public void setAge(int age)throws Exception{
		if(age<0 || age > 120)
			throw new Exception();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
