package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Wikipedia_step_definitions {
WikiPages locator = new WikiPages();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiURL"));
    }

    @Then("User clicks wiki search button")
    public void user_clicks_wiki_sear_ch_button() {
        locator.searchButton.click();
    }
    @Then("User should be able to sees {string} is in the wiki title")
    public void user_should_be_able_to_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @Then("User should be able to sees {string} is in the main header")
    public void userShouldBeAbleToSeesIsInTheMainHeader(String string) {
        Assert.assertTrue(locator.mainHeader.getText().equals(string));


    }

    @Then("User should be able to sees {string} is in the image header")
    public void userShouldBeAbleToSeesIsInTheImageHeader(String string) {
        Assert.assertTrue(locator.imageHeader.getText().contains(string));
    }

    @When("User types name in the wiki search box{string}")
    public void userTypesNameInTheWikiSearchBox(String arg0) {
        locator.searchInput.sendKeys(arg0);
    }
}
