package steps.MyInfoStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.MyInfoPage.MyInfoPage;

public class MyinfoStep {
    WebDriver driver = WebDriverManager.getDriver();
    MyInfoPage page_myinfo = new MyInfoPage(driver);

    @Cuando("voy a MyInfo")
    public void voyAMyInfo() throws Exception {
        page_myinfo.clickMyInfo();
    }

    @Y("cargo mi foto y mi nombre {string}{string}{string}")
    public void cargoMiFotoYMiNombre(String nombre, String segundoNombre, String apellido) throws Exception {
        page_myinfo.cargoMisDatos(nombre,segundoNombre,apellido);
        page_myinfo.cargoFotoPerfil();
    }

    @Entonces("verifico que se aya cargado el apellido {string}")
    public void verificoQueSeAyaCargadoElApellido(String apellido) throws Exception {
        page_myinfo.verificoDatosCargados(apellido);
    }
}
