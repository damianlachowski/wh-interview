package com.wh.interview.pages.impl.mobile;

import com.wh.interview.helpers.PageObject;
import com.wh.interview.pages.interfaces.IVegasPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class MobileVegasPage extends PageObject implements IVegasPage {
    private static final Logger LOGGER = Logger.getLogger(MobileVegasPage.class);

    public MobileVegasPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void samplePageObjectImplementation() {
        LOGGER.info("Mobile Vegas Page implementation");
    }
}
