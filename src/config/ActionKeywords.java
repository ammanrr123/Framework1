package config;

import org.openqa.selenium.Alert;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static executionEnginee.DriverScript.OR;

import java.util.concurrent.TimeUnit; 
public class ActionKeywords {
	public static WebDriver driver;
	
	public static void openBrowser(String object) {
		System.setProperty("webdriver.chrome.driver","C://Users//ammanrr.CORP//Downloads//chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void navigate(String object) {
		driver.get(Constants.URL);
	} 
	public static void input_UserName(String object) {
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.UserName);
		System.out.println("success");
	}
	
	public static void input_Password(String object) {
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Password);
		
	}
	
	public static void click_Login(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void closeBrowser(String object) {
		driver.quit();
	}
	
	
	public static void click_communicationtab(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void click_querybtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void enter_commName(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Communication);
		Thread.sleep(5000);
	}
	
	public static void click_Gobtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void click_ActiveActs(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void click_Adhocsubmit(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
		Alert promptAlert = driver.switchTo().alert();


		promptAlert.sendKeys("03/31/2018");
		promptAlert.accept();
		Thread.sleep(5000);
		Alert promptAlert1 = driver.switchTo().alert();
		promptAlert1.accept();
	}
	public static void click_Acttabs(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void click_AllActs(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void click_querybtn2(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void input_tab(String object) throws InterruptedException  {
		WebElement Element=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[2]/input"));
		Element.click();
		Thread.sleep(3000);
		Element.sendKeys(Keys.TAB);
	}
	public static void input_tab1(String object) throws InterruptedException  {
		
		WebElement Element1=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[3]/input"));
		Element1.sendKeys(Keys.TAB);
		WebElement Element2=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[4]/input"));
		Element2.sendKeys(Keys.TAB);
		WebElement Element3=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[5]/input"));
		Element3.sendKeys(Keys.TAB);
		WebElement Element4=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[6]/input"));
		Element4.sendKeys(Keys.TAB);
		WebElement Element5=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[7]/input"));
		Element5.sendKeys(Keys.TAB);
		WebElement Element6=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[8]/input"));
		Element6.sendKeys(Keys.TAB);
		WebElement Element7=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[9]/span/input"));
		Element7.sendKeys(Keys.TAB);
		WebElement Element8=driver.findElement(By.xpath("//table[@id='s_2_l']/tbody/tr[2]/td[10]/input"));
		Element8.sendKeys(Keys.TAB);
	}
	public static void input_AccountNumber(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.ActNumber);
		Thread.sleep(5000);
	}
	public static void click_Gobtn1(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void click_Commuinstancetsb(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void click_Commbtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void Input_Calcountry(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='United States']")).click();
	}
	public static void Input_CalType(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='US Business']")).click();
		Thread.sleep(6000);
	}
	public static void input_CommName(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void click_querybtn1(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void input_communicationName1(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Communication);
		Thread.sleep(5000);
	}
	public static void click_gobtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	
	public static void click_okbtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
	public static void click_savebtn(String object) throws InterruptedException  {
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		Thread.sleep(5000);
	}
}