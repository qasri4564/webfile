package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	 WebDriver ldriver;
		
		public loginpage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(id="r1:0:it1::content")
	WebElement username;
	
	@FindBy(id="r1:0:it2::content")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"r1:0:b5\"]/a")
	WebElement submitbttn;
	
	public void usrname(String usrname) 
	{
	 username.sendKeys(usrname);
	 
	}
	
	public void passwrd(String passwrd) 
	{
	 password.sendKeys(passwrd);
	 
	}
	public void submitbtn() 
	{
	 submitbttn.click();
	 
	}
		

}
