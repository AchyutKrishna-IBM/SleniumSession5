package com.ibm.seleniumconcepts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssgnSession51 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com");
	//	ChromeOptions options = new ChromeOptions();
		//options.addArguments("-disable-notifications");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='button']/button")).click();
	    Thread.sleep(2000);
		WebElement searchEle=driver.findElement(By.xpath("//input[@id='searchTerm']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(searchEle).click().sendKeys("shirts").build().perform();
	    WebElement searchbuttonEle=driver.findElement(By.xpath("//div[@class='globalHeader_searchContainer']/form/input[2]/following::button[1]"));
	    searchbuttonEle.click();
	  WebElement shirtEle=driver.findElement(By.xpath("//div[@class='productDisplay_title is-truncated masterTooltip']"));
	  shirtEle.click();
		Thread.sleep(3000);
	  WebElement sizeEle=driver.findElement(By.xpath("//select[@id='SIZE']"));
	  sizeEle.click();
	  Select s=new Select(sizeEle);
	  s.selectByValue("4");
	WebElement colorEle=driver.findElement(By.xpath("//img[@alt='Blooming Blue']"));
	colorEle.click();
	WebElement atbEle=driver.findElement(By.xpath("//button[text()='Add to Bag']"));
	atbEle.click();
	Thread.sleep(3000);
	driver.switchTo().frame("modalIframe");
	WebElement chckEle=driver.findElement(By.xpath("//input[@id='btncheckout']"));
	chckEle.click();
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
  WebElement checkoutEle=driver.findElement(By.xpath("(//input[@alt='checkout'])[2]"));
   checkoutEle.click();
		
	}

}
