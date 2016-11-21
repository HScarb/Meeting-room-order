package com.sp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.DAO.mtrchooseDAO;

import net.sf.json.JSONObject;


@WebServlet(asyncSupported = true, urlPatterns = { "/mtrchooseservlet" })
public class mtrchooseservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public mtrchooseservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		JSONObject jsmain=new JSONObject();
		PrintWriter out=response.getWriter();
		response.setCharacterEncoding("UTF-8");
		mtrchooseDAO dao=new mtrchooseDAO();
		jsmain=dao.doDAO();
		for(int i=0;jsmain.optJSONObject("mtr"+i)!=null;i++)
			System.out.println(jsmain.getJSONObject("mtr"+i).getString("mtrnumber").toString());
		out.print(jsmain);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
