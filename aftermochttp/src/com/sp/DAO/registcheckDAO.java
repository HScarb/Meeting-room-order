package com.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registcheckDAO {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动
	private String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=MetOrderSystem";  //连接服务器和数据库test
	private String sqluserName = "sa";  //默认用户名
	private String sqluserPwd ="123456";  //密码
	
	private String username=null;
	
	public registcheckDAO(String username){
		this.username=username;
	}
	
	public boolean doDAO(){
		boolean flag=false;
		
		try {
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(dbURL, sqluserName, sqluserPwd);
			
			String sql="SELECT * FROM Users WHERE username='"+username+"'";
			PreparedStatement ps =conn.prepareStatement(sql);
			
			ResultSet re=ps.executeQuery();
			while(re.next()){
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
