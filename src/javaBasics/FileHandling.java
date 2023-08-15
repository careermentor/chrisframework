package javaBasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		File f = new File("./data/test.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load this file into memory
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("langaunage"));
		
		System.out.println(prop.get("URL"));
		
	}

	public void writedata() throws Exception
	{
		File f = new File("./data/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line");
		fw.flush();   //save
		fw.close();
		
	}
	
	public void readdata() throws Exception
	{
		//File f = new File("./data/abc.txt");  //connection
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("./data/abc.txt");
		
		int r = fr.read();  ///73
		
		
		
		while(r!=-1)   //73!=-1, true, 110!=-1, true, r=-1, -1!=-1 false   //loop in java
		{
			System.out.print((char)r);  //In
			r=fr.read(); //110
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		FileHandling fh = new FileHandling();
		//fh.readdata();
		//fh.writedata();
		FileHandling.readprop();
	}
}
