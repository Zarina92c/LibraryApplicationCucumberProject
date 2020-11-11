package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.UserManagementPage;
import com.library.utils.BrowserWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditUserStepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();
    Faker faker = new Faker();

    @Then("user clicks on edit user button")
    public void user_clicks_on_edit_user_button() {
     userManagementPage.click_editUserButton("1");

    }

    @When("user edit user information")
    public void user_edit_user_information() {
    userManagementPage.editUserName("John Smith");
    userManagementPage.editEmail("JohnSmith@yahoo.com");


    }
    @When("clicks on save changes button")
    public void clicks_on_save_changes_button() {
     userManagementPage.click_saveChangeButton();


    }
    @Then("user should see new information on the page")
    public void user_should_see_new_information_on_the_page() {
       userManagementPage.assertionUpdateUser();

    }


}