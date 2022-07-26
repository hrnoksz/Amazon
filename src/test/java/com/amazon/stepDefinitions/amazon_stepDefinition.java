package com.amazon.stepDefinitions;

import com.amazon.pages.AmazonPage;
import com.amazon.utilities.BrowserUtils;
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

        List<String> phoneListName = BrowserUtils.getElementsText(page.phoneList);

        //Assert.assertEquals(8, phoneListName.size() );
        Assert.assertTrue(phoneListName.size()>=1);
        //Assert.assertFalse(phoneListName.isEmpty());

    }

    @Then("buyer click on product")
    public void buyer_click_on() {
        BrowserUtils.getPhones(page.phoneList).get(0).click();
    }
    @Then("buyer check information")
    public void buyer_check() {

        String result = page.productTitle.getText().substring(6,15)
                + "  Size:" + page.productSize.getText()+"\n"
                + "Color:"+page.productColor.getText()+"  Price:" + page.productPrice.getText()+"\n"
                + "Stock:"+page.productStock.getText();
        System.out.println(result);

    }



}
