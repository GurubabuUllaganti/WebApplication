package com.jsp.mvc.dao;

import com.jsp.mvc.model.Userinformation;

public interface UserinfromationDaoInf 
{
	public int registration(Userinformation userinformation);
	public Userinformation login(Userinformation userinformation);
	public int updatePassword(Userinformation userinformation);
	
}
