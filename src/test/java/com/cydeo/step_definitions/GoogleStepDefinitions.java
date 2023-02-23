package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

GooglePages pages = new GooglePages();
    @Given("user is on Google page")
    public void user_is_on_google_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Driver.getDriver().getTitle().equals("Google");

    }

    @And("user should be able to press enter")
    public void userShouldBeAbleToPressEnter() {
        pages.searchBox.sendKeys(Keys.ENTER);
    }

    @When("user should be able to type {string} in the searchbox")
    public void userShouldBeAbleToTypeInTheSearchbox(String string) {
        pages.searchBox.sendKeys(string);
    }

    @Then("user should be able to see {string} is in the google title")
    public void userShouldBeAbleToSeeIsInTheGoogleTitle(String string) {
        Assert.assertTrue(pages.allTextResults.getText().contains(string));
        System.out.println(pages.allTextResults.getText());
    }
}
