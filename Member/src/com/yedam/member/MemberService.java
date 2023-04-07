package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	
	//imple = service
	
	//로그인이 되어있나 안되어있나에 따라 나눈다.
	//로그인= 메뉴를 이동할때마다 로그인 정보가 남아있어야 한다.
	//정적 멤버 static
	
	//1.login
	//	로그인성공
	//login -> id/pw ->정보 조회성공 -> 로그인 
	//로그인 -> 정적 필드에게 로그인한 정보를 입력.
	
	//로그인실패
	//정보조회실패 > 정적 필드에 데이터 안넣어준다.
	
	public static Member memberInfo = null;
	//공용 	공유	  객체타입   객체         객체x
	
	Scanner sc = new Scanner(System.in);
	public void login() {
		//id 입력
		System.out.println("ID >");
		String id = sc.nextLine();
		
		System.out.println("PW >");
		String pw = sc.nextLine();
		
		//1.member == null (id가 없다)
		//2.member != null (회원정보가 있다)
		Member member = MemberDAO.getInstance().login(id);
		
		 if(member != null) {
			 if(member.getPw().equals(pw)) {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(member.getName()+"님 환영합니다.");
				memberInfo = member;
			 }else {
				 //id o /pw x
				 System.out.println("비번이 틀림");
			 }
		 }else {
			 System.out.println("아이디가 존재하지 않습니다.");
		 }

	}

	public void logout() {
		memberInfo= null;
		System.out.println("로그아웃 성공.");
	}
	
	
	//전체조회
	public void getMemberList() {
		List<Member> list = MemberDAO.getInstance().getMemberList();
		
		for(Member member : list) {
			System.out.println("ID : " + member.getId());
			System.out.println("PW : " + member.getPw());
			System.out.println("NM : " + member.getName());
			
		}
	}
	
	
	//회원 등록
	public void memberAdd() { 
		String id = "";		
		while(true) {
			System.out.println("ID > ");
			id = sc.nextLine();
			Member member = MemberDAO.getInstance().login(id);
			if(member ==null) {
				//if(괄호 안에있는 메소드는 무조건 실행됨)
				System.out.println("회원가입 가능");
				break;				
			}else {
				System.out.println("ID 중복, 재입력");
			}
		}
		System.out.println("PW > ");
		String pw = sc.nextLine();	
		System.out.println("이름 > ");
		String name = sc.nextLine();
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		int result =MemberDAO.getInstance().memberAdd(member);
		
		if(result ==1) {
			System.out.println("회원등록 성공");	
		}else {
			System.out.println("회원등록 실패");
		}
		
	}

	//회원 수정
	//로그인 되어있는 정보를 수정하는지 -> 실시간으로 로그인된 정보도 바꿔줘야한다.
	//로그인 안되어있는 정보를 수정하는지
	
	public void memberUpdate() {
		
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("PW>");
		String pw = sc.nextLine();
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		
		int result = MemberDAO.getInstance().memberUpdate(member);
		
		if(result >0) {
			//실시간으로 로그인된 정보도 바꿔 줘야한다.
			if(id.equals(memberInfo.getId())) {
				memberInfo = MemberDAO.getInstance().login(id);
			}
		}else {
			System.out.println("PW 변경 실패");
		}
	}
	
	
	//회원삭제
	public void memberDelete() {
		System.out.println("삭제 ID >");
		String id = sc.nextLine();
		
		int result = MemberDAO.getInstance().memberDelete(id);
		
		if(result>0) {
			if(id.equals(memberInfo.getId())) {
				memberInfo = null;
			}
		}else {
			System.out.println("삭제완료");
		}
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		
}