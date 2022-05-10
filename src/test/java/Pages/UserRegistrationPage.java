package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class UserRegistrationPage extends CommonMethods {
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement myAcctBtn;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement registerBtn;

    @FindBy (id = "input-firstname")
    public WebElement firstNameBox;

    @FindBy(id = "input-lastname")
    public WebElement lastNameBox;

    @FindBy(id = "input-email")
    public WebElement emailBox;

    @FindBy(id = "input-telephone")
    public WebElement phoneBox;

    @FindBy(id = "input-password")
    public WebElement passwordBox;

    @FindBy(id = "input-confirm")
    public WebElement passwordConfirmBox;

    @FindBy(xpath = "(//input[@value='0'])[1]")
    public WebElement radioButton;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement submitBtn;

    public UserRegistrationPage(){
        PageFactory.initElements(driver, this);
    }
}
