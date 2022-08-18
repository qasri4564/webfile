package com.webfile.testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webfile.pages.Adrmyaccountpage;
import com.webfile.pages.loginpage;

public class TC_Testwebfilelogin_01 extends BaseClass{
	
	
	@Test
	public void Testuserlogin() throws InterruptedException
	
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
		//Thread.sleep(2000);
		lp.usrname(usrname);
		//Thread.sleep(3000);
		lp.passwrd(passwrd);
		//Thread.sleep(3000);
		lp.submitbtn();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//*[@id=\"pt1:r1:0:l4\"]")).isDisplayed())
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
	
	}
}
	
	
	
	
	


