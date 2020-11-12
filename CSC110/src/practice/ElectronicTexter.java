package practice;

public class ElectronicTexter {

	public static void main(String[] args) {
		
		//================Camera object==================================
		DigitalCameras camera = new DigitalCameras(32,1000,32,"Sony",3); 			//create an object named camera
		camera.setLifeExpectancy(7.4); 												// set life expectancy from 3 to 7.4
		
		System.out.println(camera.getLifeExpectancy()+" years"); 					//display life expectancy
		System.out.println("Warranty: "+camera.calculateWarranty(200)+" months");	 //display warranty coverage
		System.out.println(camera.toString());										 // display state of camera
		//===============================================================
		
		//================Cellphone object==================================
		System.out.println("");
		Cellphone cell = new Cellphone(3.2, 1000,5.7, "Samsung", "S9", 5.7);		//create an object named cell
		System.out.println("The beginning state of cell is: " + cell.toString()); 	//toString()
		cell.setWeight(2.3); 														//set weight to 2.3
		cell.setSize(6.0);															//set Size to 6.0
		System.out.println("The cost per size for cell is : "  
							+  cell.costPerSize(cell.getSize(), cell.getCost()));						//calculation for cost per size
		cell.setSize(6.0);
		System.out.println("The current state of cell is: " + cell.toString());
		
		
		
		
		
		
	
		System.out.println("object counts: " +camera.getElectronicCount()); 		// count how many object created
	}

}
