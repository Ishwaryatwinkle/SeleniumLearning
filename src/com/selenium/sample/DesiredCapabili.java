package com.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.Platform;

public class DesiredCapabili {
	public static void main(String[] args){
		DesiredCapabilities dec=new DesiredCapabilities();
		//dec.setBrowserName("Mozilla");
		dec.setJavascriptEnabled(true);
		dec.setCapability(CapabilityType.BROWSER_NAME,"Mozilla");
		dec.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
		System.setProperty("webdriver.gecko.driver", "D:\\\\Ishwarya\\\\Selenium Test Envir\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.close();
	}

}
