package com.sp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.DAO.registcheckDAO;

import net.sf.json.JSONObject;


@WebServlet("/registcheckservlet")
public class registcheckservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		boolean flag=true;
		PrintWriter out=response.getWriter();
		
		registcheckDAO dao=new registcheckDAO(username);
		flag=!dao.doDAO();
		JSONObject json=new JSONObject();
		json.put("Status", flag);
		System.out.println("username="+username);
		System.out.println("flag="+!flag);
		out.print(json);
	}

}
