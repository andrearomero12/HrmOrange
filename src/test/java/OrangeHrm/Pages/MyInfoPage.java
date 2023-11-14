package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListsPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

    private ButtonPages buttonPages;
    private ListsPages listsPages;
    private Questions questions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement txtStreet1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement txtStreet2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement txtState;

    public MyInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.listsPages = new ListsPages(driver);
        this.questions = new Questions(driver);
    }

    public void createAddContact(){
        buttonPages.btnMyinfo();
        buttonPages.btnContactDetails();
    }


    public void fillOutAddContact(String street1 , String street2, String city, String state){
        this.txtStreet1.sendKeys(street1);
        this.txtStreet2.sendKeys(street2);
        this.txtCity.sendKeys(city);
        this.txtState.sendKeys(state);


    }

    public void buscarPais(String typeCountry){
        this.listsPages.roleCountry(typeCountry);
        this.questions.timeSeconds(2);
        buttonPages.btnSaveContact();
    }
}

