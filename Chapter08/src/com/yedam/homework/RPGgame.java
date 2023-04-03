package com.yedam.homework;

public class RPGgame implements Keypad{
	
	
	int play = 0;

	protected RPGgame() {
		int play = NORMAL_MODE;		
		System.out.println("RPGgame 실행");
	}
	
	

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
		
	}

	@Override
	public void RightUpButton1(int NORMAL_MODE) {
		System.out.println("캐릭터가 한칸 단위로 점프한다.");
		}
		
	
	@Override
	public void RightUpButton2(int HARD_MODE) {
		System.out.println("캐릭터가 두칸 단위로 점프한다.");
		
	}

	@Override
	public void RightDownButton() {
		System.out.println("캐릭터가 두칸 단위로 점프한다.");
		
	}

	@Override
	public void changeMode() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}
	
	

}
