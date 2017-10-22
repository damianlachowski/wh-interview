package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// Class that represents page object event
public class Event {
    private WebElement event;

    public Event(WebElement parent) {
        this.event = parent;
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

    private List<WebElement> getOddButtons() {
        return event.findElements(By.className("oddsbutton"));
    }
}
