//Extends just adds methods with implement you must implement everything 
public class Stanis implements CharacterInterface{
	//object specific behaviour
	public String getHit(){
		String StanisGotHit = "Don't hit the King";
		return StanisGotHit;
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