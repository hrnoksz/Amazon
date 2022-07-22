package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
