package com.sp.DAO;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import net.sf.json.JSONObject;

public class MyDAO {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
	private String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=MetOrderSystem";  //连接服务器和数据库test
	private String sqluserName = "sa";  //默认用户名
	private String sqluserPwd ="123456";  //密码
	private boolean flag;
	String name=null;
	String psw=null;
	
	public MyDAO(String username,String password) {
		// TODO Auto-generated constructor stub
		this.name=username;
		this.psw=password;
		
	}
	
	
	
	public JSONObject doDAO(){
		String flag="false";
		JSONObject jsobj=new JSONObject();
		try {
			
			
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(dbURL, sqluserName, sqluserPwd);
			
			String sql="SELECT * FROM Users WHERE username='"+name+"' and password='"+psw+"'";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			
			
			
			
			while(rs.next()){
				System.out.println("name="+rs.getString("name").toString());
				System.out.println("unit="+rs.getString("unit").toString());
				
				jsobj.put("username", rs.getString("username").toString());
				jsobj.put("name", rs.getString("name").toString());
				jsobj.put("unit", rs.getString("unit").toString());	
				jsobj.put("isadmin", rs.getString("isadmin"));
				flag="true";
			}
			jsobj.put("Status", flag);
			System.out.println(jsobj.getString("Status").toString());
			return jsobj;
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsobj;
	}
}
