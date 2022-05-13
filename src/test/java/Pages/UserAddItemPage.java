package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class UserAddItemPage extends CommonMethods {


    @FindBy(xpath = "//a[contains(text(),'Your Store']")
    public WebElement yourStoreBtn;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement clickSearch;

    @FindBy(xpath ="//a[normalize-space()='MacBook Air']")
    public WebElement macBookAirBtn;

    @FindBy(id="button-cart")
    public WebElement addToCartBtn;


    public  UserAddItemPage(){
        PageFactory.initElements(driver, this);
    }





}
