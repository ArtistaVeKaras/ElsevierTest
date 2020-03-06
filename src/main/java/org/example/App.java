package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String ProjPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/java/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
