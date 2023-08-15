package org.wipro.automation.aumw.testcasesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClass.InitiateBrowser;
import org.wipro.automation.aumw.pageClass.SignupPage;

public class SignupFunctioality  extends InitiateBrowser
{

	@Test
	public void tc02_Signupfunctionality() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_CreateNewAccount();
		sign.enter_FirstName("Selenium");
		sign.enter_Lastname("Java");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("15");
		
		sign.click_signupbtn();
		
	}
	
}
