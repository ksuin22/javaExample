package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO2 {
	
	//
	protected Connection conn = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstmt =null;
	protected Statement stmt = null;
	
	
	//DB 접속정보
	String driver ="oracle.jdbc.driver.OracleDriver";	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "hr";
	String pw = "hr";
	
	
	//DB 연결
	public void conn() {
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			
			//DB연결
			conn = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//DB연결 해제
	public void disconn() {
		try {
			//결과 조회하는 객체
			if(rs != null) {
				rs.close();
			}
			//sql 실행하는 객체
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			//db 연결 객체
			if(conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
