package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompetitionsTab {
    private WebElement parent;

    public CompetitionsTab(WebElement parent) {
        this.parent = parent;
    }

    public WebElement getEnglishPremierLeague() {
        return parent.findElement(By.linkText("English Premier League"));
    }

    public WebElement getEnglishPremierLeagueEvents() {
        return getEnglishPremierLeague().findElement(By.xpath("./ancestor::li[1]/following::li[1]"));
    }
}
