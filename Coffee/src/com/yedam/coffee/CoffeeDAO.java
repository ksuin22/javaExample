package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO{
	
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO () {
		
	}
	
	
	public static CoffeeDAO getInstance() {
		if(coffeeDao ==null) {
			coffeeDao = new CoffeeDAO();
		}
		return coffeeDao;
	}
	
	
	
	//1.메뉴조회
	
	public List<Coffee> getCoffeeList() { 
		
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		
		try {
			conn();
			String sql = "SELECT * FROM coffee";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				coffee= new Coffee();
				coffee.setCoffeeExp(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExp(rs.getString("coffee_explain"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;	
	}
	
	
	//2.메뉴 상세조회
	
	public Coffee getCoffee(String coffeeMenu) {
		Coffee cof=null;
		try {
			conn();
			String sql ="SELECT * FROM coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,coffeeMenu);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cof = new Coffee();
				cof.setCoffeeMenu(rs.getString("coffee_menu"));
				cof.setCoffeePrice(rs.getInt("coffee_price"));
				cof.setCoffeeExp(rs.getString("coffee_explain"));
				cof.setCoffeeSales(rs.getInt("coffee_sales"));
			}			
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			disconn();
		}
		
		return cof;
	}
	
	
	//3.메뉴등록
	public int getcoffeeAdd(Coffee cof) {
		int result =0;
		
		try {
			conn();
			String sql= "Insert into coffee values (?,?,?,0)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cof.getCoffeeMenu());
			pstmt.setInt(2, cof.getCoffeePrice());
			pstmt.setString(3, cof.getCoffeeExp());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//4.판매
	public int getcoffeeSal(int sal) {
		int result =0;
		try {
			conn();
			String sql = "select ";
			pstmt =conn.prepareStatement(sql);
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}		
		return result;
	}
	
	
	
	
	
	
	
	//5.메뉴삭제
	
	public int getcoffeeDel(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql= "delete from coffee where coffee_menu = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			
			result= pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();	
		}		
		return result;
		
		
	}
	
	
	//6.매출
	
	
//	public int Coffee(int coffeePrice) {
//		int result = 0;
//		try {
//			conn();
//			String sql = ""
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			disconn();	
//		}		
//		return result;
//	}
	
	
	
	
	
	
	
	
	
	
	
}
