package org.xyz.auto.fb;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardMouse 
{
	WebDriver driver;
	
	@Test
	public void HandleFrames() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();  //launch the chrome browser
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText());
		
		//can we continue tomorrow Chris
		
		CpatureScreens.ScreenshotResult(driver,"HandleFrames");
		
	}
		
	@Test(enabled=true)
	public void HandleAlert() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();  //launch the chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		CpatureScreens.ScreenshotResult(driver,"HandleAlert1");
		
		driver.switchTo().alert().accept();
		
		CpatureScreens.ScreenshotResult(driver,"HandleAlert2");
	}
		
	@Test(enabled=false)
	public void MouseOpeartion() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();  //launch the chrome browser
		
		driver.get("https://www.mphasis.com/home.html");
		//driver.get("https://thetestingworld.com/testings/"); //60 secs
		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);  //2 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //left click
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //double click
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
	//	act.click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).perform();
	
		//keyboard+mouse (control+click)
		
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).keyUp(Keys.CONTROL).perform();
		
		int i = 20;
		
		Set<String> winid = driver.getWindowHandles();
		System.out.println(winid);
		
		Iterator<String> itr = winid.iterator();
		
		String firstwin = itr.next();
		String secondwin = itr.next();
		
		driver.switchTo().window(secondwin);
		//driver.switchTo().window(firstwin);
		
	}
	@Test(enabled=false)
	public void KeyboardOPeration() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();  //launch the chrome browser
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://thetestingworld.com/testings/"); //60 secs
		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);  //2 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
		//act.sendKeys("modisantosh@gmail.com").perform();
		
		//cltrl+a+backspace
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//pageup and pagedown
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("password").perform();
		//act.sendKeys(Keys.ENTER).perform();
	}
}
