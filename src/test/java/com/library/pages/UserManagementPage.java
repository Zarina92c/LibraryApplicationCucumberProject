package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagementPage {

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    WebElement addUserButton;

    public  void click_addUserButton(){
        addUserButton.click();
    }

    @FindBy(xpath = "//tr[1]/td[2]")
    WebElement userIDBox;


}
