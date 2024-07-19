package steps.demoqa;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import pages.adminPage.AdminPage;
import pages.demoqa.ElementsPageDemo;
import pages.demoqa.PrincipalPageDemo;

public class PrincipalStep {
    WebDriver driver = WebDriverManager.getDriver();
    PrincipalPageDemo princPage = new PrincipalPageDemo(driver);
    ElementsPageDemo elemPage = new ElementsPageDemo(driver);

    @Dado("que ingreso a elements")
    public void queIngresoAElements() throws Exception {
        princPage.clickEnElementos();
    }

    @Cuando("me dirijo a text box")
    public void meDirijoATextBox() throws Exception {
        elemPage.clickEnTextBox();
    }

    @Entonces("completo los campos con los datos {string} {string} {string} {string} y envio")
    public void completoLosCamposConLosDatosYEnvio(String name, String email, String dir1, String dir2) throws Exception {
        elemPage.completarTexBox(name, email, dir1, dir2);
    }

    @Cuando("me dirijo a checkbox")
    public void meDirijoACheckbox() throws Exception {
        elemPage.clickEnCheckBox();
    }

    @Entonces("tildo la casilla hogar")
    public void tildoLaCasillaHogar() throws Exception {
        elemPage.clickEnCheckHogar();
    }
}
