package com.web365.universalorder.am.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniversalOrderBasePage {
	protected WebDriver driver;
	
	public UniversalOrderBasePage(WebDriver driver) {
      this.driver = driver;
	 PageFactory.initElements(this.driver, this);
}
}
