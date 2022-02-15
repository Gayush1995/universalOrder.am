package universalOrderPartnersPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderAshtarakiDzorRestaurantPage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderIbisHotelPartnerPage;

import universalOrder.base.UniversalOrderBaseTest;

public class OurPartnersAshtarakiDzorRestaurantPageTest extends UniversalOrderBaseTest{
	@Test
	public void ashtarakiDzorRestaurantLinkTest() throws InterruptedException { 
	//1.UniversalOrder.am is open
	
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
   //2.Click <Our Partner> Link From menu list
	  UniversalOrderPartnersPage partners=home.goToPartners();
	 Thread.sleep(2000);
	
	  @SuppressWarnings("deprecation")
	 	WebDriverWait w = new WebDriverWait(driver,3);
	   // presenceOfElementLocated condition
	   
	   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/2.jpg']")));
   //3.Click on <Ashtaraki Dzor Restaurant> Link
	   UniversalOrderAshtarakiDzorRestaurantPage ashtarakiDzorRestaurantPartnerLink=partners.goToAshtarakiDzorRestaurantPartnersPageClick();
 Thread.sleep(2000);
	}
}
