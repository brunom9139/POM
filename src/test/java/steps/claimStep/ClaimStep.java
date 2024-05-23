package steps.claimStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.claimPage.ClaimPage;
import pages.elements.*;
import pages.principalPage.PrincipalPage;

public class ClaimStep {
    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainsObj = new MainPage(driver);
    ElementsPage elementsObj = new ElementsPage(driver);
    TextBoxPage textBoxObj = new TextBoxPage(driver);
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    WebTablesPage webTables = new WebTablesPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);
    PrincipalPage page_principal = new PrincipalPage(driver);


    ClaimPage claim_objeto = new ClaimPage(driver);
    @Cuando("ingreso en Cleam")
    public void ingresoEnCleam() throws Exception {
            page_principal.clickClaim();
    }

    @Entonces("creo un reclamo al azar sin observaciones")
    public void creoUnReclamoAlAzarSinObservaciones() throws Exception {
        claim_objeto.clickEnAgregar();
        claim_objeto.agregarReclamo();
    }

    @Entonces("agreago una expensa de {string}")
    public void agreagoUnaExpensaDe(String expensa) throws Exception {
        claim_objeto.agregarReclamoConExpensa(expensa);
    }
}
