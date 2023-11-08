package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);

    private PimPage pimPage = new PimPage(driver);


    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    //etiqueta tipo When
    @When("^the user fill out user (.*) and password (.*)$")
    public void fillOutLogin(String userName, String password) {
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
}