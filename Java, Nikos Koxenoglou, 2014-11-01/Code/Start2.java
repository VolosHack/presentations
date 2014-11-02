import java.util.Scanner; //Just like #include, Object is not in the same default package or directory
public class Start2{
	
	//When you compile the compiler looks for main function  
	public static void main(String args[]) {
		
		//Variable deceleration like int
		Dog2 Hound; //Object is in the same default package or directory
		Dog2 Mounten;
		
		//Creating new object
		Hound = new Dog2("Sendor"); // Passing attribute to constructor
		Mounten = new Dog2("Gregor");
		
		Hound.IsOnEarth();
	}	
}