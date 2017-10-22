package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// Class that represents page object event container eg. English Premier League
public class EventContainer {
    private WebElement competitionTabElement;

    public EventContainer(WebElement parent) {
        this.competitionTabElement = parent;
    }

    public List<WebElement> getEvents() {
        return competitionTabElement.findElements(By.className("event"));
    }
}
