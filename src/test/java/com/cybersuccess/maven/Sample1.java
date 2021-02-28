package com.cybersuccess.maven;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Sample1 {
 
	@Test
	public void browser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.quit();
	}

	}


