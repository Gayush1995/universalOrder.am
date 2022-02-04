package com.web365.universalorder.am.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.base.UniversalOrderBasePage;
import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

public class UniversalOrderAboutUsPage extends UniversalOrderHomePage {

	public UniversalOrderAboutUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public static final String ABOUT_TITLE_XPATH="//div[@class='page-title pencil_edit']";
	@FindBy(xpath=ABOUT_TITLE_XPATH)
  public WebElement aboutTitle;

}
