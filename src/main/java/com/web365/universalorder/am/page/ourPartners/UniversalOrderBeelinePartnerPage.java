package com.web365.universalorder.am.page.ourPartners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;



public class UniversalOrderBeelinePartnerPage extends  UniversalOrderHomePage{

	public UniversalOrderBeelinePartnerPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//public static final String BEELINE_PAGE_XPATH="//a[@href='https://www.beeline.am/hy/b2c/']";
	 // @FindBy(xpath=BEELINE_PAGE_XPATH)
	//  public  WebElement beelinePageVerify;
	
}
