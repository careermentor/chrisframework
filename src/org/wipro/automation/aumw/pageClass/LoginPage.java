package org.wipro.automation.aumw.pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.aumw.utilitiesClass.ReadPropertiesFile;

public class LoginPage 
{

	WebDriver driver;
	
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFile.readElement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbtn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesFile.readElement("login_loginbttn_css"))).click();
	}
	
}
