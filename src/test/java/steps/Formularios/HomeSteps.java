package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps {
    WebDriver driver = WebDriverManager.getDriver();
    HomePage objeto_home = new HomePage(driver);

    @Dado("que ingreso a la seccion elements")
    public void queIngresoALaSeccionElements() throws Exception {
        //Allure.description("Navigate to the login page and verify the page is loaded successfully.");
        //Allure.step("Navigate to the login page"); // Usamos la anotación Step para añadir detalles
        objeto_home.hacerClickEnElementos();
    }

    @Entonces("valido que aparece el texto {string}")
    public void validoQueApareceElTexto(String texto) {
        objeto_home.validarTexto(texto);
    }

    @Dado("que hago click en cada input")
    public void queHagoClickEnCadaInput() {
        objeto_home.clickVariosInputs();
    }

    @Dado("que hago click en Join Now")
    public void queHagoClickEnJoinNow() throws Exception {
        objeto_home.clickJoinNow();
    }

    @Y("cambio a la nueva ventana")
    public void cambioALaNuevaVentana() {
        objeto_home.cambiarUltimaVentana();
    }


    @Y("hago click en el boton Tutorial")
    public void hagoClickEnElBotonTutorial() throws Exception {
        objeto_home.clickTutorial();
    }

    @Entonces("regreso a la ventana principal")
    public void regresoALaVentanaPrincipal() {
        objeto_home.volverVentanaPrincipal();
    }

    @Dado("que ingreso a widget")
    public void queIngresoAWidget() throws Exception {
        objeto_home.clickInteraccioesSostenibles();
    }
}
