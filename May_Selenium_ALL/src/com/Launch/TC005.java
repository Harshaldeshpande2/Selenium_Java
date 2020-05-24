package com.Launch;

import org.openqa.selenium.By;

public class TC005 extends BaseTest{

	public static void main(String[] args) throws Exception {
		

		init();
		
		launchBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtext_name","Harry Potter");
		
		elementClick("amazonsearchbutton_xpath");
			
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
	

	}

	
}
