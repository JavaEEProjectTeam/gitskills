package lesson3;

public class MainBord {
	private Memory memory;
	private DisplayCard displayCard;
	public MainBord(){}
	public MainBord(Memory memory, DisplayCard displayCard) {
		this.memory = memory;
		this.displayCard = displayCard;
	}
	//利用内存
	public void cacheData(){
		memory.cache();
	}
	//利用显卡
	public void disp(){
		displayCard.display();
	}
}
