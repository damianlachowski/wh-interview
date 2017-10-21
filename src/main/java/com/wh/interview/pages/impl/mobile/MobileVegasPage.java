package com.wh.interview.pages.impl.mobile;

import com.wh.interview.pages.interfaces.IVegasPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class MobileVegasPage implements IVegasPage {
    private static final Logger LOGGER = Logger.getLogger(MobileVegasPage.class);
    private final WebDriver driver;

    public MobileVegasPage(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void samplePageObjectImplementation() {
        LOGGER.info("Mobile Vegas Page implementation");
    }
}
