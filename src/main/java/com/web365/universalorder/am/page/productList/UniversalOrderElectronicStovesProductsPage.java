package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderElectronicStovesProductsPage extends UniversalOrderHomePage{

	public UniversalOrderElectronicStovesProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String ELECTRONIC_STOVES_PAGE_XPATH="//img[@src='/img/cats/1439/504.jpg']";
	  @FindBy(xpath=ELECTRONIC_STOVES_PAGE_XPATH)
	  public WebElement electronicStovesPageVerify;

}
