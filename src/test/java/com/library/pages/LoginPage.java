package com.library.pages;

import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="inputEmail")
    private WebElement username;

    @FindBy(id="inputPassword")
    private WebElement password;


    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String usernameValue = ConfigurationReader.getProperty("librarian.username");
        String passwordValue = ConfigurationReader.getProperty("librarian.password");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }


}


