package common.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.util.DBConnectionMgr;

public class MeberDao {
  Connection con = null;
  CallableStatement cstmt = null;
  DBConnectionMgr dbMgr = null;
  public void login(String p_id, String p_pw) {
	  dbMgr = DBConnectionMgr.getInstance();
	  try {
		  con = dbMgr.getConnection();
		  cstmt = con.prepareCall("{call proc_login80(?,?,?)}");
		  cstmt . setString(1,p_id);
		  
		  
	  }
	  
	  
	  
	  
	 
  }
}
