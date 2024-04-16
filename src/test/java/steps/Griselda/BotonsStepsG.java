package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Griselda.BotonesPageGri;
import pages.Griselda.CheckBoxPageG;

public class BotonsStepsG {

    WebDriver driver = WebDriverManager.getDriver();
    BotonesPageGri objeto_botons = new BotonesPageGri(driver);
    @Y("hago doble click en el el primer boton")
    public void hagoDobleClickEnElElPrimerBoton() {
        objeto_botons.hacerDobleClick();
    }

    @Entonces("verifico que aparezca el texto {string}")
    public void verificoQueAparezcaElTexto(String txt) {
        objeto_botons.verificarAccion(txt);
    }
}
