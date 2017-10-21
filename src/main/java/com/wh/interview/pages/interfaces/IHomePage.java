package com.wh.interview.pages.interfaces;

import org.openqa.selenium.WebDriver;

public interface IHomePage {
    public IBettingPage getBettingPage(WebDriver driver);

    public IVegasPage getVegasPage(WebDriver driver);
}
