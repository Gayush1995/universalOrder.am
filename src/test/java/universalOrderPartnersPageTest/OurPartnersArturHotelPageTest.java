package universalOrderPartnersPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderArturHotelPage;


import universalOrder.base.UniversalOrderBaseTest;

public class OurPartnersArturHotelPageTest extends UniversalOrderBaseTest {
	@Test
	public void ashtarakiDzorRestaurantLinkTest() throws InterruptedException { 
	//1.UniversalOrder.am is open
	
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
   //2.Click <Our Partner> Link From menu list
	  UniversalOrderPartnersPage partners=home.goToPartners();
	 Thread.sleep(10000);
	
	  @SuppressWarnings("deprecation")
	 	WebDriverWait w = new WebDriverWait(driver,3);
	   // presenceOfElementLocated condition
	   
	   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//a[@href='http://arthurs-hotel.am/en']")));
   //3.Click on <Artur Hotel> Link
	   UniversalOrderArturHotelPage arturHotelPartnerLink=partners.goToArturHotelPageClick();
 Thread.sleep(2000);
	}
}
