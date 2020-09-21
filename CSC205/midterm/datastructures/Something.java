package exam.midterm.datastructures;

public class Something<T> implements BinaryTreeInterface<T> {

	@Override
	public void add(T target) {
		System.out.println("Adding " + target + " to the tree");	
	}

	@Override
	public T find(T target) {
		System.out.println("Finding " + target + " in the tree");
		return target;
	}

	@Override
	public String toString() {
		return "TREE";
	}
	
	

}
