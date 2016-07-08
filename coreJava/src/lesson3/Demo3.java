package lesson3;
public class Demo3 {
	public static void main(String[] args) {
		Question[] qs = new Question[2];//抽象类没有实例，那么数组中引用的都是其子类的实例对象
		SingleQuestion question1 = new SingleQuestion(1, "下面是爱情电影的是:",
				new String[] { "A.失恋33天", "B.风语者" }, "A");
		MutilQuestion question2 = new MutilQuestion(1, "下面是战争题材电影的是:",
				new String[] { "A.我愿意", "B.我们曾是战士","C.风语者" },new String[]{ "B","C"});
		qs[0]  =  question1;
	    System.out.println(qs[0].check(new String[]{"A"}));
		qs[1] =  question2;
		System.out.println(qs[1].check(new String[]{"B","C"}));
		
	}
}
