package com.amazon.stepDefinitions;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon_stepDefinition {

    @Given("buyer at Amazon home page")
    public void buyer_at_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("buyer searches {string}")
    public void buyer_searches(String string) {

    }
    @Then("the results are listed")
    public void the_results_are_listed() {

    }
    @Then("buyer click on {string}")
    public void buyer_click_on(String string) {

    }
    @Then("buyer check {string}")
    public void buyer_check(String string) {

    }



}
