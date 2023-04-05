package test0405;

public class Card {
	
	
	public String cardNo;
	public int validDate;
	public int cvc;
	
	public Card(String cardNo, int validDate, int cvc) {
	this.cardNo=cardNo;
	this.validDate=validDate;
	this.cvc = cvc;
	
	}

	public String getCardNo() {
		return cardNo="5432-4567-9534-3657";
	}

	public int getValidDate() {
		return validDate=20251203;
	}

	public int getCvc() {
		return cvc=253;
	}
	
	
	public void showCardInfo() {
		System.out.println("카드정보 (Card No: " + cardNo +", 유효기간: " + validDate+ ", CVC: " + cvc);
	}
	

	
}
