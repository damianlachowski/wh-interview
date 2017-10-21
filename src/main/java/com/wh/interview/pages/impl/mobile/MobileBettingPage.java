package com.wh.interview.pages.impl.mobile;

import com.wh.interview.helpers.PageObject;
import com.wh.interview.pages.interfaces.IBettingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class should implement mobile page
 */
public class MobileBettingPage extends PageObject implements IBettingPage {
    public MobileBettingPage(WebDriver driver) {
        super(driver);
    }

    //todo change locators for mobile purposes
//    @FindBy(id = "desktop-sidebar-quick-links")
    private WebElement popular;

    //    @FindBy(id = "sidebar-left-context")
    private WebElement contextSidebar;

    //    @FindBy(id = "competitions-tab-content")
    private WebElement competitionsTab;

    //    @FindBy(id = "betslip-content")
    private WebElement betslipContainer;

    public WebElement getPopular() {
        return popular;
    }

    public WebElement getContextSidebar() {
        return contextSidebar;
    }

    public WebElement getCompetitionsTab() {
        return competitionsTab;
    }

    public WebElement getBetSlipContainer() {
        return betslipContainer;
    }

}
