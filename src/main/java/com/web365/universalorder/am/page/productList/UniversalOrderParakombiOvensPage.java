package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderParakombiOvensPage extends  UniversalOrderHomePage {

	public UniversalOrderParakombiOvensPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	public static final String PARACOMBIOVENS_XPATH="//img[@src='/img/cats/1430/475.jpg']";
  @FindBy(xpath=PARACOMBIOVENS_XPATH)
  public WebElement paracombiovensproducts;

}
