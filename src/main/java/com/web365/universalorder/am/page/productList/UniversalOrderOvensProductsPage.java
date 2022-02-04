package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderOvensProductsPage extends UniversalOrderHomePage {

	public UniversalOrderOvensProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String OVENS_PAGE_XPATH="//img[@src='/img/cats/1446/543.jpg']";
	  @FindBy(xpath=OVENS_PAGE_XPATH)
	  public WebElement ovenspageverify;
}
