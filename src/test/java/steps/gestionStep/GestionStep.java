package steps.gestionStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.adminPage.AdminPage;
import pages.gestionPage.GestionPage;
import pages.principalPage.PrincipalPage;

public class GestionStep {
    WebDriver driver = WebDriverManager.getDriver();
    GestionPage page_gestion = new GestionPage(driver);
    @Cuando("ingreso en User Management")
    public void ingresoEnUserManagement() throws Exception {
        page_gestion.clickEnUserManegement();
    }

    @Y("voy a Users")
    public void voyAUsers() throws Exception {
        page_gestion.clickEnUsers();
    }

    @Y("completo los campos con los datos y busco {string} {string}")
    public void completoLosCamposConLosDatosYBusco(String nombre, String nombre_trabajo) throws Exception {
        page_gestion.buscarUsuario(nombre,nombre_trabajo);
    }

    @Entonces("verifico que se encuentre el usuario")
    public void verificoQueSeEncuentreElUsuario() {
    }
}
