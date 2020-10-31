package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends LoginPage{

    @FindBy(xpath = "//span[.='Dashboard']")
    protected WebElement dashboardButton;

    @FindBy(xpath = "//span[.='Users']")
    protected WebElement usersButton;

    public void click_dashboardButton(){
        dashboardButton.click();
    }
    public void click_usersButton(){
        usersButton.click();
    }

}
