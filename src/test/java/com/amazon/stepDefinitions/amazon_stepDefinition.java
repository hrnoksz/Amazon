package com.amazon.stepDefinitions;

import com.amazon.pages.AmazonPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class amazon_stepDefinition {

    AmazonPage page = new AmazonPage();

    @Given("buyer at Amazon home page")
    public void buyer_at_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if(page.cookies.isDisplayed()){
            page.cookies.click();
        }
    }

    @When("buyer searches {string}")
    public void buyer_searches(String productName) {
        page.searchBtn.sendKeys(ConfigurationReader.getProperty("productName")+ Keys.ENTER);
    }
    @Then("the results are listed")
    public void the_results_are_listed() {

        List<WebElement> result = page.phoneList;
        List<String> phoneListName = new LinkedList<>();

        for (WebElement each : result) {
            if (each.getText().contains("iPhone 13 (512 GB)") || each.getText().contains("iPhone 13 mini")
                    || each.getText().contains("Apple iPhone 13 Pro")) {
                phoneListName.add(each.getText());
            }

        }
        System.out.println("phoneListName = " + phoneListName);

        System.out.println(phoneListName.size());

        Assert.assertEquals(8, phoneListName.size() );

    }
    @Then("buyer click on {string}")
    public void buyer_click_on(String string) {

    }
    @Then("buyer check {string}")
    public void buyer_check(String string) {

    }



}
