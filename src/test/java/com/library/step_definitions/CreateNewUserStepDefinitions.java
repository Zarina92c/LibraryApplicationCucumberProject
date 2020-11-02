package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewUserStepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("user clicks on users button")
    public void user_clicks_on_users_button() {
        dashboardPage.click_usersButton();
    }




    @Then("user clicks on add user button")
    public void user_clicks_on_add_user_button() {
        userManagementPage.click_addUserButton();
    }
    @When("user adds new user information as student type")
    public void user_adds_new_user_information_as_student_type() {
        userManagementPage.addUser("librarian");
    }
    @When("user clicks on save changes button")
    public void user_clicks_on_save_changes_button() {
        userManagementPage.click_saveChangeButton();
    }
    @Then("user should see new user top of the list")
    public void user_should_see_new_user_top_of_the_list() {
        userManagementPage.assertingNewUserCreated();
    }
}
