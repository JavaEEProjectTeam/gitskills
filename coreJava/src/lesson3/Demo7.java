package lesson3;

import java.io.Serializable;

public class Demo7 {
	public static void main(String[] args) {
	   Hero hero = new Hero();
	   hero.song();
	   hero.fight();
	   hero.swim();
	   System.out.println("==========================");
	   CanSwim cs = new Hero();//这个时候只认为他会游泳的
	   cs.swim();//不能调用其它方法
	   CanSong csong = new Hero();
	   csong.song();
	   
	   hero.walk();
	   
	   Personx personx = new Hero();
	   personx.walk();
	   
	}
}
abstract class   Personx{
	public abstract void walk();
}
class Hero extends Personx implements CanSwim,CanFight,CanSong{
	public void song() {
		System.out.println("songing...");
	}
	public void fight() {
	    System.out.println("fighting...");
	}
	public void swim() {
		System.out.println("swimming...");
	}
	@Override
	public void walk() {
		System.out.println("person  walk...");
	}
	
}

interface CanSwim{
	void swim();
}
interface CanFight{
	void fight();
}
interface CanSong{
	void song();
}
