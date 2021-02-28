package com.cybersuccess.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class NewTest {
      
	 @Test
		 public void browser()
		 {
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.rediff.com");
			 driver.quit();
		 }

	}

