public class Dog2 extends animal{
	//extend dog class with animal attributes
	//Class subclass extends superclass
	
	String breed;
	//Constructor gives attributes to object
	Dog2(String b){
		breed = b; //pass attribute to local string 
	}
	
	void IsOnEarth(){
		super.IsOnEarth();
	}
	void printName(){
		System.out.println(breed);
	}
	//Method like a function bun in an object 
	void bark(){
		System.out.println("Woof Woof Woof");	
	}
	
	void dig(){
		System.out.println("*I am digging*");	
	}
}