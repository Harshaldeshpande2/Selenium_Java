package com.Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC004 extends BaseTest{

	public static void main(String[] args) throws Exception {
		
		init();
		
		launchBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		/*
		 * WebElement loc= driver.findElement(By.id("twotabsearchtextbox"));
		 * loc.sendKeys("sony"); Thread.sleep(3000); loc.clear();
		 */
		
		//id locator
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		//name locator
		driver.findElement(By.name("field-keywords")).sendKeys("Phillips");
		driver.findElement(By.name("field-keywords")).clear();
		
		//classname
		
		/*
		 * driver.findElement(By.className("nav-input")).sendKeys("aaa");
		 * Thread.sleep(2000); driver.findElement(By.className("nav-input")).clear();
		 */
		//xpath
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("xpath le lo na");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		//cssselector
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("css le lo na");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		
		//linkText
		driver.findElement(By.linkText("Books")).click();
		
		//partiallinktext
		driver.findElement(By.partialLinkText("Advanced")).click();
		
		//print all links in webpage
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i =0;i<links.size();i++)
		{
			if(links.get(i).getText().isEmpty())
				{
					String linknames = links.get(i).getText();
					System.out.println(linknames);
				}
		}
	}
}
