package com.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registcheckDAO {
	private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //����JDBC����
	private String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=MetOrderSystem";  //���ӷ����������ݿ�test
	private String sqluserName = "sa";  //Ĭ���û���
	private String sqluserPwd ="123456";  //����
	
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
