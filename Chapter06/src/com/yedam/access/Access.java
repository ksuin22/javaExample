package com.yedam.access;

public class Access {
	//필드, 메소드, 클래스, 인터페이스 접근가능 여부 제한 => 접근 제한자
	/* public : 어디서든 누구나 다 접근 가능
	 * protected : 상속이라는 관계를 성립시켜 준 다음, 
	 * 		부모의 필드,메소드를 자식이 사용할수 있게 해줌.(패키지 달라도 사용가능)
	 * 		같은 패키지에서만 접근 가능. 단, 상속 관계면 상관없음.
	 * default : 같은 패키지에서만 접근 가능
	 * private : 내가 속한 클래스에서만 사용 가능
	 *  
	 */
	
	
	//-------- 필드에  접근제한자 적용하기.
	public String free;
	protected String parent;
	String basic;
	private String privacy;
	
	
	//생성자에 접근제한자 걸기 > 객체를 생성하는 범위를 조절.
	
	public Access() {
		//어디서든 객체를 생성할 수 있다.
		
	}
	
	protected Access(int a) {
		//같은 패키지, 자식클래스에서 사용할수 있다.
		
	}
		
	Access(String s){
		//같은 패키지에서만 객체 생성할 수 있다.
	}
		
	private Access(double e) {
		//객체 생성금지. 
	}
	
	
	
	//-------- 메소드에  접근제한자 적용하기.
	
	public void intead() {
		info();
	}
	
	private void info() {
		System.out.println("private 메소드");
	}  //private 쓰는이유??? 객체지향에서 정보은닉.. 캡슐화를 하기위해서.
	
	
	protected void parent() {
		System.out.println("protected 메소드");
	}
	
	void basic() {
		System.out.println("default 메소드");
	}
	
	
	

}
