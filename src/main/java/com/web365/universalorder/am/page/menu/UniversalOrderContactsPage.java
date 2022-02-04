package com.web365.universalorder.am.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderContactsPage extends UniversalOrderHomePage{

	public UniversalOrderContactsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public static final String CONTACTINFO_XPATH="//a[@href='tel:+37494493089']";
	@FindBy(xpath=CONTACTINFO_XPATH)
  public WebElement contactinfo;
}
