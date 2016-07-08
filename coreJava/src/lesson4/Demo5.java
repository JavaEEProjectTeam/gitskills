package lesson4;

public class Demo5 {
	public static void main(String[] args) {
        try{
        	System.out.println("上锁...");
        	System.out.println("做事1....");
        	System.out.println("做事2...");
        }finally{
        	 System.out.println("解锁...");
        }
	}
}
