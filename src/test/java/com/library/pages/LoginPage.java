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

    public void login(String role) {
        String usernameValue, passwordValue;

        switch (role) {

            case "librarian":
                System.out.println("I log in as a Librarian.");
                usernameValue = ConfigurationReader.getProperty("librarian.username");
                passwordValue = ConfigurationReader.getProperty("librarian.password");
                username.sendKeys(usernameValue);
                password.sendKeys(passwordValue, Keys.ENTER);
                break;

            case "student1":
                System.out.println("I log in as a Student.");
                usernameValue = ConfigurationReader.getProperty("student1.username");
                passwordValue = ConfigurationReader.getProperty("student1.password");
                username.sendKeys(usernameValue);
                password.sendKeys(passwordValue, Keys.ENTER);
                break;

            case "student2":
                System.out.println("This is my evil twin brother");
                usernameValue = ConfigurationReader.getProperty("student2.username");
                passwordValue = ConfigurationReader.getProperty("student2.password");
                username.sendKeys(usernameValue);
                password.sendKeys(passwordValue, Keys.ENTER);
                break;

            default:
               throw new RuntimeException("NO USERS FOUND. CHECK YOUR CONFIGURATION FILES dummy");
        }


    }


}


