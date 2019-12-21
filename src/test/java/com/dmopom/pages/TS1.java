package com.dmopom.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.utils.BaseClass;
import com.demo.utils.DataUtils;

public class TS1 extends BaseClass{
	LandPage lp;
	HomePage hp;
	AddKartPage ap;
	@BeforeMethod
	public void openApp(){
		
		initialize("chrome");
		lp=new LandPage();
		hp=new HomePage();
		ap=new AddKartPage();
	}
	
	@Test(dataProvider="getTCData")
	public void addProductToKartAndVerify(String qty,String sizee,String msg){
		lp.doLogin(p.getProperty("uName"), p.getProperty("password"));
		hp.clikOnProduct();
		ap.addProductToKart(qty, sizee);

	}
	
	@AfterMethod
	public void tearDown(){
		hp.doLogout();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getTCData(){
		return DataUtils.getData("AddProductToKart", "Sheet1", x);
	}
}
