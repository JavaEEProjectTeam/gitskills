package lesson3;

import java.io.Serializable;

public class Demo8 {
	public static void main(String[] args) {
		TestMyInterface t = new TestMyInterface();
		t.song();
		t.swim();
		t.fight();
		t.mymethod();
		
	}
}
interface MyInterface extends CanSwim,CanSong,CanFight{
	void mymethod();
}
class TestMyInterface implements MyInterface{
	public void swim() {
		System.out.println("swim...");
	}
	public void song() {
	   System.out.println("song...");
	}
	public void fight() {
		System.out.println("fight...");
	}
	public void mymethod() {
	   System.out.println("mymethod...");
	}
	
}
