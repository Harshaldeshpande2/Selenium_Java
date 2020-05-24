package com.Launch;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	
	public static void main(String[] args) {
	
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshal\\Desktop\\Learning\\Selenium Ravikant Online\\Jars\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Harshal\\Desktop\\Learning\\Selenium Ravikant Online\\Jars\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		
		//System.setProperty("webdriver.ie.driver","")

	}

}
