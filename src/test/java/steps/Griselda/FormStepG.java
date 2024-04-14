package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import org.openqa.selenium.WebDriver;
import pages.Griselda.FormPageG;
import pages.Griselda.HomeGriPage;

public class FormStepG {
    WebDriver driver = WebDriverManager.getDriver();
    FormPageG obj_form = new FormPageG(driver);


    @Cuando("me dirijo a formulario de practica")
    public void meDirijoAFormularioDePractica() throws Exception{
        obj_form.ingresarAFormularioPractica();
    }
}
