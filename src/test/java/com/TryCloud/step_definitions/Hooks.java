package com.TryCloud.step_definitions;

import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    //@Before(value = "@login", order =2)
    public void setupForLogin() {
        // if you want any code to run before any specific feature or scenario
        // you can use value = "@tagname" to determine this
       // System.out.println("Setting up browser using cucumber @Before @login scenario");

    }



    @After
    public void tearDownScenario(Scenario scenario){
        // we will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


     //   Driver.closeDriver();
    }

    //@BeforeStep
    public void setupScenarioStep(){

    }
   // @BeforeStep
    public void setupScenarioForLogin(){

    }
}
