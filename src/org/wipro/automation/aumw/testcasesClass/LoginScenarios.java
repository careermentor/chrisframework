package org.wipro.automation.aumw.testcasesClass;

import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClass.InitiateBrowser;
import org.wipro.automation.aumw.pageClass.LoginPage;

public class LoginScenarios  extends InitiateBrowser
{

	@Test
	public void tc01_logunfunctionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("use1");
		login.enter_password("pass1");
		login.click_loginbtn();
		
	}
	
}
