package org.xyz.auto.fb;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;

	@BeforeMethod()
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();  //launch the chrome browser
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://thetestingworld.com/testings/"); //60 secs
		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);  //2 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Thread.sleep(120000); //2 mins - fixed wait
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
	@Test(enabled=true)
	public void loginvalidation()
	{
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		boolean actstate= driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(actstate, false);
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //true
		
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).isEnabled());  //true
		
		int i = 20;
		
		WebElement gender = driver.findElement(By.name("sex"));
		
		Select gen = new Select(gender);
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "California"));
		
		st.selectByVisibleText("Arizona");
		
		
		
		//gen.selectByIndex(2);
		//gen.selectByValue("1");
		//gen.deselectAll();
		//gen.selectByVisibleText("Female");
		
		
		
		
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		
	//	driver.findElement(By.id("email")).clear();
		
		//driver.findElement(By.id("email")).sendKeys("user1");
		
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test(enabled=false)
	public void signupvalidation() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("password");
		
		//mobile or email
		//password
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}
