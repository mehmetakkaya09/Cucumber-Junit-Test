package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TableBasePage {

    public TableBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrders;
    

    @FindBy(xpath = "//*[text() = 'View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//*[text() = 'Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//*[text() = 'Logout']")
    public WebElement logoutButton;

    



}
