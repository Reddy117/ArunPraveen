package com.dmopom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.utils.BaseClass;

public class AddKartPage extends BaseClass{

	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	public WebElement qtyTxt;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	public WebElement sizeTxt;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	public WebElement addKartbtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	public WebElement closebtn;
	
	public AddKartPage(){
		PageFactory.initElements(driver, this);
	}
	public void addProductToKart(String qty,String size){
		try{
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			qtyTxt.sendKeys(qty);
			selectDrop(sizeTxt, size);
			addKartbtn.click();
			Thread.sleep(3000);
			closebtn.click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
