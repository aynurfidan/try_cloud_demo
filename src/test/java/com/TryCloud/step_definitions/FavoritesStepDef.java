package com.TryCloud.step_definitions;

import com.TryCloud.pages.DashboardPage;
import com.TryCloud.pages.FilesPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    @And("user choose the Add to {string} option")
    public void userChooseTheAddToOption(String option) {


        String currentFileName = filesPage.fileName.getText();
        System.out.println(currentFileName);

        if (option.contains("favorites") && !filesPage.firstOption.getText().equals(option)) {
            filesPage.firstOption.click();
            BrowserUtils.highlight(filesPage.actionIcon);
            filesPage.actionIcon.click();
            FilesPage.setFileNameHolder(currentFileName);

        } else {
            FilesPage.setFileNameHolder(currentFileName);

        }
    }
    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        filesPage.favoritesButton.click();

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        String expectedName=filesPage.favFileName.getText();
        System.out.println(expectedName);
        Assert.assertEquals(FilesPage.getFileNameHolder(), expectedName);

    }



}
