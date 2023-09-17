package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Setup.browserSetUp;

public class Homepage extends browserSetUp {
	WebDriver driver = browserInitialization();
	@FindBy(xpath = "//button[.=' Accept All ']")
	private WebElement acceptAllBtn;

	@FindBy(xpath = "//span[.='Register']")
	private WebElement registerBtn;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public void acceptAll() {
		acceptAllBtn.click();
	}

	public void register() {
		registerBtn.click();
	}
}