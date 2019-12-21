package com.demo.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static Actions a;
	public static WebDriver driver;
	public static FileInputStream f;
	public static Properties p;
	public XlReader x=new XlReader();
	public static void initialize(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
			
		}else if(browser.equals("ff")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("url is: "+p.getProperty("url"));
		driver.get(p.getProperty("url"));
	}
	
	public BaseClass(){
		try{
			f=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.property");
			p=new Properties();
			p.load(f);
		}catch(Exception e){
			
		}
	}
	
	public static void mouseHover(WebElement ele){
		a.moveToElement(ele).perform();
	}
	
	public static void selectDrop(WebElement ele,String valueToSel){
		try{
			new Select(ele).selectByVisibleText(valueToSel);
		}catch(Exception e){
			
		}
	}
}
