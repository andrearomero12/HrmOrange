package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private Questions questions;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void llegarAddemployee(){
        buttonPages.btnPim();
        buttonPages.btnAddEmployee();
    }

    public void fillOutAddEmployee(String firstName,String middleName,String lastName){
        this.txtFirstName.sendKeys(firstName);
        this.txtMiddleName.sendKeys(middleName);
        this.txtLastName.sendKeys(lastName);
        buttonPages.btnSaveEmployee();
    }
}
