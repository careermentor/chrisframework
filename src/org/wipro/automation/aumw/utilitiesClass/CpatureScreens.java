package org.wipro.automation.aumw.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CpatureScreens 
{
	public static void ScreenshotResult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;   //prtscr
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
