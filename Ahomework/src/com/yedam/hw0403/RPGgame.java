package com.yedam.hw0403;

public class RPGgame implements Keypad{
	
	
	int play = 0;

	protected RPGgame() {
		int play = NORMAL_MODE;		
		//this.play = Keypad.NORMAL_MODE;	
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
	public void rightUpButton() {
		System.out.println("캐릭터가 한칸 단위로 점프한다.");
		System.out.println("캐릭터가 두칸 단위로 점프한다.");
		}
		
	
	@Override
	public void rightDownButton() {
		System.out.println("캐릭터가 두칸 단위로 점프한다.");
		
	}

	@Override
	public void changeMode() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}
	
	

}
