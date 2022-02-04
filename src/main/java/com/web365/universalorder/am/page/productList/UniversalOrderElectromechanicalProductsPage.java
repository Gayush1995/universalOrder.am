package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderElectromechanicalProductsPage  extends UniversalOrderHomePage {

	public UniversalOrderElectromechanicalProductsPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	}
	public static final String ELECTROMECHANICAL_PRODUCT_PAGE_XPATH="//img[@src='/img/cats/1434/488.jpg']";
	  @FindBy(xpath=ELECTROMECHANICAL_PRODUCT_PAGE_XPATH)
	  public WebElement electromechanicalProductPageVerify;
	
}
