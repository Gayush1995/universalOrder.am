package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderDistributionOfLineASTAProductsPage extends UniversalOrderHomePage{

	public UniversalOrderDistributionOfLineASTAProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String DISTRIBUTION_OF_LINE_ASAP_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1450/549.jpg']";
	  @FindBy(xpath=DISTRIBUTION_OF_LINE_ASAP_PAGE_VERIFY_XPATH)
	  public WebElement distributionOfLinePageVerify;
}
