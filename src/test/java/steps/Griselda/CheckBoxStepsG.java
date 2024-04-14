package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Ejemplos.ElementsPage;
import pages.Griselda.CheckBoxPageG;

public class CheckBoxStepsG {
    WebDriver driver = WebDriverManager.getDriver();
    CheckBoxPageG objeto_check = new CheckBoxPageG(driver);


    @Entonces("verifico que apareza el texto {string}")
    public void verificoQueAparezaElTexto(String txt) {
        objeto_check.validarSeleccion(txt);
    }

    @Y("tildo todos los checkbox de hogar")
    public void tildoTodosLosCheckboxDeHogar() {

        objeto_check.TildarTodos();
    }
}
