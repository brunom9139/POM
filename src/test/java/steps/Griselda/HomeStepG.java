package steps.Griselda;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import org.openqa.selenium.WebDriver;
import pages.Griselda.HomeGriPage;

public class HomeStepG {

    WebDriver driver = WebDriverManager.getDriver();
    HomeGriPage obj_homeG = new HomeGriPage(driver);

    @Dado("ingreso en elementos")
    public void ingresoEnElementos() throws Exception {
        obj_homeG.ingresarEnElementos();
    }
}
