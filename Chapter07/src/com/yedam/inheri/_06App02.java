package com.yedam.inheri;

public class _06App02 {
	public static void main(String[] args) {
		
		//자식클래스 객체 dmb
		_05DmbCellPhone dmb = new _05DmbCellPhone(1,"white","자바폰");
		
		//자식클래스 객체 dmb2
		_05DmbCellPhone dmb2 = new _05DmbCellPhone(2,"black","디비폰");
				
		
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.hangUp();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		
		
	}
	
}
