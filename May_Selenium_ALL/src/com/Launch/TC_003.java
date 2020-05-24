package com.Launch;

public class TC_003 extends BaseTest

{

	public static void main(String[] args) throws Exception {
		
		init();
		
		launchBrowser("chromebrowser");
		
		navigateUrl("iciciurl");
		
		driver.manage().window().maximize();
		
		String title =	driver.getTitle();
		System.out.println("The title of website is " +title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The url of website is " +currentUrl);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		driver.close();
		
		
	}

}
