package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderDishwashersProductsPage extends UniversalOrderHomePage{

	public UniversalOrderDishwashersProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	public static final String DISHWASHERS_PAGE_XPATH="//img[@src='/img/cats/1433/484.jpg']";
	  @FindBy(xpath=DISHWASHERS_PAGE_XPATH)
	  public WebElement dishwasherPageVerify;
	

}
