package steps.Login;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.LoginPage.LogueoPage;
import pages.PrincipalPage.PrincipalPage;

public class LogueoStep {
    WebDriver driver = WebDriverManager.getDriver();
    LogueoPage page_logueo = new LogueoPage(driver);
    PrincipalPage page_principal = new PrincipalPage(driver);
    @Dado("que cargo los campos {string} {string}")
    public void queCargoLosCampos(String nombre, String contrasena) throws Exception {
        page_logueo.cargarCampos(nombre,contrasena);
    }

    @Entonces("valido que ingrese {string}")
    public void validoQueIngrese(String textoValido) throws Exception {
        page_principal.comparoTexto(textoValido);
    }

    @Dado("que me logueo {string} {string}")
    public void queMeLogueo(String nombre, String contrasena) throws Exception {
        page_logueo.cargarCampos(nombre,contrasena);
    }

    @Entonces("Valido que no pude ingresar correctamente a la pagina {string}")
    public void validoQueNoPudeIngresarCorrectamenteALaPagina(String credencialesInvalidas) throws Exception {
        page_logueo.validarCredencialesInvalidasLogeo(credencialesInvalidas);

    }

    @Y("me deslogueo")
    public void meDeslogueo() throws Exception {
        page_logueo.cerrarSesion();
        
    }

    @Entonces("verifico que me deslogueo con el texto {string}")
    public void verificoQueMeDeslogueoConElTexto(String mensaje) throws Exception {
        page_logueo.validoTexto(mensaje);
    }


}
