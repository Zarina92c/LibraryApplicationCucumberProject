package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.SortingByNumberPage_AC6_Zarina;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortingByNumberStepDefinitions_AC6_Zarina {
    // Zarinas test case AC#6
    SortingByNumberPage_AC6_Zarina sortingByNumberPage = new SortingByNumberPage_AC6_Zarina();
    DashboardPage dashboardPage = new DashboardPage();

    @When("chooses the number from show records dropdown")
    public void chooses_the_number_from_show_records_dropdown() {
      sortingByNumberPage.choose_number();

    }


    @Then("user should see the number of records on the page")
    public void user_should_see_the_number_of_records_on_the_page() {

    sortingByNumberPage.find_all();


    }
}