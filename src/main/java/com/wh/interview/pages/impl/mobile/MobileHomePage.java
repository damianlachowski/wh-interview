package com.wh.interview.pages.impl.mobile;

import com.wh.interview.helpers.PageObject;
import com.wh.interview.pages.interfaces.IBettingPage;
import com.wh.interview.pages.interfaces.IHomePage;
import com.wh.interview.pages.interfaces.IVegasPage;
import org.openqa.selenium.WebDriver;

public class MobileHomePage extends PageObject implements IHomePage {
    public MobileHomePage(WebDriver driver) {
        super(driver);
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
