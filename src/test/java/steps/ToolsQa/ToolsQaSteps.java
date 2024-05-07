package steps.ToolsQa;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.ToolsQaFormulario.ToolsQaPage;

public class ToolsQaSteps {

    WebDriver driver = WebDriverManager.getDriver();
    ToolsQaPage toolsQa = new ToolsQaPage(driver);

    @Dado("que ingreso a toolsqa")
    public void queIngresoAToolsqa() throws Exception {
        toolsQa.clickToolsQa();
    }

    @Cuando("ingreso ingreso en enroll now")
    public void ingresoIngresoEnEnrollNow() {
        toolsQa.clickEnrollNow();
    }

    @Y("completo el formulario {string} {string} {string} {string} {string} {string} {string}")
    public void completoElFormulario(String nombre, String apellido, String email, String telefono, String pais, String ciudad, String comentario) throws Exception {
        toolsQa.cargaFormularioEnrollNow(nombre,apellido,email,telefono,pais,ciudad,comentario);
    }
}
