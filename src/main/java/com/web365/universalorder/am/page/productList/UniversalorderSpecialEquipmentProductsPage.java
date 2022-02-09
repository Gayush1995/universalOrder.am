package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalorderSpecialEquipmentProductsPage extends UniversalOrderHomePage {

	public UniversalorderSpecialEquipmentProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static final String SPECIAL_EQUIPMENT_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1459/599.jpg']";
	  @FindBy(xpath=SPECIAL_EQUIPMENT_PAGE_VERIFY_XPATH)
	  public WebElement specialEquipmentpageverifyxpath;

}
