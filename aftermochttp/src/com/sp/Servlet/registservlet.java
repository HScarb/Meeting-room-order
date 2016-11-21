package com.sp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.DAO.registDAO;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class registservlet
 */
@WebServlet("/registservlet")
public class registservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String unit=request.getParameter("unit");
		String isadmin=request.getParameter("isadmin");
		
		boolean isadmin_flag=false;
		if(isadmin.equals("false")){
			isadmin_flag=false;
		}
		else
			isadmin_flag=true;
		
		boolean flag=false;
		PrintWriter out=response.getWriter();
		
		
		System.out.println("username="+username);
		System.out.println("password="+password);
		System.out.println("name="+name);
		System.out.println("unit="+unit);
		System.out.println("isadmin="+isadmin);
		
		
		registDAO dao=new registDAO(username, password, name, unit,isadmin_flag);
		flag=dao.doDAO();
		JSONObject json=new JSONObject();
		json.put("Status", flag);
		System.out.println("flag="+flag);
		out.print(json);
		
	}

}
