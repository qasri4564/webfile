package com.webfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Paymentspage {
WebDriver ldriver;
	
	public Paymentspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//label[text()=\"Email\"]//preceding::input[@class=\"af_inputText_content\"]")
	WebElement firstname;
	@FindBy(xpath="//label[text()=\"Phone Number\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement lastname;
	@FindBy(xpath="//label[text()=\"Company\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement email;
	@FindBy(xpath="//label[text()=\"City\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement phonenum;
	@FindBy(xpath="//label[text()=\"Address\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement company;
	@FindBy(xpath="//label[text()=\"State\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement address;
	@FindBy(xpath="//label[text()=\"Country \"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement city;
	@FindBy(xpath="//label[text()=\"Zip/Postal Code\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement state;
	@FindBy(xpath="//label[text()=\"Country \"]//following::select[1]")
	WebElement country;
	@FindBy(xpath="//label[text()=\"Last Name\"]//preceding::input[@class=\"af_inputText_content\"][1]")
	WebElement zipcode;
	//Creditcard Radio button
	@FindBy(xpath="//label[text()=\"Credit Card\"]//preceding::input[@class=\"af_selectOneRadio_native-input\"][1]")
	WebElement ccradiobttn;
	//Bankaccount or echeck radio button
	@FindBy(xpath="//label[text()=\"Bank Account/eCheck (USA only) - Limit of $100,000.00 per transaction\"]//preceding::input[@class=\"af_selectOneRadio_native-input\"][1]")
	WebElement bankacctradiobttn;
	
	@FindBy(xpath="//label[text()=\"Card Number\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement cardnumber;
	
	@FindBy(xpath="//label[text()=\"CVV\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement cvv;
	@FindBy(xpath="//label[text()=\"Expiration Date\"]//following::select[@class=\"af_selectOneChoice_content\"][1]")
	WebElement expdatemonth;
	@FindBy(xpath="//label[text()=\"Expiration Date\"]//following::select[@class=\"af_selectOneChoice_content\"][2]")
	WebElement expdateyear;
	//Bankname for echeck
	@FindBy(xpath="//label[text()=\"Bank Name\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement bankname;
	@FindBy(xpath="//label[text()=\"Name On Account\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement nameonaccount;
	@FindBy(xpath="//label[text()=\"Account Number\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement accountnumber;
	@FindBy(xpath="//label[text()=\"ABA Routing Number\"]//following::input[@class=\"af_inputText_content\"][1]")
	WebElement abaroutingnumber;
	@FindBy(xpath="//label[text()=\"Bank Account Type\"]//following::select[@class=\"af_selectOneChoice_content\"]")
	WebElement bankaccounttype;
	
	@FindBy(xpath="//*[@class=\"ANBtn af_button p_AFTextOnly\"]//span[text()='Cancel']")
	WebElement cancelbttn;
	@FindBy(xpath="//*[@class=\"ANBtn af_button p_AFTextOnly\"]//span[text()='Submit']")
	WebElement submitbttn;
	
	public void setFirstName(String Fname)
	{
		firstname.sendKeys(Fname);
	}
	
	public void setLastName(String Lname)
	{
		lastname.sendKeys(Lname);
	}
	public void setemailid1(String emailid1)
	{
		email.sendKeys(emailid1);
	}
	public void setphoneno(String phoneno)
	{
		phonenum.sendKeys(phoneno);
	}
	public void setCompanyName(String companyname)
	{
		company.sendKeys(companyname);
	}
	public void setAddress(String Address)
	{
	    address.sendKeys(Address);
	}
	public void setCityName(String CityName)
	{
		city.sendKeys(CityName);
	}
	public void setStateName(String StateName)
	{
		state.sendKeys(StateName);
	}
	public void setCountryName(String CountryName)
	{
		Select countryname = new Select(country);
		countryname.selectByVisibleText(CountryName);
	}
	
	public void setZipCode(String ZipCode)
	{
		zipcode.sendKeys(ZipCode);
	}
	public void setCCradiobtn()
	{
		ccradiobttn.click();
	}
	public void setBankacctradiobtn()
	{
		bankacctradiobttn.click();
	}
	public void setCCcardnumber(String CCcardnumber)
	{
		cardnumber.sendKeys(CCcardnumber);
	}
	public void setCVV(String CVV)
	{
		cvv.sendKeys(CVV);
	}
	public void setExpdatemonth(String Expdatemonth)
	{
		expdatemonth.sendKeys(Expdatemonth);
	}
	public void setExpdateyear(String Expdateyear)
	{
		expdateyear.sendKeys(Expdateyear);
	}
	public void setBankName(String BankName)
	{
		bankname.sendKeys(BankName);
	}
	public void setNameonAccount(String NameonAccount)
	{
		nameonaccount.sendKeys(NameonAccount);
	}
	public void setAccountno(String Accountno)
	{
		accountnumber.sendKeys(Accountno);
	}
	public void setABAroutingnum(String ABAroutingnum)
	{
		abaroutingnumber.sendKeys(ABAroutingnum);
	}
	public void setBankAccountType(String BankAccountType)
	{
		Select bankaccttype = new Select(bankaccounttype);
		bankaccttype.selectByVisibleText(BankAccountType);
	}
	
	public void setCancelbutton()
	{
		cancelbttn.click();
	}
	public void setSubmitbutton()
	{
		submitbttn.click();
	}
	

}
