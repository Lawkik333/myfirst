package com.finalcut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
public class dashb extends HttpServlet
{
	public String add(String x,String y)
	{
		return ("You Entered: "+x+" and "+y);
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String un=req.getParameter("uname");
		String p=req.getParameter("pw");
		
		
		String val=add(un,p);
		
		PrintWriter out=res.getWriter();
		
		if(un.equals("loukik")&&p.equals("123"))
		{
			res.sendRedirect("home.jsp");
		}	
		else
		{
			out.println("Login Failed");
			res.sendRedirect("login.jsp?entry="+val);
		}
		
		

	}
	
}
