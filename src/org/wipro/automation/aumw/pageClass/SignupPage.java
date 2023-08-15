package org.wipro.automation.aumw.pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.aumw.utilitiesClass.ReadPropertiesFile;

public class SignupPage 
{

	WebDriver driver;
	
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	

	public void click_CreateNewAccount() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFile.readElement("create_new_account_xpath"))).click();
	}
	
	
	public void enter_FirstName(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_fisrtname_name"))).sendKeys(fname);
	}
	
	public void enter_Lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_lastname_name"))).sendKeys(lname);
	}
	
	public void click_signupbtn() throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_button_name"))).click();
	}
	
}
