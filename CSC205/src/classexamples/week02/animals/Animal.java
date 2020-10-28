package classexamples.week02.animals;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// abstract method - must be implemented in non-abstract children
	public abstract void speak();
	
	// non-abstract method
	public void hello() {
		System.out.println("Hello, I'm an animal named " + name);
	}
}
