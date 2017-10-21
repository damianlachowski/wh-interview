package com.wh.interview.pages.impl.mobile;

import com.wh.interview.pages.interfaces.IBettingPage;
import com.wh.interview.pages.interfaces.IHomePage;
import com.wh.interview.pages.interfaces.IVegasPage;
import org.openqa.selenium.WebDriver;

public class MobileHomePage implements IHomePage {
    private WebDriver driver;

    public MobileHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public IBettingPage getBettingPage(WebDriver driver) {
        return new MobileBettingPage(driver);
    }

    @Override
    public IVegasPage getVegasPage(WebDriver driver) {
        return new MobileVegasPage(driver);
    }
}
