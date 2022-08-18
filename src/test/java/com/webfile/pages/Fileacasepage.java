package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fileacasepage {
	 WebDriver ldriver;
		
		public Fileacasepage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\"pt1:r1:1:r2:0:j_id-1949746096_1a89b36e::text\"]")
		WebElement FillingFormslink;
		
		@FindBy(xpath="//*[@id=\"pt1:r1:1:r1:0:j_id-1949746096_1_1a89b36e_1::text\"]")
		WebElement AAARulesandFeeslink;
		
		@FindBy(xpath="//label[text()=\"Your Name\"]//following::input[1]")
		WebElement yourname;
		
		@FindBy(xpath="//label[text()=\"Your Phone\"]//following::input[1]")
		WebElement yourphone;
		
		@FindBy(xpath="//label[text()=\"Your Email\"]//following::input[1]")
		WebElement youremail;
		
		@FindBy(xpath="//label[text()=\"Are you filing for arbitration or mediation?\"]//following::select")
		WebElement areyoufilingforarbitrationprmeditaion;
		
		@FindBy(xpath="//textarea[1]")
		WebElement specialnotes;
		
		@FindBy(xpath="//a[@class=\"floatRight ActionLink upload af_link p_AFTextOnly\"]")
		WebElement Attach;
		
		@FindBy(xpath="//label[text()=\"Enter filing fee to be charged\"]//following::input[@class=\"af_inputText_content\"]")
		WebElement filingfee;
		
		@FindBy(xpath="//span[text()=\"Submit\"]")
		WebElement submitbttn;
		
		
		public void clickfillingformslink()
		{
			FillingFormslink.click();
		
		}
		public void clickAAARulesandFeeslink()
		{
			AAARulesandFeeslink.click();
		
		}
		
		public void clearyourname()
		{
			yourname.clear();
		}
		
		public void setyourname()
		{
			yourname.sendKeys("Sridhar");
		
		}
		public void setyourphone()
		{
			yourphone.click();
		
		}
		public void setyouremail()
		{
			youremail.click();
		
		}
		public void setareyoufilingforarbitrationprmeditaion()
		{
			Select arbormed = new Select(areyoufilingforarbitrationprmeditaion);
			arbormed.selectByVisibleText("Arbitration");		
		
		}
		public void setspecialnotes()
		{
			specialnotes.sendKeys("Testing file a new case");
			
		}
		
		public void Clickattachfile()
		{
			Attach.click();
		}
		
		public void setfilingfee()
		{
			filingfee.sendKeys("100");
		}
		
		public void clicksubmitbttn()
		{
			submitbttn.click();
		}
		
		
		
}
