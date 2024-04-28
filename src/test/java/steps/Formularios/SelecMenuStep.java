package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.SelectMenu;

public class SelecMenuStep {
    WebDriver driver = WebDriverManager.getDriver();
    SelectMenu page = new  SelectMenu(driver);
    @Dado("que me dirijo a selec menu de la targeta widgets")
    public void queMeDirijoASelecMenuDeLaTargetaWidgets() throws Exception {
        page.meDirijoASelecMenu();
    }
    @Y("cargo mis opciones {string} {string}")
    public void cargoMisOpciones(String arg0, String arg1) throws Exception {
        page.escriboEnCampo(arg0,arg1);
    page.option3();
    }

    @Y("el resto de campo {string}")
    public void elRestoDeCampo(String arg0) throws Exception {
        page.campoDownYvolvo(arg0);
    }
}
