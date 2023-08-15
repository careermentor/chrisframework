package org.wipro.automation.aumw.utilitiesClass;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile 
{

	public static String readConfig(String key) throws Exception
	{
		File f = new File("./data/config.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readElement(String key) throws Exception
	{
		File f = new File("./data/element.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
}
