package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Setup.browserSetUp;

public class commonUtilities extends browserSetUp {
	public static String capturescreen(String name) {
		TakesScreenshot takescreenshot = (TakesScreenshot) browserSetUp.browserInitialization();
		File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshots/" + name);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return destination.getAbsolutePath();

	}

}
