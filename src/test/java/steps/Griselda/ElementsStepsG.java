package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import org.openqa.selenium.WebDriver;
import pages.Griselda.CheckBoxPageG;
import pages.Griselda.ElementsPageG;

public class ElementsStepsG {
    WebDriver driver = WebDriverManager.getDriver();
    ElementsPageG objeto_elements = new ElementsPageG(driver);

    @Cuando("me dirijo a casilla de verificacion")
    public void meDirijoACasillaDeVerificacion() {
        objeto_elements.hacerClickEnCheckBox();

    }

    @Cuando("me dirijo a botones")
    public void meDirijoABotones() throws Exception{
        objeto_elements.hacerClickEnBotones();
    }
}
