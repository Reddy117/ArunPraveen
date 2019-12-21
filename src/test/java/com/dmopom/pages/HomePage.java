package com.dmopom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.utils.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	public WebElement womanTab;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	public WebElement tShirtslink;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	public WebElement tshirtsimg;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	public WebElement logOutbtn;
	
	//*[@id="header"]/div[2]/div/div/nav/div[2]/a
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clikOnProduct(){
		try{
			mouseHover(womanTab);
			tShirtslink.click();
			tshirtsimg.click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void doLogout(){
		try{
			logOutbtn.click();
		}catch(Exception e){
			
		}
	}
	
}
