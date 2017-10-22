package com.wh.interview;

import com.wh.interview.helpers.BrowserType;
import com.wh.interview.pages.impl.mobile.MobileHomePage;
import com.wh.interview.pages.impl.web.WebHomePage;
import com.wh.interview.pages.interfaces.IHomePage;
import com.wh.interview.stepdefinitions.Hooks;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected static WebDriver driver = Hooks.getDriver();
    private static final String HOME_PAGE_URL = "http://sports.williamhill.com/betting/en-gb";
    private static BrowserType browser = BrowserType.DESKTOP;
}
