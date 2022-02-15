package universalOrderPartnersPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderAniPlazaHotelPartnerPage;

import universalOrder.base.UniversalOrderBaseTest;

public class OurPartnerAniPlazaHotelPageTest extends UniversalOrderBaseTest{
	@Test
	public void araratResortPartnerPageTest() throws InterruptedException { 
	//1.UniversalOrder.am is open
	
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
   //2.Click <Our Partner> Link From menu list
	  UniversalOrderPartnersPage partners=home.goToPartners();
	 Thread.sleep(2000);
	
	  @SuppressWarnings("deprecation")
	 	WebDriverWait w = new WebDriverWait(driver,3);
	   // presenceOfElementLocated condition
	   
	   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//a[@href='https://anihotel.com/']")));
   //3.Click on <Ani Plaza> Link
	   UniversalOrderAniPlazaHotelPartnerPage aniPlazaPartnerLink=partners.goToUniversalOrderAniPlazaHotelPartnerPageClick();
 Thread.sleep(5000);
	}
}
