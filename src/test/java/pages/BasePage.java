package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath="//button[.='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath="//button[.='Order']")
    public WebElement orderBtn;

    @FindBy(xpath="//button[.='Logout']")
    public WebElement logoutBtn;


}
