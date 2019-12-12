package config;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Series6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		
		
		driver.findElements(By.tagName("iframe")).size();
		
		driver.switchTo().frame(0);
		
		driver.switchTo().frame("auto");
		
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		
		
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("text");
		select.selectByVisibleText("text1");
		
		select.deselectAll();
		select.deselectByIndex(0);
		select.deselectByValue("text");
		select.deselectByVisibleText("text1");
		
		
		WebDriver dr=new FirefoxDriver();
		
	
				EventFiringWebDriver driver1 = new EventFiringWebDriver(dr);
		
		driver1.executeScript("document.getElementById(\"text\")");
		driver1.executeScript("");
		
		
		//JavascriptExecutor javascript = ((JavascriptExecutor)driver).executeScript("");
		
	}

}
