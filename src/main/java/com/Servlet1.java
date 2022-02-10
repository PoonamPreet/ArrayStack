package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		PrintWriter out=	response.getWriter();
		out.write("<h1>Accessing config param in servlet 1</h1>");
		out.write("sql="+config.getInitParameter("sql"));
		out.write("<br/>Message="+config.getInitParameter("message"));
		out.println("<h1> Accessing content parameters in servlet1	</h1>");
		ServletContext application =getServletContext();
		out.println("<br/>driver=" + application.getInitParameter("driver"));
		out.println("<br/>url=" + application.getInitParameter("url"));
	}

}
