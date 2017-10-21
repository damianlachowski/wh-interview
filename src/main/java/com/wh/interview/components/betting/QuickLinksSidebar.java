package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuickLinksSidebar {
    private WebElement parent;

    public QuickLinksSidebar(WebElement parent) {
        this.parent = parent;
    }

    public WebElement getInPlay() {
        return parent.findElement(By.id("nav-in-play"));
    }

    public WebElement getFootball() {
        return parent.findElement(By.id("nav-football"));
    }

    public WebElement getHorses() {
        return parent.findElement(By.id("nav-horses"));
    }

    public WebElement getTennis() {
        return parent.findElement(By.id("nav-tennis"));
    }

    public WebElement getGreyhounds() {
        return parent.findElement(By.id("nav-greyhounds"));
    }
}
