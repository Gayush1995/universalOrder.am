package com.web365.universalorder.am.page.productList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalorderNeutralEquipmentProductsPage extends UniversalOrderHomePage {

	public UniversalorderNeutralEquipmentProductsPage(WebDriver driver) {
		super(driver);
	   this.driver=driver;
	}
	public static final String NEUTRAL_EQUIPMENT_PAGE_VERIFY_XPATH="//img[@src='/img/cats/1457/588.jpg']";
	  @FindBy(xpath=NEUTRAL_EQUIPMENT_PAGE_VERIFY_XPATH)
	  public WebElement neutralEquipmentPageVerify;
	
}
