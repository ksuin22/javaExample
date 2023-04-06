package com.yedam.departments;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO2;


public class DptDAO extends DAO2 {
	
	
	//CRUD
	
	//SingleTon
	private static DptDAO dptDao = null;
	private DptDAO() {
		
	}
	
	public static DptDAO getInstance() {
		if(dptDao ==null) {
			dptDao = new DptDAO();
		}
		return dptDao;
		
		
	}
	
	
	//1.전체조회
	public List<DptDTO> getDptList(){
		
		List<DptDTO> list = new ArrayList<>();
		DptDTO dpt = null;
		
		try {
			conn();
			String sql ="SELECT * FROM departments";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dpt = new DptDTO();
				dpt.setDptId(rs.getInt("DEPARTMENT_ID"));					
				dpt.setDptName(rs.getString("DEPARTMENT_NAME"));
				dpt.setManager(rs.getString("MANAGER_ID"));
				dpt.setLocation(rs.getString("LOCATION_ID"));
				
				list.add(dpt);
			
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return null;
		
	}

	
	
	
	
	//2.단건조회
	public DptDTO getDpt(int dptId) {
		DptDTO dpt = null;
		try {
			conn();
			String sql = "SELECT * FROM departments"
					+ " WHERE department_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dptId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dpt = new DptDTO();
					
				dpt.setDptId(rs.getInt("DEPARTMENT_ID"));					
				dpt.setDptName(rs.getString("DEPARTMENT_NAME"));
				dpt.setManager(rs.getString("MANAGER_ID"));
				dpt.setLocation(rs.getString("LOCATION_ID"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return dpt;
	}
	
	//3.추가
	
		
		
		
		
		
	


	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
