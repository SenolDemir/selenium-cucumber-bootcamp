package com.domain.pages;

import com.domain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage extends DashboardPage{

    public PIMPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")
    public WebElement addEmployeeBtn;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement middleNameInput;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;







}
