package classexamples.week02;
import classexamples.week02.animals.*;

public class WildKingdom {

	public static void main(String[] args) {
		Dog d = new Dog("Lassie");
		Cat c = new Cat("Boots");
		Animal a = new Dog("Spot");

		System.out.println("Dog d:");
		d.hello();
		d.speak();
		d.fetch();
		
		System.out.println("\nCat c:");
		c.hello();
		c.speak();

		
		System.out.println("\nAnimal a:");
		a.hello();
		a.speak();
		// a.fetch();  Animals don't know how to fetch
	}
}
