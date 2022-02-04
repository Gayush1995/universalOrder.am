package universalOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.menu.UniversalOrderAboutUsPage;
import com.web365.universalorder.am.page.menu.UniversalOrderContactsPage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;
import com.web365.universalorder.am.page.menu.UniversalOrderServicesPage;

import universalOrder.base.UniversalOrderBaseTest;

public class UniversalOrderMenuFromHomePageTest extends UniversalOrderBaseTest {
	
	@Test
	public void homeLinkTest() throws InterruptedException {
	UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
    home = home.logoClick();
    Thread.sleep(2000);
	
		Assert.assertTrue(home.shopCart.isDisplayed());
	}
		@Test
	 public void aboutUsLinkTest() throws InterruptedException {
    UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	UniversalOrderAboutUsPage about= home.goToAboutUs();
	Thread.sleep(2000);
		Assert.assertTrue(about.aboutTitle.isDisplayed());
		
		home=about.logoClick();
	}
	@Test
	public void servicesLinkTest() throws InterruptedException {
		UniversalOrderServicesPage services = new UniversalOrderServicesPage(driver);
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
		services=home.goToServices();
		Thread.sleep(2000);
		Assert.assertTrue(services.oursevicesTitle.isDisplayed());
	
	}
	@Test
	public void partnersLinkTest() throws InterruptedException {
		UniversalOrderPartnersPage partners = new UniversalOrderPartnersPage(driver);
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  partners=home.goToPartners();
	  Thread.sleep(2000);
	  Assert.assertTrue(partners.partnersTitle.isDisplayed());
	
	}
	@Test
	public void contactsLinkTest() throws InterruptedException {
		UniversalOrderContactsPage contacts = new UniversalOrderContactsPage(driver);
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  contacts=home.goToContacts();
	  Thread.sleep(2000);
	  Assert.assertTrue(contacts.contactinfo.isDisplayed());
	
}
}
