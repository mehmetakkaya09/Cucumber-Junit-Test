package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LibraryStepDefinitions {
WebDriver driver = Driver.getDriver();
LibraryLoginPage pages = new LibraryLoginPage();
    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get(ConfigurationReader.getProperty("libraryURL"));
    }
    @When("user should be able to write correct user name as a librarian")
    public void user_should_be_able_to_write_correct_user_name_as_a_librarian() {
        pages.inputEmail.sendKeys("librarian27@library");
    }
    @When("user should be able to write correct password as a librarian")
    public void user_should_be_able_to_write_correct_password_as_a_librarian() {
        pages.inputPassword.sendKeys("VDaEMbSR");

    }
    @When("user should be able to click on login button")
    public void user_should_be_able_to_click_on_login_button() {
        pages.signInButton.click();
    }
    @Then("user should be able to see dashboard as a librarian")
    public void user_should_be_able_to_see_dashboard_as_a_librarian() {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @When("user should be able to write correct user name as a student")
    public void user_should_be_able_to_write_correct_user_name_as_a_student() {
        pages.inputEmail.sendKeys("student27@library");
    }
    @When("user should be able to write correct password as a student")
    public void user_should_be_able_to_write_correct_password_as_a_student() {
        pages.inputPassword.sendKeys("oMapQ5NZ");
    }


    @Then("user should be able to see dashboard as a student")
    public void user_should_be_able_to_see_dashboard_as_a_student() {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @When("user should be able to write correct user name as a admin")
    public void user_should_be_able_to_write_correct_user_name_as_a_admin() {
        pages.inputEmail.sendKeys("librarian30@library");
    }
    @When("user should be able to write correct password as a admin")
    public void user_should_be_able_to_write_correct_password_as_a_admin() {
pages.inputPassword.sendKeys("A3y8346j");
    }


    @Then("user should be able to see dashboard as a admin")
    public void user_should_be_able_to_see_dashboard_as_a_admin() {
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }



}
