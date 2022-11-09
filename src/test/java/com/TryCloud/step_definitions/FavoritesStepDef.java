package com.TryCloud.step_definitions;

import com.TryCloud.pages.DashboardPage;
import com.TryCloud.pages.FilesPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FavoritesStepDef {

    DashboardPage dashboardPage=new DashboardPage();
    FilesPage filesPage=new FilesPage();

    LoginPage loginPage=new LoginPage();

    @Given("the user should be on dashboard page")
    public void theUserShouldBeOnDashboardPage() {
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
    @When("the user clicks the files module")
    public void theUserClicksTheFilesModule() {
        dashboardPage.FilesModule.click();


    }
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
       filesPage.actionIcon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

    }



}
