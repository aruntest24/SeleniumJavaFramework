package intershoppwa;

import java.util.ResourceBundle;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclass {

	public static void main (String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		Logger loger = LogManager.getLogger("logger");
		String browser = rb.getString("browser");
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			loger.log(Level.INFO, "ChromeDriver Initialize");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			loger.log(Level.INFO, "FirefoxDriver Initialize");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			loger.log(Level.INFO, "EdgeDriver Initialize");
		}
		else {
			System.out.println("No Browser found in the config properties for "+ browser);
			loger.log(Level.INFO, "No Driver Initialize");
		}
		System.out.println(browser);
		
	}
}
