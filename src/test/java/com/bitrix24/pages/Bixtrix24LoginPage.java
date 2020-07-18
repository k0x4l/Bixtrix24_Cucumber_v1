package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bixtrix24LoginPage {

    public Bixtrix24LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;


}
