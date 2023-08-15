package org.xyz.auto.fb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicOPerations 
{
	WebDriver driver;

	@Test
	public void launchBrowser()
	{
		
		driver = new ChromeDriver();  //launch the chrome browser
		
		driver.get("https://www.facebook.com/");  //to pass the url
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");  //to pass the url
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	
		driver.close();  //close the single window
		driver.quit(); ///will close multiple window
		
	}
			
	
	
}
