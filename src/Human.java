
class Monkey {
	void jump() {
		System.out.println("Jump!");
		}
	
	void bite () {
		System.out.println("Bite!");
		
	}
}
public class Human extends Monkey{
	
	void eat() {
		System.out.println("Eat!");
	}
	void sleep() {
		System.out.println("Sleep!");
	}
	
	public static void main(String[] args) {
	Human obj = new Human();
	obj.jump();
	obj.bite();
	obj.eat();
	obj.sleep();
	}
}