package com.web365.universalorder.am.page.menu;

import static com.web365.universalorder.am.page.home.UniversalOrderHomePageConstats.PARTNERS_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderPartnersPage extends UniversalOrderHomePage {

	public UniversalOrderPartnersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public static final String PARTNERS_TITLE_XPATH="//img[@src='/img/partners/1.jpg']";
	@FindBy(xpath=PARTNERS_TITLE_XPATH)
  public WebElement partnersTitle;

	

}
	
