package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Class that represents page object "Football" sidebar under "Popular" sidebar
public class FootballContextSidebar {
    private WebElement contextSidebar;

    public FootballContextSidebar(WebElement parent) {
        this.contextSidebar = parent;
    }

    public WebElement getDailyList() {
        return contextSidebar.findElement(By.id("nav-football-matches"));
    }

    public WebElement getInPlay() {
        return contextSidebar.findElement(By.id("nav-football-inplay"));
    }

    public WebElement getCoupons() {
        return contextSidebar.findElement(By.id("nav-football-coupons"));
    }

    public WebElement getCompetitions() {
        return contextSidebar.findElement(By.id("nav-football-competitions"));
    }

    public WebElement getStats() {
        return contextSidebar.findElement(By.id("nav-football-stats"));
    }

    public WebElement getVirtualWorld() {
        return contextSidebar.findElement(By.id("nav-football-virtualworld"));
    }
}
