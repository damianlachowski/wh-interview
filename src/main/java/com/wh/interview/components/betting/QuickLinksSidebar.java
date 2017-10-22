package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Class that represents page object "Popular"
public class QuickLinksSidebar {
    private WebElement popular;

    public QuickLinksSidebar(WebElement parent) {
        this.popular = parent;
    }

    public WebElement getInPlay() {
        return popular.findElement(By.id("nav-in-play"));
    }

    public WebElement getFootball() {
        return popular.findElement(By.id("nav-football"));
    }

    public WebElement getHorses() {
        return popular.findElement(By.id("nav-horses"));
    }

    public WebElement getTennis() {
        return popular.findElement(By.id("nav-tennis"));
    }

    public WebElement getGreyhounds() {
        return popular.findElement(By.id("nav-greyhounds"));
    }
}
