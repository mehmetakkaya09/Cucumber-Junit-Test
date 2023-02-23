package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePages locators = new WebTablePages();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
    }
    @When("User should be able to write username and password")
    public void user_should_be_able_to_write_username_and_password(Map<String, String> credentials) {

        locators.username.sendKeys(credentials.get("username"));
        locators.password.sendKeys(credentials.get("password"));
         
    }
    @And("User should be able to click login button")
    public void user_should_be_able_to_click_login_button() {
         locators.loginButton.click();
    }

    @Then("User should be able to see {string} end of th URL")
    public void userShouldBeAbleToSeeEndOfThURL(String arg0) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(arg0));
    }

    @Given("user is already logged in to web table app")
    public void userIsAlreadyLoggedInToWebTableApp() {
    }

    @When("user is on the Order page")
    public void userIsOnTheOrderPage() {
    }

    @Then("user enters appropriate test data {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userEntersAppropriateTestData(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {
    }

    @And("user clicks to Process Order")
    public void userClicksToProcessOrder() {
    }

    @Then("user should see new order in the table on View all orders")
    public void userShouldSeeNewOrderInTheTableOnViewAllOrders() {
    }
}
