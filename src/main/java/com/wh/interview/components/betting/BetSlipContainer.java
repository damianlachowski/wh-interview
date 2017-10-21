package com.wh.interview.components.betting;

import com.sun.jna.platform.win32.W32Errors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BetSlipContainer {
    WebElement parent;

    public BetSlipContainer(WebElement parent) {
        this.parent = parent;
    }

    public void setStake(String stake) {
        parent.findElement(By.className("betslip-selection__stake-input")).sendKeys(stake);
    }

    public WebElement getTotalRerun() {
        return parent.findElement(By.id("total-to-return-price"));
    }

    public WebElement getTotalStake() {
        return parent.findElement(By.id("total-stake-price"));
    }
}
