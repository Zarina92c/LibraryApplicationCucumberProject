package com.library.step_definitions;

import com.library.pages.LibrarianSortUsersPage;
import io.cucumber.java.en.Then;

public class SortingUserListStepDefinitions {

    LibrarianSortUsersPage librarianSortUsersPage = new LibrarianSortUsersPage();

    @Then("user navigates to Group and clicks on it")
    public void user_navigates_to_and_clicks_on_it() {
        librarianSortUsersPage.clickOnGroup();


    }

    @Then("user verifies the Group is sorted")
    public void user_verifies_the_group_is_sorted() {
        librarianSortUsersPage.assertGroupSorting();


    }
    @Then("user navigates to Status")
    public void user_navigates_to() {
        librarianSortUsersPage.clickOnStatus();

    }




    @Then("user verifies the Status is sorted")
    public void user_verifies_the_status_is_sorted() {
        librarianSortUsersPage.assertStatusSorting();

    }
}
