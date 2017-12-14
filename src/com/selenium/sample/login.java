package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class login {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Ishwarya\\Selenium Test Envir\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "D:\\Ishwarya\\Selenium Test Envir\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver1=new ChromeDriver();
    System.setProperty("webdriver.ie.driver", "D:\\Ishwarya\\Selenium Test Envir\\IEdriver\\MicrosoftWebDriver.exe");
    WebDriver driver2=new InternetExplorerDriver();
	}

}
