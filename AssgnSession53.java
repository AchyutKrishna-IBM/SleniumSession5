package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnSession53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement emailEle = driver.findElement(By.xpath("//input[@id='email']"));
		emailEle.sendKeys("dbuddf@gmail.com");
		WebElement passEle = driver.findElement(By.xpath("//input[@id='pass']"));
		passEle.sendKeys("3526ewgds");
		WebElement loginEle = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginEle.click();

	}

}
