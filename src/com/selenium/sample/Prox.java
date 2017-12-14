package com.selenium.sample;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Prox {
	public static void main(String[] args){
		Proxy p=new Proxy();
		p.setProxyAutoconfigUrl("http://abc.com");
		DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setCapability(CapabilityType.PROXY, p);
	    System.setProperty("webdriver.gecko.driver", "D:\\\\Ishwarya\\\\Selenium Test Envir\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}

}
