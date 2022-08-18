package com.webfile.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import util.ReadConfig;


import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class BaseClass

{
	
	ReadConfig readconfig= new ReadConfig();
	
	public String baseurl = readconfig.getApplicationURL();
	public String usrname = readconfig.getusername();
	public String passwrd = readconfig.getpassword();
	
	public String Fname="Sridhar";
	public String Lname="Rangu";
	public String emailid1="sridhar.rangu@zensar.com";
	public String phoneno="9876543212";
	public String companyname = "Zen";
	public String Address = "paris street";
	public String CityName = "hyd";
	public String StateName = "Alaska";
	public String CountryName = "United States Of America";
	public String Zipcode = "22394";
	public String CCcardnumber = "4111111111111111";
	public String CVV = "432";
	public String Expdatemonth = "Dec";
	public String Expdateyear = "2022";
	public String BankName = "abc";
	public String NameonAccount = "sri";
	public String Accountno = "4111111111111111";
	public String ABAroutingnum = "091000019";
	public String BankAccountType= "Personal Savings";
	
	public String casenumber = "012200000631";
	public String docdescription = "Test upload Automation";
	
	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	
	@BeforeClass
	public void setup()
	{
				
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver=new ChromeDriver();
		
					
		}
	
			
	public void choosefileonuploaddocumentwindow()
	{
		driver.findElement(By.xpath("//*[@class='af_inputFile_multiple-upload-toolbar']")).click();
		
	}
	
	public void desctextbox()
	{
		WebElement descbox = driver.findElement(By.xpath("//*[@class=\"uifields af_inputText\"]/td[2]/input"));
		descbox.sendKeys("Testautomation");
	}
	
	public void uploadfile() throws AWTException
	{
		Robot rb = new Robot();
		
		StringSelection str = new StringSelection("D:\\Sridhar\\jds.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     
	    //release Contol+V for pasting
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	 	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void okonpopup()
	{
		driver.findElement(By.xpath("//div[@class=\"documentUploadSuccessPop af_dialog\"]//child::a[@class='af_button_link']")).click();
	}
	
	public void submitbttn()
	{
		driver.findElement(By.xpath("//*[@class=\"btnSubmit af_button p_AFTextOnly\"]/a")).click();
	}
	
	
	public void choosebttnfileupload()
	{
		driver.findElement(By.xpath("//*[@class=\"af_inputFile_multiple-upload-toolbar\"]")).click();
	}
	
	public void descboxfileupload()
	{		
		driver.findElement(By.xpath("//label[text()=\"Description\"]//following::input[@class=\"af_inputText_content\"]")).sendKeys(docdescription);
	}
	public void submitonfileupload()
	{
		driver.findElement(By.xpath("//div[@class=\"popSave af_button p_AFTextOnly\"]//a[@class=\"af_button_link\"]")).click();
	}
	public void okpopuponfileupload()
	{
		driver.findElement(By.xpath("//span[text()=\"PLEASE NOTE:\"]//following::a[@class=\"af_button_link\"][1]")).click();
	}
	
	public void selectinvoicerecord()
	{
		driver.findElement(By.xpath("//tr[@class=\"af_table_data-row p_AFSelected\"]//input[@class=\"af_selectBooleanCheckbox_native-input\"]")).click();
		
	}
	
	public void clickonsubmit()
	{
		driver.findElement(By.xpath("//a[@class=\"af_button_link\"]//span[text()=\"Pay Online\"]")).click();
		
	}
	


	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	}

