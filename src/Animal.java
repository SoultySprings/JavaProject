
class Herbivore extends Animal{
	public void eat() {
		System.out.println("Herbivore eats veg");
		}
}
class Carnivore extends Animal{
	public void eat() {
		System.out.println("Carnivore eats non-veg");
	}
}
class Omnivore extends Animal{
	public void eat() {
		System.out.println("Omnivore eats both veg and non-veg");
		}
}

public class Animal {
	
	public void eat() {
		System.out.println("Animals belong to : ");
	}

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		Herbivore obj2 = new Herbivore();
		Carnivore obj3 = new Carnivore();
		Omnivore obj4 = new Omnivore();
		obj1.eat(); obj2.eat();
		obj1.eat(); obj3.eat();
		obj1.eat(); obj4.eat();
	}
}
