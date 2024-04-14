package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Griselda.FormPracticePageG;
import pages.Griselda.HomeGriPage;

public class FormPracticeStepsG {
    WebDriver driver = WebDriverManager.getDriver();
    FormPracticePageG obj_practica = new FormPracticePageG(driver);

    @Entonces("entrego los datos")
    public void entregoLosDatos() throws Exception {
        obj_practica.entregar();

    }

    @Y("completo los datos del formulario")
    public void completoLosDatosDelFormulario() throws Exception{
        obj_practica.completarFormulario();

    }
}
