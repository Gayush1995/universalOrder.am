package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderConvectionOvensPage extends UniversalOrderHomePage{

	public UniversalOrderConvectionOvensPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	public static final String CONVECTION_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1431/476.jpg']";
	  @FindBy(xpath=CONVECTION_PAGE_VERIFY_XPATH)
	  public WebElement convectionpageverifyxpath;
	
}
