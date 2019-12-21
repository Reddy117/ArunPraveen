package com.dmopom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.utils.BaseClass;

public class LandPage extends BaseClass{

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement singinlink;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement uNameTxt;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	public WebElement pWordtxt;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	public WebElement submitbtn;
	
	public LandPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String uName,String pWrod){
		try{
			singinlink.click();
			uNameTxt.sendKeys(uName);
			pWordtxt.sendKeys(pWrod);
			submitbtn.click();
		}catch(Exception e){
			
		}
	}
}
