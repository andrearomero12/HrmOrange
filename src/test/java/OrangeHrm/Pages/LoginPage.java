package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

//Clase
public class LoginPage {

    //Llamados
    private ButtonPages buttonPages;
    private Questions questions;

    //Identificador de elementos
    @FindBy( how = How.NAME, using = "username")
    //Variable de elemento
    private WebElement inputuser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement inputpass;

    //Constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    //Metodo
    public void fillOutLogin(String userName, String password) throws SQLException {
        this.inputuser.sendKeys(userName);
        this.inputpass.sendKeys(password);
        //this.consulDataBase.consultUser();
        this.buttonPages.btnLogin();
        this.questions.timeSeconds(2);
        this.questions.screenShot();
    }

}
