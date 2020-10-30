package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.BrowserWait;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }


    @When("user logs in")
    public void user_logs_in() {
        loginPage.login();
        BrowserWait.wait(3);


    }

    @Then("user should see homepage")
    public void user_should_see_homepage()  {
        String expected = "Dashboard";
        String actual = loginPage.getPageSubTitleText().trim();

        Assert.assertEquals("Title is not correct", expected, actual);
        System.out.println("I see the Dashboard");
        BrowserWait.wait(3);
        Driver.closeDriver();
    }











}
