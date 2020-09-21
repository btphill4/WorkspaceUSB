package collectionExample;

public class BoxDriver {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>("Hello World");
		Box<Integer> box2 = new Box<Integer>(6);
		
		System.out.println("Box 1: " + box1);
		System.out.println("Box 2: " + box2);
		
		
	}

}
