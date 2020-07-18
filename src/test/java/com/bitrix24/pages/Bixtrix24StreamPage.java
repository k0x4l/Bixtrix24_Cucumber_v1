package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bixtrix24StreamPage {

    public  Bixtrix24StreamPage(){ PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//div[@id='pagetitle']")
        public WebElement streamActivity;

}
