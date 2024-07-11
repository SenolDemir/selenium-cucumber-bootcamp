package com.domain.step_definitions;

import com.domain.pages.LoginPage;
import com.domain.pages.PIMPage;
import com.domain.utilities.BrowserUtils;
import com.domain.utilities.ConfigurationReader;
import com.domain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PIMStepDefs {

    PIMPage pimPage = new PIMPage();
    LoginPage loginPage = new LoginPage();

    @Given("User login to application with valid credentials")
    public void user_login_to_application_with_valid_credentials() {

        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());


    }
    @Given("User open the {string} page")
    public void user_open_the_page(String page) {

        pimPage.navigateToPage(page);

    }
    @Given("user click to add employee page")
    public void user_click_to_add_employee_page() {

        pimPage.addEmployeeBtn.click();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
        Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());


    }
    @When("User enter employee information")
    public void user_enter_employee_information() {

        pimPage.firstNameInput.sendKeys("Carlos");
        pimPage.middleNameInput.sendKeys("Morata");
        pimPage.lastNameInput.sendKeys("Ancoletti");
        pimPage.submitBtn.click();
        BrowserUtils.waitFor(5);


    }
    @Then("new employee should be added to list")
    public void new_employee_should_be_added_to_list() {

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber";
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(expectedUrl));

    }

    @When("User enter employee informations as {string}, {string}, {string}")
    public void userEnterEmployeeInformationsAs(String firstname, String middlename, String lastname) {

        pimPage.firstNameInput.sendKeys(firstname);
        pimPage.middleNameInput.sendKeys(middlename);
        pimPage.lastNameInput.sendKeys(lastname);
        pimPage.submitBtn.click();
        BrowserUtils.waitFor(5);

    }
}
