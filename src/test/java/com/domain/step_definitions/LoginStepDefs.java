package com.domain.step_definitions;

import com.domain.pages.LoginPage;
import com.domain.utilities.BrowserUtils;
import com.domain.utilities.ConfigurationReader;
import com.domain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("navigate to login page")
    public void navigate_to_login_page() {

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitForPageToLoad(5);

        Assert.assertEquals(url, Driver.get().getCurrentUrl());


    }
    @When("the user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String username, String password) {

        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));


    }


    @Then("user should login to application")
    public void user_should_login_to_application() {

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(url, Driver.get().getCurrentUrl());

    }

}
