package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderPizzaOvensProductsPage extends UniversalOrderHomePage {

	public UniversalOrderPizzaOvensProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String PIZZA_OVENS_PAGE_XPATH="//img[@src='/img/cats/1445/541.jpg']";
	  @FindBy(xpath=PIZZA_OVENS_PAGE_XPATH)
	  public WebElement pizzaOvensPageVerify;

}
