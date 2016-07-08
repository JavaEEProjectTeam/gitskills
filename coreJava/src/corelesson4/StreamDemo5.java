package corelesson4;

public class StreamDemo5 {
	public static void main(String[] args) {
		try {
			byte[] b = new byte[10000];
			System.out.println("«Î ‰»Î:");
		     while(true){
		    		int bytes = System.in.read(b,0,b.length);
					String s = new String(b,0,bytes);
					if("end".equals(s))break;
					System.out.println(s);
		     }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
