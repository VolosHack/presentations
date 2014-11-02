public interface CharacterInterface{
	//interface allows multiple programmers to work on the same project
	//interface indicates the behaviour of objects 
	
	//generic methods to be implemented by other programmers 
	//with indicated return types
	
	String getHit();
	int damage(int curHealth, int damage);
}