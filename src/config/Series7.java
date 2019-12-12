package config;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class Series7 {

	public static void main(String[] args) throws InterruptedException, IOException {

  //WebDriver driver=new FirefoxDriver();
  Properties OR = new Properties();
  File file = new File(System.getProperty("user.dir")+"/src/config/or.properties");
  
  FileInputStream input = new FileInputStream(file);
  OR.load(input);
  System.out.println(OR.getProperty("UserName"));
	}

}
