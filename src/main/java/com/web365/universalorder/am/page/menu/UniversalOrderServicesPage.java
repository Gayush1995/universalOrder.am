package com.web365.universalorder.am.page.menu;

import static com.web365.universalorder.am.page.home.UniversalOrderHomePageConstats.PARTNERS_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderServicesPage extends UniversalOrderHomePage {

	public UniversalOrderServicesPage(WebDriver driver) {
		super(driver);
	  this.driver = driver;
	}
	public static final String OUR_SERVICES_XPATH="//h6[@class='vk-heading']";
	@FindBy(xpath=OUR_SERVICES_XPATH)
  public WebElement oursevicesTitle;

	
	
}
