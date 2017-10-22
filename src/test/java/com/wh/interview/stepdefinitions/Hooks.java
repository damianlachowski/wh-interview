package com.wh.interview.stepdefinitions;

import com.google.common.base.Strings;
import com.wh.interview.helpers.BrowserType;
import com.wh.interview.pages.impl.mobile.MobileHomePage;
import com.wh.interview.pages.impl.web.WebHomePage;
import com.wh.interview.pages.interfaces.IHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static final String HOME_PAGE_URL = "http://sports.williamhill.com/betting/en-gb";
    private static WebDriver driver;
    private static BrowserType browser = BrowserType.DESKTOP;

    @Before
    public static void setUp() {
        String propertyBrowserType = System.getProperty("browser.type");
        if (!Strings.isNullOrEmpty(propertyBrowserType)) {
            browser = BrowserType.valueOf(propertyBrowserType.toUpperCase());
        }

        switch (browser) {
            // Initialize mobile Chrome browser
            case MOBILE:
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", "Nexus 5");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                driver = new ChromeDriver(chromeOptions);
                break;
            // Initialize desktop Chrome browser
            case DESKTOP:
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalStateException("Browser type not implemented: " + browser.toString());
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    public static BrowserType getBrowserType() {
        return browser;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    // Method that returns betting page mobile or desktop
    public static IHomePage getHomePage() {
        driver.get(HOME_PAGE_URL);

        if (browser == BrowserType.DESKTOP) {
            return new WebHomePage(driver);
        } else {
            return new MobileHomePage(driver);
        }
    }
}
