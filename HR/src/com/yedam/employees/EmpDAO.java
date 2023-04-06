package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO extends DAO{
	
	//java ->JDBC -> DB -> Employees Table에 접근
	//Employees 조회, 추가, 수정, 삭제(CRUD)
	
	//SingleTon
	private static EmpDAO empDao = null;
	
	private EmpDAO() {
		
	}

	public static EmpDAO getInstance() {
		if(empDao ==null) {
			empDao = new EmpDAO();
		}
		return empDao;
	}
	
	
	//CRUD
	
	//1.전체조회
	//SELECT *FROM employees;
	//EmpDTO 객체1개 = 1개 row
	//list => EmpDTO 객체를 담아서 사용. =>전체 row를조회
	
	public List<EmpDTO> getEmployeesList() {
		//list,set,map
		//list ->순서
		
		List<EmpDTO> list = new ArrayList<>();
		//list[0] ->첫번째 row
		//list[1] ->두번째 row..
		EmpDTO emp = null;
		
		try {
			conn();
			String sql = "SELECT * FROM employees";
			//SELECT문 사용시
			//1.statement => where 조건이 없으면 쓰기편함.
			//"SELECT * FROM employees where hire_data" +data
			
			//2.preparedStatement => where 조건이 있어도 쓰기편함. 
			
			stmt = conn.createStatement();
			
			//SQL실행
			rs = stmt.executeQuery(sql);
			
			//SQL결과조회
			//ResultSet -> next() - 다음 row가 존재하면 true, 아니면false
			while(rs.next()) {
				//서로다른 row를 서로다른객체에 저장하기위해서 
				emp = new EmpDTO();
											//조회된 결과의컬럼명
				emp.setEmployeeId(rs.getInt("employee_id"));					
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));				
				
				list.add(emp);
				
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn(); //접속해제
		}
		return list;		
	}
	
	
	//2.단건 조회
	public EmpDTO getEmployee(int employeeId) {
		EmpDTO emp = null;
		try {
			conn();
			
			String sql="SELECT * FROM employees"
					+ " WHERE employee_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp = new EmpDTO();
					
				emp.setEmployeeId(rs.getInt("employee_id"));					
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
			}
			
			
		}catch (Exception e) {
			e.printStackTrace(); //오류나면추적해서 출력해
		}finally {
			disconn();
		}
		
		// emp == null인 경우 -> if문에서 rs.next() ==false -> 데이터 조회 X
		// emp != null인 경우 -> if문에서 rs.next() ==true  -> 데이터 조회 O
		
		return emp;
		
	}
	
	
	//3.추가
	public int empAdd(EmpDTO emp) {
		//데이터 입력후 제대로 들어갔는지 사용하기 위한 용도
		//1행이 입력되었습니다. => result = 1;
		
		int result =0;
		try {
			conn();
			//not null조건인거
			String sql = "INSERT INTO emplyees"
					+"(employee_id, last_name, email,hire_date, job_id"
					+ "VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId()); //숫자는 ?위치
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			
			//DML사용할때 쓰는 메소드
			//반환값이 1 또는 0
			//1 :데이터 정상 입력
			//0 :데이터 정상 입력 안됨
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
				
		return result;
		
	}
	
	
	//4.수정
	public int empUpdate(EmpDTO emp) {
		int result = 0;
		try {
			conn();
			String sql= "update employees set salary = ? where employee_id = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	
	
	//5.삭제
	public int empDelete(int employeeId) {
		int result =0;
		try {
			conn();
			String sql = "delete from employees where employee_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			result = pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
			
		}
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

