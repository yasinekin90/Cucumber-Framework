package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {

    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(xpath = "//button[text()=\"Add Element\"]")
    public WebElement addElement;

@FindBy(xpath = "//button[text()=\"Delete\"]")
    public WebElement deleteButton;

@FindBy(id = "elements")
    public WebElement deleteText;

}
