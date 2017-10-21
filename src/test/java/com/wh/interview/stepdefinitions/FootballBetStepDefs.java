package com.wh.interview.stepdefinitions;

import com.wh.interview.BaseTest;
import com.wh.interview.components.betting.CompetitionsTab;
import com.wh.interview.helpers.Helper;
import com.wh.interview.pages.BettingPage;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;

import static com.wh.interview.actions.FootballNavigation.chooseAndGetOdd;
import static com.wh.interview.actions.FootballNavigation.getFootballCompetitions;
import static com.wh.interview.actions.FootballNavigation.getRerun;
import static com.wh.interview.actions.FootballNavigation.getStake;
import static com.wh.interview.actions.FootballNavigation.goToFootball;
import static com.wh.interview.actions.FootballNavigation.goToSportsPage;
import static com.wh.interview.actions.FootballNavigation.setStake;
import static com.wh.interview.helpers.Helper.setNumberFormat;
import static org.junit.Assert.assertEquals;

public class FootballBetStepDefs implements En {

    private double stake = 0.0;
    private String odd = null;
    private BettingPage sportsPage;
    private CompetitionsTab competitionsTab;

    public FootballBetStepDefs() {
        Given("^Customer is on William Hill betting page$", () -> {
            WebDriver driver = Hooks.driver;
            goToSportsPage(driver);
            sportsPage = new BettingPage(driver);
        });
        When("^Customer navigates to a Premiership football event$", () -> {
            goToFootball(sportsPage);
            competitionsTab = getFootballCompetitions(sportsPage);
            odd = chooseAndGetOdd(competitionsTab);
        });
        When("^Customer bets (.+) for the home team to ‘Win’$", (Double declaredStake) -> {
            setStake(sportsPage, declaredStake);
            stake = declaredStake;
        });
        Then("^Proper odd and return are displayed$", () -> {
            String expectedRerun = Helper.calculateReturn(stake, odd);

            assertEquals(expectedRerun, getRerun(sportsPage));
            assertEquals(setNumberFormat(stake), getStake(sportsPage));
        });
    }
}
