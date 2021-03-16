package com.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.w3c.dom.CDATASection;

public class JdbcTest {
	   //선언부
	   static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	   static final String _URL    = "jdbc:oracle:thin:@192.168.25.8:1521:orcl11";
//	   String              _USER   = "tomato80";
	   String              _USER   = "testA";
	   //String              _USER   = "scott";
	   String              _PW     = "tiger";//여기까지는 호출로 다른  클래스에서 실행가능하다 
	   
	   
	   //물리적으로 떨어져 있는 서버에 연결통로 만들기
	   Connection          con     = null;
	   //24번 서버에 내가 작성한 select문을 전달해줄 객체 선언
	   PreparedStatement   pstmt    = null;//자바에서 전달해줄 객체 선언이다 
	   //오라클의 커서를 조작하는 객체 선언
	   ResultSet           rs      = null;//오라클 테이터문서 저장폴더 
	   
	   //생성자
	   public JdbcTest() {
//		   String sql = "SELECT empno, ename, sal FROM emp";
		   String sql = "SELECT  NO, SANGHO_NAME, ADDRESS, PHONE, REGISTER_DATE FROM REGISTRATION_STATUS";
//		   String sql = "select uid, aptname, zipcode from zipcode_t";
	      try {// try에서 예외가 발생하면 catch문을 실행해라 
	         //오라클 드라이버 클래스 로딩하기
	         Class.forName(JdbcTest._DRIVER);//드라이버구동시키기 
	         System.out.println("testt");
	         //연결통로확보 하기
	         con = DriverManager.getConnection(_URL, _USER, _PW);
	         //오라클 서버에 select문을 전달할 전령 객체 생성
	         
	         pstmt = con.prepareStatement(sql);//select문을 db에 명령을 하겠다. sql이라는 변수를 pstmt에는 담긴다.
	         
	         //오라클에 살고 있는 커서 조작  위해서 자바가 제공하는 객체 생성
	         rs = pstmt.executeQuery();//실행  붕어빵 

	         EmpVO eVO = null;//뿡어빵
	         while(rs.next()) {
	            eVO = new EmpVO();
//	            int    rempno    = rs.getInt("empno");
//	            String    rename    = rs.getString("ename");
//	            double    sal    = rs.getDouble("sal");
//	            System.out.println(rempno+", "+rename+", "+sal);
	            
	            String      no     = rs.getString("no");
	            String sangho_name = rs.getString("sangho_name");
	            String        address = rs.getString("address");
	            String     phone    = rs.getString("phone");
	            String     register_date  = rs.getString("register_date");
	            System.out.println(no+", "+sangho_name+", "+address);
	            
//	            int    uid    = rs.getInt("uid");
//	            String    aptname    = rs.getString("aptname");
//	            String    zipcode    = rs.getString("zipcode");
//	            System.out.println(uid+", "+aptname+", "+zipcode);
	         }
	      } catch (ClassNotFoundException ce) {
	         System.out.println("드라이버 클래스 로딩 실패");
	         return; 
	      } catch (SQLException se) {
	         //부적합한 식별자 입니다.
	         System.out.println("SQLException:"+se.getMessage());//좀 더 구체적인 예외처리 클래스 정보를 알 수 있다.
	         
	      }
	      System.out.println("요기");
	   }
	   //오라클 서버 접속
	   public static void main(String[] args) {
	      JdbcTest jt = new JdbcTest();//생성자 호출도 동시에 일어 남니다.
	   }
	   
}