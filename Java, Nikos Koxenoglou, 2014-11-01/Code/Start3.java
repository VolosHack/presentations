public class Start3 {	
	
	public static void main(String args[]){
		//Setting new objects 
		Stanis S = new Stanis();
		Davos D = new Davos();
		
		int Health;
		String Words;
		//using the objects methods 
		Words = S.getHit();
		Health = S.damage(200, 50);
		System.out.println(Words + " " + Health);
		
		Words = D.getHit();
		Health = D.damage(300, 100);
		System.out.println(Words + " " + Health);
		
	}
}