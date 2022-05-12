package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class UserLoginPage extends CommonMethods {

    @FindBy(xpath="//a[@class=‘list-group-item’][normalize-space()=‘Login’]")
    public WebElement login;

    @FindBy(id = "input-email")
     public WebElement emailBox;

    @FindBy(id="input-password")
    public WebElement passwordBox;

    @FindBy(id="//input[@type=\"submit\"]")
    public WebElement loginBtn;

    public  UserLoginPage(){
        PageFactory.initElements(driver, this);
    }
}
