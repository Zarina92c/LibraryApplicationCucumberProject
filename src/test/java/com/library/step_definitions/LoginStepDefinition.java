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


    @When("user logs in as a {string}")
    public void user_logs_in(String string) {
        loginPage.login(string);
        BrowserWait.wait(3);

    }


    @Then("user should see homepage name Dashboard")
    public void user_should_see_homepage_Dashboard() {
        String expected = "Dashboard";
        String actual = loginPage.getPageSubTitleText().trim();

        Assert.assertEquals("Title is not correct", expected, actual);
        System.out.println("I see the Dashboard");
        BrowserWait.wait(3);
        Driver.closeDriver();
    }


    @Then("user should see homepage name Books")
    public void user_should_see_homepage_Books() {
        String expected = "Books";
        String actual = loginPage.getPageSubTitleText_Student().trim();

        Assert.assertEquals("Title is not correct", expected, actual);

        System.out.println("I see Books Yaaasss");
        BrowserWait.wait(3);
        Driver.closeDriver();

    }

}







