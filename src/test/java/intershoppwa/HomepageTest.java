package intershoppwa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageClasses.Homepage;
import Setup.browserSetUp;
import Utilities.commonUtilities;

public class HomepageTest {
	@Test
	public void testHomepage() throws InterruptedException {
		Homepage hp = new Homepage();
		hp.acceptAll();
		hp.register();
//		Thread.sleep(1500);
//		commonUtilities.capturescreen("HomepageTest.png");
	}
}
