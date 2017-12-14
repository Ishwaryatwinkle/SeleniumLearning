package com.selenium.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmaillogin {
@Test
public void Gmail() throws IOException
{
		System.setProperty("webdriver.gecko.driver", "D:\\\\Ishwarya\\\\Selenium Test Envir\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:\\gmail.com");
		File login=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(login, new File("D:\\Ishwarya\\Selenium\\Screenshots\\login.jpg"));
		String text=driver.findElement(By.id("headingText")).getText();
		System.out.println("---"+text+"---");
		driver.findElement(By.id("identifierId")).sendKeys("twinkletech.testing");
		String placeholder=driver.findElement(By.id("identifierId")).getAttribute("placeholder");
		System.out.println("-----"+placeholder+"---------");
		String Email=driver.findElement(By.id("identifierId")).getAttribute("value");
		System.out.println("-------"+Email+"-------");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("identifierId")).sendKeys("twinkle123");
		File pass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pass, new File("D:\\Ishwarya\\Selenium\\Screenshots\\pass.jpg"));
		String Password=driver.findElement(By.id("identifierId")).getAttribute("value");
		System.out.println("----"+Password+"----");
		driver.findElement(By.id("identifierNext")).click();
		driver.quit();
		
	}

}
