package com.selenium.sample;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alllinks {
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.gecko.driver","D:\\Ishwarya\\Selenium Test Envir\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://twinkletech.com/");
		File twinkle=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(twinkle, new File("D:\\Ishwarya\\Selenium\\Screenshots\\twinkle.jpg"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All Links count----"+allLinks.size());
		WebElement fifthLink=allLinks.get(5);
		fifthLink.getText();
		System.out.println(fifthLink.getText());
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText()+"-----------"+allLinks.get(i).isDisplayed());
		}


}}
