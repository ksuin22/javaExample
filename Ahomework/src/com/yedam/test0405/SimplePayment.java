package com.yedam.test0405;

public class SimplePayment implements Payment{

	double simplePaymentRatio=0.05;
	double a = simplePaymentRatio+ ONLINE_PAYMENT_RATIO;
	double b = simplePaymentRatio+ OFFLINE_PAYMENT_RATIO;
	int price;
	
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio=simplePaymentRatio;
		System.out.println("*** 간편결제 시 할인정보");
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
