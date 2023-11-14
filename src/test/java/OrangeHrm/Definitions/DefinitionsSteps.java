package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.MyInfoPage;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);

    private PimPage pimPage = new PimPage(driver);

    private MyInfoPage myInfoPage = new MyInfoPage(driver);


    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    //etiqueta tipo When
    @When("^the user fill out user (.*) and password (.*)$")
    public void fillOutLogin(String userName, String password) throws SQLException {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @When("^user gets to add employee$")
    //el usuario llega hasta agregar empleado
    public void llegarAddEmployee() {
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAddemployee();
    }

    @When("^the user fill out firstName (.*) middleName (.*) lastName (.*)$")
    public void fillOutAddEmployee(String firstName, String middleName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployee(firstName, middleName, lastName);

    }

    @When("^User goes to contact details$")
    //El usuario llega hasta detalles de contacto
    public void llegarAddContact() {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.createAddContact();
    }
    @When("^User creates a contact Street 1 (.*) Street 2 (.*) City (.*) State/Province (.*)$")
    public void fillOutAddContact(String street1, String street2, String city, String state) {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.fillOutAddContact(street1,street2,city,state);
    }

    @When("^User search country (.*)$")
    public void buscarPais(String typeCountry) {
        this.myInfoPage = new MyInfoPage(driver);
        this.myInfoPage.buscarPais(typeCountry);
    }

}
