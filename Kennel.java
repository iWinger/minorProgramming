package test;

public class Kennel {
public static void main(String[] args) {
	Doggy dog1 = new Doggy("Fido", 5, "Labrador", 85.4, false);
	Doggy dog2 = new Doggy("Rover");
	Doggy dog3 = new Doggy("Jasper", 12);
	Doggy dog4 = new Doggy("Lucy", 4, "German Shepherd", 78.0, true);
	
	System.out.println(dog1.toString());
	System.out.println(dog2);
	System.out.println(dog3);
	System.out.println(dog4);
	
	dog4.setDogAggressive(false);
	dog1.setWeight(80.5);
	System.out.println("\n**** After Lucy was trained, fido lost weight ****");
	System.out.println(dog4);
	System.out.println(dog1);
}
}
