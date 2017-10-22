package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Class that represents page object "Competitions" tab
public class CompetitionsTab {
    private WebElement bettingPage;

    public CompetitionsTab(WebElement parent) {
        this.bettingPage = parent;
    }

    public WebElement getEnglishPremierLeague() {
        return bettingPage.findElement(By.linkText("English Premier League"));
    }

    public WebElement getEnglishPremierLeagueEvents() {
        return getEnglishPremierLeague().findElement(By.xpath("./ancestor::li[1]/following::li[1]"));
    }
}
