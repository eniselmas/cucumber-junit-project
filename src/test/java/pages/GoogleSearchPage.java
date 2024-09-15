package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(css = "a[class='FLP8od']")
    public WebElement capitalText;

}
