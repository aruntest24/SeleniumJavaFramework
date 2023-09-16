package Setup;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserSetUp {
public static WebDriver browserInitialization() {
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String browser = rb.getString("browser");
	WebDriver driver = null;
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	else {
		System.out.println("No Browser found in the config properties"+ browser);
	}
	System.out.println(browser);
	return driver;
	
}
}
