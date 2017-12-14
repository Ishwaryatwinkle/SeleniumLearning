package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Select {
	public Select(WebElement dropList) {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void SelectEle(){
		System.setProperty("webdriver.gecko.driver","D:\\\\Ishwarya\\\\Selenium Test Envir\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qtpselenium.com/home/contact_trainer");
		WebElement dropList=driver.findElement(By.name("country_id"));
		Select s=new Select(dropList);
	}
	{
		
	}

}
