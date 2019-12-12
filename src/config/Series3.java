package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Series3 {

	public static void main(String[] args) throws InterruptedException {
		//implicit wait
WebDriver driver=new FirefoxDriver();

driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.cssSelector("")).click();
	
	driver.findElement(By.xpath("")).isDisplayed();
	
	
	driver.findElement(By.id("")).isSelected();
	
	driver.findElement(By.id("")).getAttribute("class").contains("checked");
	
	driver.findElements(By.tagName("//a")).size();
	
	driver.getCurrentUrl();
	
	driver.getTitle();
	
	}

}
