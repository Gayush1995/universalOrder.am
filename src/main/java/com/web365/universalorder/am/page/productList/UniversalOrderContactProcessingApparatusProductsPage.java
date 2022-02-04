package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderContactProcessingApparatusProductsPage extends UniversalOrderHomePage{

	public UniversalOrderContactProcessingApparatusProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String CONTACT_PROCESSING_APPARATUS_PAGE_XPATH="//img[@src='/img/cats/1438/500.jpg']";
	  @FindBy(xpath=CONTACT_PROCESSING_APPARATUS_PAGE_XPATH)
	  public WebElement contactProcessingApparatusPageVerify;
	
}
