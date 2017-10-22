package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Class that represents page object "Bet Slip" container
public class BetSlipContainer {
    private WebElement bettingPage;

    public BetSlipContainer(WebElement parent) {
        this.bettingPage = parent;
    }

    public void setStake(String stake) {
        bettingPage.findElement(By.className("betslip-selection__stake-input")).sendKeys(stake);
    }

    public WebElement getTotalReturn() {
        return bettingPage.findElement(By.id("total-to-return-price"));
    }

    public WebElement getTotalStake() {
        return bettingPage.findElement(By.id("total-stake-price"));
    }
}
