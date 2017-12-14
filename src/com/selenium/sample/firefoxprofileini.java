package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firefoxprofileini {
	
	@Test(dataProvider="getdata")
	public void browserlanch(String Browser,String UserName)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Ishwarya\\Selenium Test Envir\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Ishwarya\\Selenium Test Envir\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Ishwarya\\Selenium Test Envir\\IEdriver\\MicrosoftWebDriver.exe");
		WebDriver driver=null;
		if(Browser.equals("Mozilla")){
			ProfilesIni pro=new ProfilesIni();
			FirefoxProfile fx=pro.getProfile("Test");
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new InternetExplorerDriver();
		}
		driver.get("https://www.google.com/gmail/about/");
		driver.quit();
		
	}
    @DataProvider
    public Object[][] getdata()
    {
    	Object[][] d=new Object[3][2];
    	d[0][0]="Mozilla";
    	d[0][1]="user1";
		
        d[1][0]="Chrome";
    	d[1][1]="user2";
    	
    	d[2][0]="IE";
    	d[2][1]="user3"	;
    			
    			
     return d;
    	
    }
}
