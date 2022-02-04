package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderBoilersPage extends UniversalOrderHomePage{

	public UniversalOrderBoilersPage(WebDriver driver) {
		super(driver);
	this.driver = driver;
	}
	
	public static final String BOILERS_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1432/480.jpg']";
	  @FindBy(xpath=BOILERS_PAGE_VERIFY_XPATH)
	  public WebElement boilerspageverifyxpath;


}
