package com.domain.pages;

import com.domain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;


    public void login(String username, String password)  {

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();



    }
}
