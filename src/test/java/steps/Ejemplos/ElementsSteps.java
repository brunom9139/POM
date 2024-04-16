package steps.Ejemplos;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Ejemplos.ElementsPage;

public class ElementsSteps {
    WebDriver driver = WebDriverManager.getDriver();
    ElementsPage elementsObject = new ElementsPage(driver);


    @Y("hago click en textBox")
    public void hagoClickEnTextBox() throws Exception {
        elementsObject.hacerClickEnTextBoxFormularioPaginaCompras();
    }


}
