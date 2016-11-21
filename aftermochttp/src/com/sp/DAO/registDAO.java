package com.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registDAO {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
	private String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=MetOrderSystem";  //连接服务器和数据库test
	private String sqluserName = "sa";  //默认用户名
	private String sqluserPwd ="123456";  //密码
	
	private String username=null;
	private String password=null;
	private String name=null;
	private String unit=null;
	private boolean isadmin;
	
	public registDAO(String username, String password,String name,String unit,boolean isadmin){
		this.username=username;
		this.password=password;
		this.name=name;
		this.unit=unit;
		this.isadmin=isadmin;
	}
	
	
	public boolean doDAO(){
		boolean flag =false;
		
		try {
			Class.forName(driverName);
			Connection conn =DriverManager.getConnection(dbURL, sqluserName, sqluserPwd);
			
			String sql="INSERT INTO Users (username,password,name,unit,isadmin) VALUES ('"+username+"','"+
			password+"','"+name+"','"+unit+"','"+isadmin+"')";
			PreparedStatement ps=conn.prepareStatement(sql);
			int a=ps.executeUpdate();
			if(a>0){
				flag=true;
			}
			return flag;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return flag;
	}
}
