package com.webfile.testcases;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webfile.pages.Adrmyaccountpage;
import com.webfile.pages.Fileacasepage;
import com.webfile.pages.Paymentspage;
import com.webfile.pages.loginpage;
import com.webfile.pages.webfilehomepage;

public class TC_Testfileanewcase extends BaseClass 

{
	@Test
	public void Testfileacase() throws InterruptedException, AWTException
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
	    Thread.sleep(3000);
	    
	    webfilehomepage webfhp=new webfilehomepage(driver);
	    webfhp.selectFileaNewCase();
	    
	    	    
	    Fileacasepage fileacase=new Fileacasepage(driver);
	    Thread.sleep(3000);
	    
	    fileacase.clearyourname();
	    fileacase.setyourname();
	    
	   fileacase.setareyoufilingforarbitrationprmeditaion();
	   Thread.sleep(3000);
	   fileacase.setspecialnotes();
	   Thread.sleep(3000);
	   fileacase.Clickattachfile();
	   Thread.sleep(3000);
	   choosefileonuploaddocumentwindow();
	   Thread.sleep(3000);
	   uploadfile();
	   Thread.sleep(2000);
	   desctextbox();
	   Thread.sleep(3000);
	   submitbttn();
	   Thread.sleep(3000);
	   okonpopup();
	   Thread.sleep(2000);
	   fileacase.setfilingfee();
	   Thread.sleep(3000);
	   fileacase.clicksubmitbttn();
	   Thread.sleep(2000);
	   
	   Paymentspage pp=new Paymentspage(driver);
	   pp.setFirstName(Fname);
	   Thread.sleep(2000);
	   pp.setLastName(Lname);
	   Thread.sleep(2000);
		pp.setemailid1(emailid1);
		Thread.sleep(2000);
		pp.setphoneno(phoneno);
		Thread.sleep(2000);
		pp.setCompanyName(companyname);
		Thread.sleep(2000);
		pp.setAddress(Address);
		Thread.sleep(2000);
		pp.setCityName(CityName);
		Thread.sleep(2000);
		pp.setStateName(StateName);
		Thread.sleep(2000);
		//pp.setCountryName(CountryName);
		pp.setZipCode(Zipcode);
		Thread.sleep(2000);
		pp.setCCradiobtn();
		Thread.sleep(2000);
		pp.setCCcardnumber(CCcardnumber);
		Thread.sleep(2000);
		pp.setCVV(CVV);
		Thread.sleep(2000);
		pp.setExpdatemonth(Expdatemonth);
		Thread.sleep(2000);
		pp.setExpdateyear(Expdateyear);
		Thread.sleep(2000);
		pp.setSubmitbutton();
		
		if (driver.findElement(By.xpath("//div[@class=\"noprint printBtn af_button p_AFTextOnly\"]/a")).isDisplayed())
			
			
		{
			Assert.assertTrue(true);
		}
	
	
	else 
		
	{ 
	
	Assert.assertTrue(false);
	
	}
	}
	

}
