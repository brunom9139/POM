package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.FormPage;
import pages.HomePage;

public class StepForm {
    WebDriver driver = WebDriverManager.getDriver();
    HomePage inicio = new HomePage(driver);
    FormPage page = new FormPage(driver);
    @Dado("me dirijo al formulario")
    public void meDirijoAlFormulario() throws Exception {
        inicio.clickFrom();
        page.clickParticipeFrom();
    }


    @Y("cargo mis datos {string} {string} y mi fontello {string} correo {string}")
    public void cargoMisDatosYMiFontelloCorreo(String arg0, String arg1, String arg2, String arg3) throws Exception {
        page.cargoNombre2NombreSexoNumeroTel(arg0,arg1,arg2);
        page.ingresarEmail(arg3);
        page.cargoFecha();
    }
}
