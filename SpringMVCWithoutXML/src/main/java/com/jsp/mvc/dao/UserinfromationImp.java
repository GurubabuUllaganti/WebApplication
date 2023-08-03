package com.jsp.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.jsp.mvc.model.Userinformation;
@Component
public class UserinfromationImp implements UserinfromationDaoInf
{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int registration(Userinformation userinformation) 
	{
		
		String query="insert into userinformation(FristName, LastName, DateOfBirth, Address, Email, MobileNum, UserName, Password) values(?,?,?,?,?,?,?,?)";
		int result=jdbcTemplate.update
		(query, userinformation.getFristName(),
				userinformation.getLastName(),
				userinformation.getDateOfBirth()
				,userinformation.getAddress(),
				userinformation.getEmail()
				,userinformation.getMobileNum(),
				userinformation.getUserName(),
				userinformation.getPassword());
		       return result;
	}

	public Userinformation login(Userinformation userinformation) 
	{
		String login="select * from userinformation where Email=? and Password=?";
		try
		{
		Userinformation user=jdbcTemplate.queryForObject(login,new UserinformationRow(),userinformation.getEmail(),userinformation.getPassword());
		return user;
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public int updatePassword(Userinformation userinformation) 
	{
		
		String update="update userinformation set password=? where email=?";
		int result = jdbcTemplate.update(update, userinformation.getPassword(),userinformation.getEmail());
		return result;
		
	}

}
