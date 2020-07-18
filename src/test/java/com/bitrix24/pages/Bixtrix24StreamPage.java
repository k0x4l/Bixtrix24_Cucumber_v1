package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bixtrix24StreamPage {

    public  Bixtrix24StreamPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@id='pagetitle']")
    public WebElement streamActivity;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(xpath = "//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'][1]")
    public WebElement UploadFilesAndImages;

}
