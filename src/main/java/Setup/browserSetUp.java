package Setup;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserSetUp {
public static WebDriver browserInitialization() {
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String browser = rb.getString("browser");
	Logger loger = LogManager.getLogger("logger");
	WebDriver driver = null;
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		loger.log(Level.INFO, "ChromeDriver Initialize");
		driver.get(rb.getString("applicationurl"));
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		loger.log(Level.INFO, "FirefoxDriver Initialize");
		driver.get(rb.getString("applicationurl"));
	}
	else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		loger.log(Level.INFO, "EdgeDriver Initialize");
		driver.get(rb.getString("applicationurl"));
	}
	else {
		System.out.println("No Browser found in the config properties"+ browser);
		loger.log(Level.INFO, "No Browser Initialize");	
	}
	return driver;
	
}
}
