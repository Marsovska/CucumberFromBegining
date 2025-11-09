package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
    public WebElement pimLocator;

    @FindBy(xpath="//a[@id='menu_pim_addEmployee']")
    public WebElement addEmployeeLocator;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstNameBoxLocator;

    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastNameBoxLocator;

    @FindBy(xpath="//input[@id='middleName']")
    public WebElement middleNameLocator;

    @FindBy(id="btnSave")
    public WebElement saveButtonLocator;

    @FindBy(xpath="//h1[text()='Personal Details']")
    public WebElement personalDetailHeaderLocator;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
