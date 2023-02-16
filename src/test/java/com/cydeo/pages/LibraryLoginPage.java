package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;
    @FindBy(id = "inputPassword")
    public WebElement inputPassword;
    @FindBy(css ="button.btn.btn-lg.btn-primary.btn-block")
    public WebElement signInButton;

}
