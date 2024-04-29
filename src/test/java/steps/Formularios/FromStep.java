package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.FormPage;
import pages.HomePage;

public class FromStep {
    WebDriver driver = WebDriverManager.getDriver();
    HomePage inicio = new HomePage(driver);
    FormPage page = new FormPage(driver);

    @Dado("me dirijo al formulario")
    public void meDirijoAlFormulario() throws Exception {
        inicio.clickFrom();
        page.clickParticipeFrom();
    }
    @Cuando("cargo mis datos {string} {string} {string} {string} {string} {string} {string}")
    public void cargoMisDatos(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
        page.cargoNombre2NombreSexoNumeroTel(arg0,arg1,arg2,arg3);
        page.cargoFecha();
        page.escriboDirecction(arg4);
        page.estadoYCIudad(arg4,arg5);
    }

    @Y("doy a SUBMIT")
    public void doyASUBMIT() throws Exception {
        page.clickSubmid();
    }

    @Entonces("valido Studen Name{string} y cierro pestania")
    public void validoStudenNameYCierroPestania(String arg0) {
        page.validoCarga(arg0);
    }
}
