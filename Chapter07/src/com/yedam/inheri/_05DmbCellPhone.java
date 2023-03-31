package com.yedam.inheri;

public class _05DmbCellPhone  extends _04CellPhone{
	//자식클래스로 활용
	
	//필드
	int channel;
	
	//생성자
	public _05DmbCellPhone(int channel, String color, String model) {
		//부모 클래스에 있는 생성자를 사용하는 키워드: super()
		super(model,color); 
		this.channel = channel;
	}
	//메소드
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송수신");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	

}
