package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

GooglePages pages = new GooglePages();
    @When("user is on Google page")
    public void user_is_on_google_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Driver.getDriver().getTitle().equals("Google");

    }

    @When("user should be able to type anything in the searchbox")
    public void userShouldBeAbleToTypeAnythingInTheSearchbox() {
        pages.searchBox.sendKeys("Java");
    }

    @And("user should be able to press enter")
    public void userShouldBeAbleToPressEnter() {
        pages.searchBox.sendKeys(Keys.ENTER);
    }

    @And("user should see results of search key")
    public void userShouldSeeResultsOfSearchKey() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Java"));
    }

    @Then("user should be able to click first result")
    public void userShouldBeAbleToClickFirstResult() {
        pages.firstJavaResult.click();
    }
}
