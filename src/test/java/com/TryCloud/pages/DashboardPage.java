package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement FilesModule;












}
