package com.yedam.homework;

public interface Keypad {
	
	public static final int NORMAL_MODE =0;
	
	public static final int HARD_MODE =1;
	
	

	
	
	public abstract void leftUpButton();
	
	public abstract void leftDownButton();
	

	
	
	void RightUpButton1(int NORMAL_MODE);
	void RightUpButton2(int NORMAL_MODE);
	
	
	
	public abstract void RightDownButton();
	
	public abstract void changeMode();

	
	
	

}
