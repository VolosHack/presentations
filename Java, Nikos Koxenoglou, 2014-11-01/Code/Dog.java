public class Dog{
	
	String breed;
	//Constructor gives attributes to object
	Dog(String b){
		breed = b; //pass attribute to local string 
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