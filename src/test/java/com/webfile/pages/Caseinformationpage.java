package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Caseinformationpage {

	 WebDriver ldriver;
		
		public Caseinformationpage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//a[@class=\"af_panelTabbed_tab-text-link\" and text()=\"DOCUMENTS\"]//parent::div[@class=\"af_panelTabbed_tab-content-inner\"]")
		WebElement documentstab;
		
		public void docstab()
		{
			documentstab.click();
		}

}
