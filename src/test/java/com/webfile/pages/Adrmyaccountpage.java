package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adrmyaccountpage {
	
      WebDriver ldriver;
	
	public Adrmyaccountpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//*[@id=\"block-adrorg-headersubmenu\"]/ul/li[1]/a")
	WebElement myaccountbttn;
	

	public void clickmyaccountbttn()
	{
		myaccountbttn.click();
	}
	
		

}
