import java.util.Scanner; //Just like #include, Object is not in the same default package or directory
public class Start{
	//When you compile the compiler looks for main function  
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String action;
		
		//Variable deceleration like int
		Dog Hound; //Object is in the same default package or directory
		Dog Mounten;
		
		//Creating new object
		Hound = new Dog("Sendor"); // Passing attribute to constructor
		Mounten = new Dog("Gregor");
		
		Hound.printName();
		Mounten.printName();
		
		System.out.print("Do you want to Bark or Dig ");
		action = input.nextLine();
		if (action.equals("Dig")){
			//Use the dig method
			Hound.dig();
		}else if(action.equals("Bark")){
			//Use the bark method 
			Hound.bark();
		}
	}
}