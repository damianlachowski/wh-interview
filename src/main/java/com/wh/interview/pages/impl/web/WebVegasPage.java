package com.wh.interview.pages.impl.web;

import com.wh.interview.pages.interfaces.IVegasPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class WebVegasPage implements IVegasPage {
    private static final Logger LOGGER = Logger.getLogger(WebVegasPage.class);

    private final WebDriver driver;

    public WebVegasPage(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void samplePageObjectImplementation() {
        LOGGER.info("Mobile Vegas Page implementation");
    }
}
