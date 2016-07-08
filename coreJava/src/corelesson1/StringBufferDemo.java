package corelesson1;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("hello");
		buffer.append("world");
		System.out.println(buffer);
		System.out.println("==================");
		StringBuilder builder = new StringBuilder();
		builder.append("aa");
		builder.append("bb");
		System.out.println(builder);
		System.out.println("========================");
		String s = "hello";
		StringBuilder sbuilder = new StringBuilder("hello");
		long start = System.currentTimeMillis();
		for(int i = 1; i <=10000;i++){
			//s += "world";//new StringBuilder(s).append("world");
			sbuilder.append("world");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
