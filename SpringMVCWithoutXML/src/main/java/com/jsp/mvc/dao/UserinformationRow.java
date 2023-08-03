package com.jsp.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.mvc.model.Userinformation;

public class UserinformationRow implements RowMapper<Userinformation>
{

	public Userinformation mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Userinformation user =new Userinformation();
		user.setFristName(rs.getString(1));
		user.setLastName(rs.getString(2));
		user.setDateOfBirth(rs.getString(3));
		user.setAddress(rs.getString(4));
		user.setEmail(rs.getString(5));
		user.setMobileNum(rs.getLong(6));
		user.setUserName(rs.getString(7));
		user.setPassword(rs.getInt(8));
		return user;
	}

}
