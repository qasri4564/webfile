package com.webfile.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webfile.pages.Adrmyaccountpage;
import com.webfile.pages.loginpage;
import com.webfile.pages.webfilehomepage;

public class TC_Testviewmytasks extends BaseClass {
	
	@Test
	public void Testviewmytasks() throws InterruptedException
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
	    webfhp.selectViewPendingTasks();
	    
	    
	}
	
	

}
