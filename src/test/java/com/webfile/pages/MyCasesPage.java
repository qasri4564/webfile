package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCasesPage {
		
		 WebDriver ldriver;
			
			public MyCasesPage(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}
			
			@FindBy(xpath="//label[text()=\"All\"]//following::input[2]")
			WebElement searchcasetext;
			
			@FindBy(xpath="//span[@class=\"af_column_data-container\"]//*[@class=\"af_commandLink\"]")
			WebElement casenumberlink;
			
			
						
			@FindBy(xpath="//input[@type=\"file\"]")
			WebElement choosefilebttn;
			
			
			
			public void searchcase(String casenumber)
			{
				searchcasetext.sendKeys(casenumber);
			}
			
			public void Clickcasenumlink()
			{
				casenumberlink.click();
				
			}
			
			
			
			

	}



