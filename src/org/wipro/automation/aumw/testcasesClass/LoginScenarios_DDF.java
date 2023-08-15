package org.wipro.automation.aumw.testcasesClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClass.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerators.TestDataGenerator;
import org.wipro.automation.aumw.pageClass.LoginPage;

public class LoginScenarios_DDF  extends InitiateBrowser
{

	@Test(dataProvider="staticdata", dataProviderClass=TestDataGenerator.class)
	public void tc01_logunfunctionality(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbtn();
		
	}
	
	
	
	
	
	
}
