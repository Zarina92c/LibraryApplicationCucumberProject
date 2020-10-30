package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy (xpath = "//a[@href='#dashboard']")
    protected WebElement pageSubTitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   public String getPageSubTitleText() {
        return pageSubTitle.getText();
    }

}







