package com.vo;

import java.sql.Connection;//복습하지 마라현장에서안쓴다 .
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.util.DBConnectionMgr;

public class NoProcEmpUpdate1 extends JFrame {
   Connection con1 = null;
   Connection con2 = null;
   Connection con3 = null;
   PreparedStatement pstmt1 = null;
   PreparedStatement pstmt2 = null;
   PreparedStatement pstmt3 = null;
   ResultSet rs1 = null;
   ResultSet rs2 = null;
   String sql1 ="";
   String sql2 ="";
   String sql3 ="";
   DBConnectionMgr dbMgr = null;
   public void salUpdate(int p_empno, double v_rate) {
      String r_ename = null;
      double r_sal = 0.0;
      double r_avg_sal = 0.0;
      int result = 0;//0이면 수정 실패 1이면 수정 성공
      sql1+="SELECT ename, sal";
      sql1+=" FROM emp";
      sql1+=" WHERE empno=?";
      sql2+="SELECT avg(sal) sal FROM emp";
      sql2+=" WHERE deptno = (SELECT deptno FROM emp WHERE empno=?)";  
//      sql2+=" WHERE deptno = (SELECT deptno FROM emp WHERE empno="+p_empno+")";  
      sql3+="UPDATE emp SET sal=? WHERE empno=?";
//      sql3+="UPDATE emp SET sal=? WHERE empno="+p_empno;
      dbMgr = DBConnectionMgr.getInstance();
      try {
         con1 = dbMgr.getConnection();
         pstmt1 = con1.prepareStatement(sql1);
         pstmt1.setInt(1, p_empno);
         rs1 = pstmt1.executeQuery();
         rs1.next();
         r_ename = rs1.getString("ename");
         r_sal = rs1.getDouble("sal");
         System.out.println("입력받은 사원의 "+ r_ename+", 급여 "+r_sal);
         dbMgr.freeConnection(con1, pstmt1, rs1);
      
         con2 = dbMgr.getConnection();
         pstmt2 = con2.prepareStatement(sql2);
         pstmt2.setInt(1, p_empno);
         rs2.next();
         r_avg_sal = rs2.getDouble("sal");
         System.out.println("부서평균 급여는 "+ r_avg_sal);
         if(r_sal > r_avg_sal) {
        	 v_rate = 1.1;
         }else {
        	 v_rate = 1.2;
         }
         con3 = dbMgr.getConnection();
         pstmt3 = con3.prepareStatement(sql3);
         
      } catch(SQLException se) {
         System.out.println("[[sql1]] "+sql1);
         
      } catch (Exception e) {
         System.out.println(e.toString());
      }
   }
   public static void main(String[] args) {
      NoProcEmpUpdate1 neu1 = new NoProcEmpUpdate1();
      String user_input = JOptionPane.showInputDialog("사원번호를 입력하세요");
      int empno = 0;
      if(user_input !=null || user_input.length()>1) {
         empno = Integer.parseInt(user_input);
      }
     // neu1.salUpdate(empno);
   }

}