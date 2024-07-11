package com.domain.pages;

import com.domain.utilities.BrowserUtils;
import com.domain.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class DashboardPage {


    public DashboardPage() {

        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(xpath = "//span[text()='PIM']")
    public WebElement pageButton;

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    public WebElement pageTitle;


    public void navigateToPage(String title) {

        BrowserUtils.verifyElementDisplayed(By.xpath("//span[text()='" + title + "']"));
        Driver.get().findElement(By.xpath("//span[text()='" + title + "']")).click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(pageTitle.getText().contains(title));
    }


}
