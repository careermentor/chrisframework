package org.wipro.automation.aumw.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.aumw.utilitiesClass.ReadPropertiesFile;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();  //launch the chrome browser
		}
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();  //launch the chrome browser
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("safari"))
		{
			System.setProperty("webdriver.safari.driver", "./Drivers/safaridriver.exe");
			driver = new SafariDriver();  //launch the chrome browser
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();  //launch the chrome browser
		}
		
		
		driver.get(ReadPropertiesFile.readConfig("Application_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
