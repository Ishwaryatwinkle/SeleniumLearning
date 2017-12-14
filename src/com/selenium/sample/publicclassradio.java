package com.selenium.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;

public class publicclassradio {
	@Test
	public void radio() throws IOException{
		System.setProperty("webdriver.gecko.driver","D:\\\\Ishwarya\\\\Selenium Test Envir\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("D:\\Ishwarya\\Selenium\\Screenshots\\radio.jpg"));		
		List<WebElement> radio=driver.findElements(By.name("radio1"));
		System.out.println(radio.size());
		radio.get(0).click();
		System.out.println(radio.get(0).getAttribute("checked"));
		
		
		
	}

}
