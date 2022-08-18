package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documentstabpage {
	
			
		WebDriver ldriver;
		
		public Documentstabpage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//a[@class=\"ActionLink upload af_link p_AFTextOnly\"]")
		WebElement uploadbttn;
		
		@FindBy(xpath="//a[@class=\"ActionLink refresh af_link p_AFTextOnly\"]")
		WebElement refreshbttn;
		
		public void uploadbtn()
		{
			uploadbttn.click();
		}
		public void refreshbtn()
		{
			refreshbttn.click();
		}
		
		
		

	}


