package com.yedam.test0405;

public class CardPayment implements Payment {

	public double cardRatio=0.08;
	double a = this.cardRatio+ ONLINE_PAYMENT_RATIO;
	double b = this.cardRatio+ OFFLINE_PAYMENT_RATIO;
	int price;
	
	public CardPayment(double cardRatio) {
		this.cardRatio=cardRatio;
		System.out.println("*** 카드로 결제시 할인정보");
		
	}

	
	@Override
	public int online(int price) {
		return (int) (price-(price*a));
	}

	
	@Override
	public int offline(int price) {
		return (int) (price-(price*b));
	}

	
	@Override
	public void showInfo() {


		System.out.println("온라인 결제시 총 할인율 : " + a);
		System.out.println("오프라인 결제시 총 할인율 : "+ b);
	}
	
	
	
	
	
	
	
}
