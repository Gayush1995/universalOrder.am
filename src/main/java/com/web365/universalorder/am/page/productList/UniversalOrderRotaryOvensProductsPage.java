package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderRotaryOvensProductsPage extends UniversalOrderHomePage {

	public UniversalOrderRotaryOvensProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String ROTERYOVENS_PRODUCT_PAGE_XPATH="//img[@src='/img/cats/1435/492.jpg']";
	  @FindBy(xpath=ROTERYOVENS_PRODUCT_PAGE_XPATH)
	  public WebElement roteryOvensProductPageVerify;
	

	
	}


