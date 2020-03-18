package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage;
import pageObject.IndexPage;
import stepDefinitions.IndexSteps;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
	public static WebDriver driver;
	public static BasePage basePage;
	public static IndexPage indexPage;


	public WebDriver getDriver() {
		try {
			// Read properties file
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
			p.load(fis);
			String browserName = p.getProperty("browser");

			switch (browserName) {

				case "firefox":
					// code
					if (null == driver) {
						System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
						DesiredCapabilities capabilities = DesiredCapabilities.firefox();
						capabilities.setCapability("marionette", true);
						driver = new FirefoxDriver();
					}
					break;

				case "chrome":
					// code
					if (null == driver) {
						System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
						// CHROME OPTIONS
						driver = new ChromeDriver();
					    driver.manage().window().maximize();
					}

			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
			basePage = PageFactory.initElements(driver,BasePage.class);
			indexPage = PageFactory.initElements(driver,IndexPage.class);
		}
		return driver;
	}
}
