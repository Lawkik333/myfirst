package com.finalcut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dashboard extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String un=req.getParameter("uname");
		String p=req.getParameter("pw");
		PrintWriter out=res.getWriter();
		if(un.equals("loukik")&&p.equals("123"))
		out.println("Login Success");
		else
			out.println("Wrong Password");
		
		
	}
}
