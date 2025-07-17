package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.ilcarro.pages.BasePage.driver;

public class SearchCarSteps {
    @And("user clicks on search link")
    public void click_on_search_link(){
        new HomePage(driver).clickOnSearchLink();

    }
    @And("user types a valid city")
    public void type_a_valid_city(){
        new SearchPage(driver).enterCity("null");

    }
    @And("user selects valid date")
    public void select_valid_date() {
        new SearchPage(driver).selectDate("17 Jul 2025", "31 Jul 2025");
    }
    @And("user clicks on search Yalla button")
    public void click_on_search_Yalla_button(){
        new SearchPage(driver).clickOnYallaButton();

    }
    @Then("user verifies not success message is displayed")
    public void verify_not_success_message_is_displayed() {
        new SearchPage(driver).isMessageTextPresent("No available cars in null");
    }
}
