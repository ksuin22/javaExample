package com.yedam.inter;

public class RemoteExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Audio();
		rc = new TV();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-5);
		rc.turnOff();
		
		
		SmartTv tv = new SmartTv();
		
		//2개의 인터페이스를 상속 = tv
		
		RemoteControl rc2 = tv;
		
		rc2.turnOn();
		rc2.setVolume(4);
		rc2.setVolume(-5);
		rc2.turnOff();
		
		//rc2.search("naver");
		
		
		Searchable search = tv;
		
		
		search.search("www.naver.com");
		
		//인터페이스간 상속을 해서 내용을 합쳤기 때문에 사용가능함.
		search.turnOn();
		search.setVolume(8);
		search.turnOff();
		
		
		
	}

}
