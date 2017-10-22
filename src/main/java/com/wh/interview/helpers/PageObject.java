package com.wh.interview.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// Class that represents general page object
public abstract class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}