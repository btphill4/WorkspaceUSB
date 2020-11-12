package classexamples.week02.animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}

	public void hello() {
		System.out.println("Hello, I'm a dog!");
	}
	
	public void fetch() {
		System.out.println("Ball!");
	}
}
