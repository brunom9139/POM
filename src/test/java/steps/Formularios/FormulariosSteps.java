package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.*;
import org.openqa.selenium.WebDriver;
import pages.FormPage;

public class FormulariosSteps {
    WebDriver driver = WebDriverManager.getDriver();
    FormPage objetoFormPage = new FormPage(driver);

    @Entonces("puedo validar que el formulario se completo correctamente")
    public void puedoValidarQueElFormularioSeCompletoCorrectamente() {
    }
    @Y("completo la session de text box con los datos {string} {string} {string}")
    public void completoLaSessionDeTextBoxConLosDatos(String full_name, String email, String address) throws Exception {
        objetoFormPage.ingresarNombreCompleto(full_name);
        objetoFormPage.ingresarEmail(email);
        objetoFormPage.ingresarDireccion(address);
    }
    @Cuando("hago scroll al boton submit y lo apreto")
    public void hagoScrollAlBotonSubmitYLoApreto() {
        objetoFormPage.hacerClickEnBotonStore();
    }

}