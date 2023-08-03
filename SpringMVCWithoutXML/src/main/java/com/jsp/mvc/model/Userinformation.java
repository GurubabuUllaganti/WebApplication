package com.jsp.mvc.model;

public class Userinformation 
{
	//private int userId;
	private String FristName;
	private String LastName;
	private String DateOfBirth;
	private String Address;
	private String Email;
	private long MobileNum;
	private String UserName;
	private int Password;
	public String getFristName() 
	{
		return FristName;
	}
	public void setFristName(String fristName) 
	{
		FristName = fristName;
	}
	public String getLastName()
	{
		return LastName;
	}
	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}
	public String getDateOfBirth()
	{
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth)
	{
		DateOfBirth = dateOfBirth;
	}
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String address)
	{
		Address = address;
	}
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String email)
	{
		Email = email;
	}
	public long getMobileNum()
	{
		return MobileNum;
	}
	public void setMobileNum(long mobileNum) 
	{
		MobileNum = mobileNum;
	}
	public String getUserName() 
	{
		return UserName;
	}
	public void setUserName(String userName) 
	{
		UserName = userName;
	}
	public int getPassword() 
	{
		return Password;
	}
	public void setPassword(int password)
	{
		Password = password;
	}
	
}
