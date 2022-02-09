package findUsOnGoogleMapLinkTest;

import org.testng.annotations.Test;

import com.web365.universalorder.am.page.footerPartLinks.GoogleMapPage;
import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

import universalOrder.base.UniversalOrderBaseTest;

public class UniversalOrderFindUsOnGoogleMapLinkTest extends UniversalOrderBaseTest {
	@Test
	public void findUsOnGoogleMapLinkTest() throws InterruptedException {
		GoogleMapPage googlemaplink = new GoogleMapPage(driver);
	  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);
	
	  googlemaplink=home.goToGoogleMapPageClick();
	  Thread.sleep(2000);
}
}