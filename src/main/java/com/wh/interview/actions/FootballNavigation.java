package com.wh.interview.actions;

import com.wh.interview.components.betting.BetSlipContainer;
import com.wh.interview.components.betting.CompetitionsTab;
import com.wh.interview.components.betting.Event;
import com.wh.interview.components.betting.EventContainer;
import com.wh.interview.components.betting.FootballContextSidebar;
import com.wh.interview.components.betting.QuickLinksSidebar;
import com.wh.interview.pages.BettingPage;
import org.openqa.selenium.WebDriver;

public abstract class FootballNavigation {
    public static void goToSportsPage(WebDriver driver) {
        driver.get("http://sports.williamhill.com/betting/");
    }

    public static void goToFootball(BettingPage sportsPage) {
        QuickLinksSidebar quickLinksSidebar = new QuickLinksSidebar(sportsPage.getPopular());
        quickLinksSidebar.getFootball().click();
    }

    public static CompetitionsTab getFootballCompetitions(BettingPage sportsPage) {
        FootballContextSidebar footballContextSidebar = new FootballContextSidebar(sportsPage.getContextSidebar());
        footballContextSidebar.getCompetitions().click();
        CompetitionsTab competitionsTab = new CompetitionsTab(sportsPage.getCompetitionsTab());

        return competitionsTab;
    }

    public static String chooseAndGetOdd(CompetitionsTab competitionsTab) {
        String odd = null;
        EventContainer eventContainer = new EventContainer(competitionsTab.getEnglishPremierLeagueEvents());
        Event event = new Event(eventContainer.getEvents().iterator().next());
        odd = event.getHomeWin().getText();
        if (event.getHomeWin().isDisplayed()) {
            event.getHomeWin().click();
        }
        else {
            competitionsTab.getEnglishPremierLeague().click();
            event.getHomeWin().click();
        }

        return odd;
    }

    public static void setStake(BettingPage sportsPage, double stake) {
        BetSlipContainer betSlipContainer = new BetSlipContainer(sportsPage.getBetSlipContainer());
        betSlipContainer.setStake(String.valueOf(stake));
    }

    public static String getRerun(BettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalRerun().getText();
    }

    public static String getStake(BettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalStake().getText();
    }
}
