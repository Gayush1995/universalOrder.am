package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderDistributionOfLinePREMERProductsPage extends UniversalOrderHomePage{

	public UniversalOrderDistributionOfLinePREMERProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String DISTRIBUTION_OF_LINE_PREMER_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1452/575.jpg']";
	  @FindBy(xpath=DISTRIBUTION_OF_LINE_PREMER_PAGE_VERIFY_XPATH)
	  public WebElement distributionOfLinePREMERPageVerify;
}
