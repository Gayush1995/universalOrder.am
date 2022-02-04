package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderGasEquipmentProductsPage extends UniversalOrderHomePage {

	public UniversalOrderGasEquipmentProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public static final String GAS_EQUIPMENT_PAGE_XPATH="//img[@src='/img/cats/1441/506.jpg']";
	  @FindBy(xpath=GAS_EQUIPMENT_PAGE_XPATH)
	  public WebElement gasEquipmentPageVerify;

	
}
