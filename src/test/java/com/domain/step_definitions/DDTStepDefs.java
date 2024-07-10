package com.domain.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DDTStepDefs {



    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {

        System.out.println(string);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        System.out.println(menuOptions);
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

        System.out.println("This is login page");
    }

    @When("the user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String,String> userInfo) {

        System.out.println(userInfo.get("username"));
        System.out.println(userInfo.get("password"));
        System.out.println(userInfo.get("firstname"));
        System.out.println(userInfo.get("lastname"));
    }

    @When("the user enter valid {string} and {string} as {string}")
    public void theUserEnterValidAndAs(String username, String password, String position) {

        System.out.println(username);
        System.out.println(password);
        System.out.println(position);
    }

    @Then("the user should reach dashboard")
    public void theUserShouldReachDashboard() {

        System.out.println("This is dashboard");
    }




}
