package com.wh.interview.pages.impl.web;

import com.wh.interview.helpers.PageObject;
import com.wh.interview.pages.interfaces.IBettingPage;
import com.wh.interview.pages.interfaces.IHomePage;
import com.wh.interview.pages.interfaces.IVegasPage;
import org.openqa.selenium.WebDriver;

public class WebHomePage extends PageObject implements IHomePage {
    public WebHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public IBettingPage getBettingPage(WebDriver driver) {
        return new WebBettingPage(driver);
    }

    @Override
    public IVegasPage getVegasPage(WebDriver driver) {
        return new WebVegasPage(driver);
    }
}
