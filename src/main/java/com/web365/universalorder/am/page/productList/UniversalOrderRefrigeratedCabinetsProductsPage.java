package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderRefrigeratedCabinetsProductsPage extends UniversalOrderHomePage {

	public UniversalOrderRefrigeratedCabinetsProductsPage(WebDriver driver) {
		super(driver);
	this.driver=driver;
	}
	public static final String REFRIGIRATED_CABINETS_PAGE_XPATH="//img[@src='/img/cats/1437/497.jpg']";
	  @FindBy(xpath=REFRIGIRATED_CABINETS_PAGE_XPATH)
	  public WebElement refrigiratedCabinetsPageVerify;
	
}
