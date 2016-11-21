package com.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.sf.json.JSONObject;

public class mtrchooseDAO {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
	private String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=MetOrderSystem";  //连接服务器和数据库test
	private String sqluserName = "sa";  //默认用户名
	private String sqluserPwd ="123456";  //密码
	
	public JSONObject doDAO(){
		JSONObject jsmain=new JSONObject();
		try {
			
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(dbURL, sqluserName, sqluserPwd);
			String sql="SELECT * FROM MtrProperty";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			int i=0;
			
			for(i=0;rs.next();i++){
				JSONObject jsnew=new JSONObject();
				jsnew.put("mtrnumber", rs.getString("mtrnumber").toString());
				jsnew.put("mtrname", rs.getString("mtrname").toString());
				jsnew.put("meetingtable", rs.getString("meetingtable").toString());
				jsnew.put("peoplenumber", rs.getString("peoplenumber").toString());
				jsnew.put("media", rs.getString("media").toString());
				jsnew.put("microphone", rs.getString("microphone").toString());
				jsnew.put("whiteboard", rs.getString("whiteboard").toString());
				jsnew.put("blackboard", rs.getString("blackboard").toString());
				jsnew.put("aircondition", rs.getString("aircondition").toString());
				jsmain.putOpt("mtr"+i, jsnew);
			}
			return jsmain;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return jsmain;
		
	}
}
