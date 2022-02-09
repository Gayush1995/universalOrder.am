package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderKettlesAndCountertopFryersProductsPage extends UniversalOrderHomePage {

	public UniversalOrderKettlesAndCountertopFryersProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public static final String GAS_KETTLES_AND_COUNTERTOP_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1448/546.jpg']";
	  @FindBy(xpath=GAS_KETTLES_AND_COUNTERTOP_PAGE_VERIFY_XPATH)
	  public WebElement kettlesAndCountertopPageVerify;


}
