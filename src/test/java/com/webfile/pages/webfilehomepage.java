package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webfilehomepage {
	
	 WebDriver ldriver;
		
		public webfilehomepage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath ="//*[@class=\"dashBoardBtnInner af_link\"]//span[text()=\"View My Cases\"]")
		WebElement viewmycasesbttn;
		
		@FindBy(xpath ="//*[@class=\"dashBoardBtnInner af_link\"]//span[text()=\"View Pending Tasks\"]")
		WebElement viewpendingtasksbttn;
		

		@FindBy(xpath="//*[@class='dashBoardBtnInner af_link']//span[text()='File a New Case']")
		WebElement fileanewcase;
		
		@FindBy(xpath ="//*[@class=\"dashBoardBtnInner af_link\"]//span[text()=\"View All Open Invoices\"]")
		WebElement viewallopeninvoices;
		
		@FindBy(xpath ="//*[@class=\"dashBoardBtnInner af_link\"]//span[text()=\"View My Calendar\"]")
		WebElement viewmycalender;
		
		public void selectViewMyCases()
		{
			viewmycasesbttn.click();
		}
		public void selectViewPendingTasks()
		{
			viewpendingtasksbttn.click();
		}
		public void selectFileaNewCase()
		{
			fileanewcase.click();
		}
		public void selectViewAllOpenInvoices()
		{
			viewallopeninvoices.click();
		}
		public void selectViewMyCalender()
		{
			viewmycalender.click();
		}
		

}
