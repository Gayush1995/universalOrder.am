package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalorderAccessoriesProductsPage extends UniversalOrderHomePage {

	public UniversalorderAccessoriesProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String ACCESSIRIES_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1458/591.jpg']";
	  @FindBy(xpath=ACCESSIRIES_PAGE_VERIFY_XPATH)
	  public WebElement accessoriespageverifyxpath;
	
}
