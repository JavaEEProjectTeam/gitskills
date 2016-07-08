package lesson3;

public class Computer {
	public static void main(String[] args) {
	//	MainBord mainBord = new MainBord(new AMemory(),new ADisplayCard());
		MainBord mainBord = new MainBord(new BMemory(),new BDisplayCard());
		mainBord.cacheData();
		mainBord.disp();
	}
}
class AMemory implements Memory{

	@Override
	public void cache() {
		System.out.println("amemory cache data");
	}
}
class BMemory implements Memory{

	@Override
	public void cache() {
		System.out.println("Bmemory cache data");
	}
}
class ADisplayCard implements DisplayCard{

	@Override
	public void display() {
		System.out.println("ADisplay Card display");
	}
	
}
class BDisplayCard implements DisplayCard{

	@Override
	public void display() {
		System.out.println("BDisplay Card display");
	}
	
}
