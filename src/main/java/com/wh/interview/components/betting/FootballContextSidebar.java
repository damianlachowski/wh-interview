package com.wh.interview.components.betting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FootballContextSidebar {
        WebElement parent;

        public FootballContextSidebar(WebElement parent) {
            this.parent = parent;
        }

    public WebElement getDailyList() {
            return parent.findElement(By.id("nav-football-matches"));
        }

        public WebElement getInPlay() {
            return parent.findElement(By.id("nav-football-inplay"));
        }

        public WebElement getCoupons() {
            return parent.findElement(By.id("nav-football-coupons"));
        }

        public WebElement getCompetitions() {
            return parent.findElement(By.id("nav-football-competitions"));
        }

        public WebElement getStats() {
            return parent.findElement(By.id("nav-football-stats"));
        }

        public WebElement getVirtualWorld() {
            return parent.findElement(By.id("nav-football-virtualworld"));
        }
}
