package org.xyz.auto.fb;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataCompare 
{
	WebDriver driver;

	@Test
	public void loginFUnctionality()
	{
		
		driver = new ChromeDriver();  //launch the chrome browser
		
		driver.get("https://www.facebook.com/");  //to pass the url
		
		driver.manage().window().maximize();
		
		String ExpURL = "https://www.facebook.com/";
		
		String actURL = driver.getCurrentUrl();   //https://www.facebook.com/
		System.out.println(actURL);
	
		//Assert.assertEquals(actURL, ExpURL);  //fail - stop here  - hard assertion 
		
		SoftAssert sa =new SoftAssert();   
		sa.assertEquals(actURL, ExpURL);  //fail   //soft assertion
		
		System.out.println("this test case is going to fail");
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();  //actual page title
		
		//Assert.assertEquals(ActTitle, ExpTitle);
		sa.assertEquals(ActTitle, ExpTitle);  //soft assertion
		System.out.println("this title get matched");
		
		String Expusername = "Email address or phone number";
		
		String actUsername = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actUsername);
		sa.assertEquals(actUsername, Expusername);
		
		String ExpLogIn = "Log in";
		String ActLOgIN = driver.findElement(By.name("login")).getText();
		System.out.println(ActLOgIN);
		
		Point Actloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(Actloc);
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		sa.assertAll(); //wether pass or fail
		
		
	}
			
	
	
}
