package config;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Series2 {

	public static void main(String[] args) throws InterruptedException {
		//implicit wait
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//Explict wait
WebDriverWait wait=new WebDriverWait(driver,60);
wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
//Polling interval
WebDriverWait wait1= new WebDriverWait(driver,60);
wait1.pollingEvery(5, TimeUnit.SECONDS);

wait1.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
//Fluentwait
WebElement wait3=new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class)
.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));

wait3.click();

//thread.sleep

Thread.sleep(2000);


//page load timeout

driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

	
	//java script page load
ExpectedCondition <Boolean>javascriptWait= new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driver) {
			return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("Complete");
			
		}
	};
	
	try {
		System.out.println("Waiting for page load");
		WebDriverWait wait4=new WebDriverWait(driver,60);
		wait4.until(javascriptWait);
	}catch(Throwable error) {
		System.out.println("Timeout waiting for page load Request to completed after"+ 60 +"seconds");
		Assert.assertFalse("Timeout waiting for page load request to complete",true);
	}
	}

}
