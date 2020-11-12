package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GradeBook {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> grades = new HashMap<String,ArrayList<Integer>>();

		grades.put("Drew",  new ArrayList<Integer>(Arrays.asList(90, 60, 71)));
		grades.put("Judy",  new ArrayList<Integer>(Arrays.asList(97, 100, 91)));
		grades.put("Clay",  new ArrayList<Integer>(Arrays.asList(60, 40, 20, 76)));
		
		System.out.println(grades);
		
		System.out.println("\nFinal grades: ");
		for(String name : grades.keySet()) {
			System.out.println(name + " : " + average(grades.get(name)));
		}
		
	}
	
	public static int average(ArrayList<Integer> grades) {
		int sum = 0;
		for(Integer grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}

}
