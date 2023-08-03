package com.jsp.mvc.output;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from teca42.userinformation where email=? and password=?";
		PrintWriter writer=resp.getWriter();
		try 
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(query);
			String mail = req.getParameter("email");
			String password = req.getParameter("pass");
			ps.setString(1, mail);
			ps.setString(2, password);
			ResultSet res = ps.executeQuery();
			if(res!=null)
			{
				System.out.println("Login SuccessFully..");
				writer.println("<h1>Login SuccessFully..</h1>");
			}
			else
			{
				System.out.println("NO Data Found...");
				writer.println("<h1>NO Data Found...</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
				dispatcher.include(req, resp);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
