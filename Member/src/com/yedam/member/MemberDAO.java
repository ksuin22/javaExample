package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO{
	
	//싱글톤
	
	private static MemberDAO memberDao =null;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		if(memberDao == null) {
			memberDao = new MemberDAO();	
		}
		return memberDao;
	}
	
	
	//1.로그인
	public Member login(String id) {
		//1. id가 틀렸다, pw가 틀렸다.
		
		
		Member member = null;
		try {
			conn();
			String sql="SELECT * FROM member where id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			rs = pstmt.executeQuery();
			
			//정상적으로 id가 조회가 되었을때
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return member;
		
		
	}
	
	
	
	//1.회원조회
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		Member member = null; 
		
		try {
			conn();
			String sql = "SELECT * FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return list;
	}
	
	
	
	
	//2.회원등록
	public int memberAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO member values (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, member.getId());
			pstmt.setNString(2, member.getPw());
			pstmt.setNString(3, member.getName());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	//3.회원수정 -pw 변경
	public int memberUpdate(Member member) {
		int result =0;
		try {
			conn();
			
			String sql= "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());
			result = pstmt.executeUpdate();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;	
	}
	
	//4.회원삭제
	public int memberDelete(String id) {
		int result =0;
		
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt.setString(1, id);	
			result= pstmt.executeUpdate();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
