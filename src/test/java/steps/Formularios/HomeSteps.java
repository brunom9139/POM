package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    WebDriver driver = WebDriverManager.getDriver();

    @Dado("que ingreso a la seccion elements")
    public void queIngresoALaSeccionElements() throws Exception {
        //Allure.description("Navigate to the login page and verify the page is loaded successfully.");
        //Allure.step("Navigate to the login page"); // Usamos la anotación Step para añadir detalles
    }

    @Entonces("valido que aparece el texto {string}")

    @Dado("que hago click en cada input")
    public void queHagoClickEnCadaInput() {
    }

    @Dado("que hago click en Join Now")
    public void queHagoClickEnJoinNow() throws Exception {
    }

    @Y("cambio a la nueva ventana")


    @Y("hago click en el boton Tutorial")
    public void hagoClickEnElBotonTutorial() throws Exception {
    }

}
