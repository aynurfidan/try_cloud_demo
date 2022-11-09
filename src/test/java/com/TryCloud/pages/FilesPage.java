package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }

  //  @FindBy(xpath = "")


    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement actionIcon;










}
