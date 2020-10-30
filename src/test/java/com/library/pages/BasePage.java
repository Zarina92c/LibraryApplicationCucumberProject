package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy (xpath = "//a[@href='#dashboard']")
    protected WebElement librarianPageSubTitle;

    @FindBy(xpath = "//a[@href='#books']")
    protected WebElement studentPageSubtitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   public String getPageSubTitleText() {
        return librarianPageSubTitle.getText();
    }

    public String getPageSubTitleText_Student() {
        return studentPageSubtitle.getText();
    }

}







