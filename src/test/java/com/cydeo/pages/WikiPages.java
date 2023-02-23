package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPages {

    public WikiPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchInput;

    @FindBy(css = "button.pure-button.pure-button-primary-progressive")
    public WebElement searchButton;

    @FindBy(css = "span.mw-page-title-main")
    public WebElement mainHeader;

    @FindBy(css = "div.fn")
    public WebElement imageHeader;


}
