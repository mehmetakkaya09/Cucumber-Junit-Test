package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }
    @After
    public void afterScenario() {
        Driver.closeDriver();
    }



}
