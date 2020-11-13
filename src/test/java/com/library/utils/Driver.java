package com.library.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {
    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            if (System.getProperty("browser")!=null) {
                System.out.println("Browser type was changed to: "+System.getProperty("browser"));
                browser = System.getProperty("browser");
            }
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

            case "remote-chrome":
                try{
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName("chrome");
                    URL gridUrl = new URL ("http://54.82.123.241:4444/wd/hub");
                    driver = new RemoteWebDriver(gridUrl, desiredCapabilities);

                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;

                case "remote-firefox":
                    try{
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        URL gridUrl = new URL ("http://54.82.123.241:4444/wd/hub");
                        driver = new RemoteWebDriver(gridUrl, desiredCapabilities);

                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            default:
                throw new RuntimeException("No such a browser yet!");
        }


        }
        return driver;
    }



    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
