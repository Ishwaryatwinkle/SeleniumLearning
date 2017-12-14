package com.selenium.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Droplist {
	@Test
	public void dropList() throws IOException{
		System.setProperty("webdriver.gecko.driver","D:\\\\\\\\Ishwarya\\\\\\\\Selenium Test Envir\\\\\\\\geckodriver-v0.19.1-win64\\\\\\\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.get("http://qtpselenium.com/home/contact_trainer");
	    File qtpsel=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(qtpsel, new File("D:\\Ishwarya\\Selenium\\Screenshots\\droplist.jpg"));
	    
	    WebElement dropLis=driver.findElement(By.name("country_id"));
	    dropLis.sendKeys("Bahrain");
	    List<WebElement> Options=dropLis.findElements(By.tagName("Option"));
	    System.out.println("Total Options---->" +Options.size());
	
	    for(int i=0;i<Options.size();i++){
	    WebDriverWait wait=new WebDriverWait(driver,30);
	    System.out.println(Options.get(i).getText()+"----------"+Options.get(i).isSelected());
	   
	    }
	    Select s=new Select(dropLis);
	      
	
	}

}
