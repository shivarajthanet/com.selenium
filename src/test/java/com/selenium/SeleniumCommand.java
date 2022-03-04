package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCommand {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shivarajthanet@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		//driver.close();
	}

}
