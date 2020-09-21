package ch5;

public class Kennel {

	public static void main(String[] args) 
	{
		//display a welcome message
		System.out.println("Welcome to the kennel");
		
		//create a Dog object called wonderdog
		Dog wonderDog = new Dog();
		
		//Set wonderdogs name 
		wonderDog.setname("Wonder Dog");
		
		//set wonderdogs birthyear
		wonderDog.setBirthYear(2010);
		
		//set wonderDog's breed
		wonderDog.setBreed("Pug");
		
		//Display the state of wonderDog in a nice message
		System.out.println("Here is your new dog! " + wonderDog.toString());
		
		//Display wonderDog's name and age (will use calculateAge method) in a nice message.
		System.out.println("His name is " + wonderDog.getName() + " and he is " 
		+ wonderDog.calculateAge(2018)+ " years old" );
		
		
		Dog superDog = new Dog("Spot", 2003,"Boxer");
		System.out.println("Here is your new dog! " + superDog.toString());
		System.out.println("His age is : " + superDog.calculateAge(2018));
	}

}
