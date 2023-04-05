package test0405;



public class TossCard extends Card{
	
	public String company = "Toss";
	public String cardStaff;
	
	
	
	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff= cardStaff;
	}
	
	
//	public TossCard(String cardStaff) {
//		this.cardStaff= cardStaff;
//	}

	
	
	

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card No, " + getCardNo());
		System.out.println("담당직원 - "+ this.cardStaff+", "+this.company);	
	}
	
	
}
