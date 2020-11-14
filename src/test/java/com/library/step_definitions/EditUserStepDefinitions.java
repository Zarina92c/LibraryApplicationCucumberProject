package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.UserManagementPage;
import com.library.utils.BrowserWait;
import com.library.utils.LibraryUserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditUserStepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();


    @Then("user clicks on edit user button")
    public void user_clicks_on_edit_user_button() {
     userManagementPage.click_editUserButton("1");

    }

    @When("user edit user information")
    public void user_edit_user_information(){
    userManagementPage.editUserName("Baklava lover");
    userManagementPage.editUserName("urfa@baklava.com");



    }
    @When("clicks on save changes button")
    public void clicks_on_save_changes_button() {
     BrowserWait.wait(3);
        userManagementPage.click_saveChangeButton();


    }


    @Then("user should see the {string} message")
    public void userShouldSeeTheTheUserUpdatedMessage() {
        userManagementPage.assertionUpdateUser();
    }
}