package com.webfile.testcases;

import java.awt.AWTException;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.webfile.pages.Adrmyaccountpage;
import com.webfile.pages.Caseinformationpage;
import com.webfile.pages.Documentstabpage;
import com.webfile.pages.MyCasesPage;
import com.webfile.pages.loginpage;
import com.webfile.pages.webfilehomepage;

public class TC_Testuploaddocument extends BaseClass {
	
	@Test(enabled=false)
	public void documentupload() throws InterruptedException, AWTException
	{
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"popup-buttons\"]/button")).click();
		
		Adrmyaccountpage actpg = new Adrmyaccountpage(driver);
		
		actpg.clickmyaccountbttn();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	    driver.findElement(By.xpath("//*[@id=\"r1:0:pt_b2\"]/a")).click();
		
		loginpage lp= new loginpage(driver);
		lp.usrname(usrname);
		lp.passwrd(passwrd);
		lp.submitbtn();
	    
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"dashBoardBtnInner af_link\"]//span[text()=\"View My Cases\"]")));
		    
	    webfilehomepage wh= new webfilehomepage(driver);
	    wh.selectViewMyCases();
	    Thread.sleep(2000);
	        	    
	    MyCasesPage mcp= new MyCasesPage(driver);
	    
	    mcp.searchcase(casenumber);
	    mcp.Clickcasenumlink();
	    Thread.sleep(2000);
	    
	    Caseinformationpage caseinfo = new Caseinformationpage(driver);
	    caseinfo.docstab();
	    Thread.sleep(2000);
	    
	    Documentstabpage dp=new Documentstabpage(driver);
	    dp.uploadbtn();
	    Thread.sleep(2000);
	   
	    try
	    {
	    	choosebttnfileupload();
		    Thread.sleep(2000);
		    uploadfile();
		    Thread.sleep(2000);
		    descboxfileupload();
		    Thread.sleep(2000);
		    submitonfileupload();
		    Thread.sleep(2000);
	    }catch (NoSuchElementException NE)
	    {
	    	choosebttnfileupload();
		    Thread.sleep(2000);
		    uploadfile();
		    Thread.sleep(2000);
		   // descboxfileupload();
		   // Thread.sleep(2000);
		    submitonfileupload();
		    Thread.sleep(2000);
	    }
	    
	   //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"popSave af_button p_AFTextOnly\"]//a[@class=\"af_button_link\"]")));
	    
	    
	    /*choosebttnfileupload();
	    Thread.sleep(2000);
	    uploadfile();
	    Thread.sleep(2000);
	    submitonfileupload();
	    Thread.sleep(4000);*/
	    okpopuponfileupload();
	    Thread.sleep(4000);
	    dp.refreshbtn();
	   /* WebElement wb = driver.findElement(By.xpath("//div[@class=\"af_table_data-body\"]//table//tr[1]//td[6]"));
	    String st= wb.getText();
	    System.out.println(st);
	    
		if(st.equals(docdescription))
		{
			Assert.assertTrue(true);
		}
		
	else { 
	
	Assert.assertTrue(false);
	
	}*/
	  		
		
	}
	
		

}
