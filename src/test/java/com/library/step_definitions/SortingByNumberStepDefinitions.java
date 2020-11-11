package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.RecordsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortingByNumberStepDefinitions {
    // Zarinas test case AC#6
    RecordsPage sortingByNumberPage = new RecordsPage();


    @When("chooses the number from show records dropdown")
    public void chooses_the_number_from_show_records_dropdown() {
      sortingByNumberPage.choose_number();

    }


    @Then("user should see the number of records on the page")
    public void user_should_see_the_number_of_records_on_the_page() {

    sortingByNumberPage.find_all();


    }
}