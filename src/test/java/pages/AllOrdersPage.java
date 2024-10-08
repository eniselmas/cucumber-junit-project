package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllOrdersPage extends BasePage{

    public AllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//table[@class='table is-fullwidth']//tbody//tr[1]//td[1]")
    public WebElement firstRowname;
}
