package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "a-autoid-0")
    public WebElement cookies;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> phoneList;


}
