package week05.genaricExample;

public class Cat  {

	String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Meow.  My name is " + name;
	}

}
