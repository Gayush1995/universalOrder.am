package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.headerPartLinks.UniversalOrderHomeProductionPage;
import com.web365.universalorder.am.page.headerPartLinks.UniversalOrderShopCartPage;
import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.productList.UniversalOrderConvectionOvensPage;

import universalOrder.base.UniversalOrderBaseTest;

public class HeaderPartLinksTest extends UniversalOrderBaseTest {
	@Test
	public void ourProductionTest() throws InterruptedException { 
	//1.UniversalOrder.am is open
		UniversalOrderHomeProductionPage homeProductionLink = new UniversalOrderHomeProductionPage(driver);
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);
	 //2.Click on Our Production Link
	  homeProductionLink=home.goToUniversalOrderHomeProductionPageClick();
    home = home.logoClick();
}
	@Test
	public void shopCartlinkTest() throws InterruptedException { //Конвекционные Печи
	//1.UniversalOrder.am is open
		UniversalOrderShopCartPage shopCart = new UniversalOrderShopCartPage(driver);
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);
	 //2.Click on Конвекционные Печи Link
	  shopCart=home.goToShopCartPage();
      home = home.logoClick();
	}	
}
