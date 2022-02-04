package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderBeelinePartnerPage;
import universalOrder.base.UniversalOrderBaseTest;

public class OurPartnersLinkFromHomePageTest extends UniversalOrderBaseTest {

	
	

	@Test
	public void beelinePartnerLinkTest() throws InterruptedException { //BEELINE.AM LINK
	//1.UniversalOrder.am is open
		UniversalOrderBeelinePartnerPage beelinePartnerLink = new UniversalOrderBeelinePartnerPage(driver);
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	 Thread.sleep(10000);
	 //2.Click on BEELINE.AM LINK
	  @SuppressWarnings("deprecation")
	 	WebDriverWait w = new WebDriverWait(driver,3);
	   // presenceOfElementLocated condition
	   
	   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//a[@href='https://www.beeline.am/hy/']")));
	  beelinePartnerLink=home.goToUniversalOrderBeelinePartnerPageClick();
	 // Assert.assertTrue(beelinePartnerLink.beelinePageVerify.isDisplayed());
	
   home = home.logoClick();
	}
}



