package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderShockFreezingGeneratorsProductsPage extends UniversalOrderHomePage {

	public UniversalOrderShockFreezingGeneratorsProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String SHOCK_FREEZING_GENERATON_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1436/495.jpg']";
	  @FindBy(xpath=SHOCK_FREEZING_GENERATON_PAGE_VERIFY_XPATH)
	  public WebElement shockfreezinggenerationpageverifyxpath;
	
}
