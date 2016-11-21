package com.sp.Servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.DAO.MyDAO;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }
    
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String psd=request.getParameter("password");
		JSONObject json=new JSONObject();
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out=response.getWriter();
		
		System.out.println("username="+name);
		System.out.println("psd="+psd);
		
		MyDAO mydao=new MyDAO(name, psd);
		json=mydao.doDAO();
		
		
		System.out.println("name="+json.getString("name").toString());
		System.out.println("unit="+json.getString("unit").toString());
		System.out.println("Status="+json.getString("Status").toString());
		System.out.println("isadmin="+json.getString("isadmin").toString());
		out.print(json);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

}
