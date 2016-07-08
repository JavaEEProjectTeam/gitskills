package corelesson4.simplefactory;

public class FruitTest {
	public static void main(String[] args) {
		/*
		 * 用一把斧子，你自己创建了斧子，现实生活中用斧子就
		 * 应该去工厂买（获取）即可，而不是自己创建斧子
		 */
		/*Apple apple = new Apple();
		apple.grow();
		apple.harvest();
		System.out.println("===============");
		Grape grape = new Grape();
		grape.grow();
		grape.harvest();*/
		//使得使用者和创建者分离--->加新水果需要修改FruitFactory的代码
	     /*Fruit fruit = FruitFactory.getInstance("grape");
		fruit.grow();
		fruit.harvest();*/
		
		Fruit fruit = FruitFactory.getInstance();
		fruit.grow();
		fruit.harvest();
	}

}
