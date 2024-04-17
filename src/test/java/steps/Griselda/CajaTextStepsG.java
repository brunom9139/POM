package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Griselda.CajaTextoPageG;
import pages.Griselda.FormPageG;

public class CajaTextStepsG {

    WebDriver driver = WebDriverManager.getDriver();
    CajaTextoPageG obj_caja_text = new CajaTextoPageG(driver);
    @Cuando("me dirijo a caja de texto")
    public void meDirijoACajaDeTexto() throws Exception {
        obj_caja_text.IngresarACajaDeTexto();
    }

    @Y("completo los campos")
    public void completoLosCampos() throws Exception {
        obj_caja_text.CompletarCampos();
    }


    @Entonces("entrego los dato declarados")
    public void entregoLosDatoDeclarados() throws Exception {
        obj_caja_text.hacerEntrega();
    }
}
