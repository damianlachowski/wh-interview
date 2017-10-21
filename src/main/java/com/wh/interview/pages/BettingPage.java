package com.wh.interview.pages;

import com.wh.interview.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BettingPage extends PageObject {
    public BettingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "desktop-sidebar-quick-links")
    private WebElement popular;

    @FindBy(id = "sidebar-left-context")
    private WebElement contextSidebar;

    @FindBy(id = "competitions-tab-content")
    private WebElement competitionsTab;

    @FindBy(id = "betslip-content")
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
