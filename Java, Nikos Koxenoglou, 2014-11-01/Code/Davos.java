//Extends just adds methods with implement you must implement everything 
public class Davos implements CharacterInterface{
	
	//object specific behaviour
	public String getHit(){
		String DavosGotHit = "The onion knight is Strong";
		return DavosGotHit;
	}	
	public int damage(int curHealth, int damage){
		int newHealth = curHealth - damage;
		if (newHealth > 0 ){
			return newHealth;
		}else{
			return 0;
		}
	}
}