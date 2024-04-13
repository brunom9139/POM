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


    @Y("tildo todos")
    public void tildoTodos() {
        objeto_check.TildarTodos();
    }

    @Entonces("verifico que apareza el texto {string}")
    public void verificoQueAparezaElTexto(String txt) {
        objeto_check.validarSeleccion(txt);
    }
}
