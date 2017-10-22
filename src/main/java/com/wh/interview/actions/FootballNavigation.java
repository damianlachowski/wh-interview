package com.wh.interview.actions;

import com.wh.interview.components.betting.BetSlipContainer;
import com.wh.interview.components.betting.CompetitionsTab;
import com.wh.interview.components.betting.Event;
import com.wh.interview.components.betting.EventContainer;
import com.wh.interview.components.betting.FootballContextSidebar;
import com.wh.interview.components.betting.QuickLinksSidebar;
import com.wh.interview.pages.interfaces.IBettingPage;
import org.openqa.selenium.By;


// Class for navigation through the betting page. It utilizes betting related page objects.


public abstract class FootballNavigation {
    // Method that clicks "Football" link in "Popular" sidebar
    public static void goToFootball(IBettingPage sportsPage) {
        QuickLinksSidebar quickLinksSidebar = new QuickLinksSidebar(sportsPage.getPopular());
        quickLinksSidebar.getFootball().click();
    }

    // Method that returns "Competition" tab conent
    public static CompetitionsTab getFootballCompetitions(IBettingPage sportsPage) {
        FootballContextSidebar footballContextSidebar = new FootballContextSidebar(sportsPage.getContextSidebar());
        footballContextSidebar.getCompetitions().click();
        return new CompetitionsTab(sportsPage.getCompetitionsTab());
    }


    // Method that clicks home team win in first event from English Premier League
    public static String chooseAndGetOdd(CompetitionsTab competitionsTab) {
        // Check whethet English Premier League is expanded and if not click it to expand
        if(!competitionsTab.isPremierLeagueExpanded()) {
            competitionsTab.getEnglishPremierLeague().click();
        }
        EventContainer eventContainer = new EventContainer(competitionsTab.getEnglishPremierLeagueEvents());
        Event event = new Event(eventContainer.getEvents().get(0));
        String odd = event.getHomeWin().getText();
        event.getHomeWin().click();

        return odd;
    }

    // Method that sets stake
    public static void setStake(IBettingPage sportsPage, double stake) {
        BetSlipContainer betSlipContainer = new BetSlipContainer(sportsPage.getBetSlipContainer());
        betSlipContainer.setStake(String.valueOf(stake));
    }

    // Method that returns total return from bet slip tab
    public static String getReturn(IBettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalReturn().getText();
    }

    // Method that returns total stake from bet slip tab
    public static String getStake(IBettingPage sportsPage) {
        return new BetSlipContainer(sportsPage.getBetSlipContainer()).getTotalStake().getText();
    }
}
