package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Event {
    private WebElement parent;

    public Event(WebElement parent) {
        this.parent = parent;
    }

    public WebElement getHomeWin() {
        return getOddButtons().get(0);
    }

    public WebElement getDraw() {
        return getOddButtons().get(1);
    }

    public WebElement getAwayWin() {
        return getOddButtons().get(2);
    }

    public List<WebElement> getOddButtons() {
        return parent.findElements(By.className("oddsbutton"));
    }
}
