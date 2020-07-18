package com.bitrix24.step_definitions;

import com.bitrix24.pages.Bixtrix24LoginPage;
import com.bitrix24.pages.Bixtrix24StreamPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {

    Bixtrix24LoginPage bixtrix24LoginPage = new Bixtrix24LoginPage();
    Bixtrix24StreamPage bixtrix24StreamPage = new Bixtrix24StreamPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("http://login2.nextbasecrm.com/");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("User logs in as a User \\(marketing)")
    public void userLogsInAsAUserMarketing() {
        wait.until(ExpectedConditions.visibilityOf(bixtrix24LoginPage.usernameBox));
        String username = ConfigurationReader.getProperty("username");
        bixtrix24LoginPage.usernameBox.sendKeys(username);

        String password = ConfigurationReader.getProperty("password");
        bixtrix24LoginPage.passwordBox.sendKeys(password);

        bixtrix24LoginPage.loginButton.click();
    }

    @Then("User should see the Stream")
    public void userShouldSeeTheStream() {

        wait.until(ExpectedConditions.visibilityOf(bixtrix24StreamPage.streamActivity));

        String expectedTitle    = "(1) Portal";
        String actualTitle      = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("User clicks to Message")
    public void userClicksToMessage() {
        wait.until(ExpectedConditions.visibilityOf(bixtrix24StreamPage.messageButton));
        bixtrix24StreamPage.messageButton.click();

    }

    @Given("User should click upload files icon")
    public void userShouldClickUploadFilesIcon() {
        wait.until(ExpectedConditions.visibilityOf(bixtrix24StreamPage.uploadIcon));
        bixtrix24StreamPage.uploadIcon.click();
    }

    @Then("Select a file from local disk")
    public void selectAFileFromLocalDisk() {

/*

        wait.until(ExpectedConditions.visibilityOf(bixtrix24StreamPage.UploadFilesAndImages));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].style.left='0'", bixtrix24StreamPage.UploadFilesAndImages);
        bixtrix24StreamPage.UploadFilesAndImages.sendKeys("/Users/__{{ KoxaL }}__/Desktop/test_bixtrix24.txt");
*/
        //wait.until(ExpectedConditions.visibilityOf(bixtrix24StreamPage.UploadFilesAndImages));
        //bixtrix24StreamPage.UploadFilesAndImages.click();//sendKeys("/Users/__{{ KoxaL }}__/Desktop/test_bixtrix24.txt");
    }

    @Then("User should see the file uploaded")
    public void userShouldSeeTheFileUploaded() {
        System.out.println("Uploaded");
    }
}
