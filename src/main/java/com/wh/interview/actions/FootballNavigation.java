package com.wh.interview.actions;

import com.wh.interview.components.betting.BetSlipContainer;
import com.wh.interview.components.betting.CompetitionsTab;
import com.wh.interview.components.betting.Event;
import com.wh.interview.components.betting.EventContainer;
import com.wh.interview.components.betting.FootballContextSidebar;
import com.wh.interview.components.betting.QuickLinksSidebar;
import com.wh.interview.pages.interfaces.IBettingPage;

public abstract class FootballNavigation {
    public static void goToFootball(IBettingPage sportsPage) {
        QuickLinksSidebar quickLinksSidebar = new QuickLinksSidebar(sportsPage.getPopular());
        quickLinksSidebar.getFootball().click();
    }

    public static CompetitionsTab getFootballCompetitions(IBettingPage sportsPage) {
        FootballContextSidebar footballContextSidebar = new FootballContextSidebar(sportsPage.getContextSidebar());
        footballContextSidebar.getCompetitions().click();
        return new CompetitionsTab(sportsPage.getCompetitionsTab());
    }

    public static String chooseAndGetOdd(CompetitionsTab competitionsTab) {
        String odd;
        EventContainer eventContainer = new EventContainer(competitionsTab.getEnglishPremierLeagueEvents());
        Event event = new Event(eventContainer.getEvents().iterator().next());
        odd = event.getHomeWin().getText();
        if (event.getHomeWin().isDisplayed()) {
            event.getHomeWin().click();
        } else {
            competitionsTab.getEnglishPremierLeague().click();
            event.getHomeWin().click();
        }

        return odd;
    }

    public static void setStake(IBettingPage sportsPage, double stake) {
        BetSlipContainer betSlipContainer = new BetSlipContainer(sportsPage.getBetSlipContainer());
        betSlipContainer.setStake(String.valueOf(stake));
    }

    public static String getReturn(IBettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalRerun().getText();
    }

    public static String getStake(IBettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalStake().getText();
    }
}
