package test0405;

public class CardApp {
	public static void main(String[] args) {
		
		
		Card card = new Card("5432-5125", 20251203, 253);
		TossCard toss = new TossCard("5432-5125", 20251203, 253, "신빛용");
		DGBCard dgb = new DGBCard("5432-5125", 20251203, 253, "신빛용");
		
		card.showCardInfo();
		toss.showCardInfo();
		dgb.showCardInfo();
		
		
		
		
		
		
		
		
		
	}

	

	
	
	
}
