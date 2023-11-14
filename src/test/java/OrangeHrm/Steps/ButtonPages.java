package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
    private WebElement btnSaveContact;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
    private WebElement btnContactDetails;
    @FindBy(how = How.XPATH, using = "//ul/li/a//span[text()='My Info']")
    private WebElement btnMyinfo;

    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//ul/li/a//span[text()='PIM']")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
    private WebElement btnAddEmployee;

    @FindBy(how = How.XPATH, using = "//button[text()=' Save ']")
    private WebElement btnSaveEmployee;

    public ButtonPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
     public void btnLogin (){
         btnLogin.isDisplayed();
         btnLogin.click();
     }

    public void btnPim (){
        btnPim.isEnabled();
        btnPim.click();
    }

    public void btnAddEmployee(){
        btnAddEmployee.isDisplayed();
        btnAddEmployee.click();
    }

    public void btnSaveEmployee(){
        btnSaveEmployee.isDisplayed();
        btnSaveEmployee.click();
    }

    public void btnMyinfo (){
        btnMyinfo.isEnabled();
        btnMyinfo.click();
    }

    public void btnContactDetails(){
        btnContactDetails.isEnabled();
        btnContactDetails.click();
    }

    public void btnSaveContact(){
       btnSaveContact.isEnabled();
       btnSaveContact.click();
    }

}
