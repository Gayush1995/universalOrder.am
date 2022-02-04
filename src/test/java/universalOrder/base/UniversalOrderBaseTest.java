package universalOrder.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UniversalOrderBaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void openUniversalOrder() {
		//System.setProperty("webdriver.chrome.driver","C:\MyLocationForChromedriverExe\chromedriver.exe
		driver = new ChromeDriver();
		driver.get("http://universalorder.am/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
