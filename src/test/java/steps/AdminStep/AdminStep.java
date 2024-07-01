package steps.AdminStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.AdminPage.AdminPage;
import pages.PrincipalPage.PrincipalPage;

public class AdminStep {
    WebDriver driver = WebDriverManager.getDriver();
    AdminPage page_admin = new AdminPage(driver);
    PrincipalPage page_principal = new PrincipalPage(driver);

    @Y("en admin busco al usuario {string} ESS {string} Enabled")
    public void enAdminBuscoAlUsuarioESSEnabled(String usuario, String emplyName) throws Exception {
        page_principal.clickAdmin();
        page_admin.cargoLosDatosEnAdmin(usuario, emplyName);
    }

    @Entonces("verifico que FMLName se encuentre con el texto {string}")
    public void verificoQueFMLNameSeEncuentreConElTexto(String validacion) throws Exception {
        page_admin.validoUsuarioEncontrado(validacion);
    }

    @Y("en admin filtro al usuario {string} ESS {string} Enabled reseteandolos")
    public void enAdminFiltroAlUsuarioESSEnabledReseteandolos(String usuario, String emplyName) throws Exception {
        page_principal.clickAdmin();
        page_admin.cargoLosDatosEnAdminyResetear(usuario, emplyName);
    }

    @Y("ingreso en admin")
    public void ingresoEnAdmin() throws Exception {
        page_principal.clickAdmin();
    }

    @Y("encuentro la posicion de {string}")
    public void encuentroLaPosicionDe(String textoBuscado) throws Exception {
        page_admin.encontrarPosicionYSelecciona(textoBuscado);
    }

    @Y("voy a corporate branding y subo un archivo")
    public void voyACorporateBrandingYSuboUnArchivo() throws Exception {
        page_admin.clickCorporateBranding();
    }

    @Y("voy a corporate branding y muevo un color")
    public void voyACorporateBrandingYMuevoUnColor() throws Exception {
        page_admin.clickCorporateBrandingMoverColor();
    }

    @Y("voy a corporate branding y muevo un color JS")
    public void voyACorporateBrandingYMuevoUnColorJS() throws Exception {
        page_admin.clickCorporateBrandingjS();
    }

    @Y("cargo mis datos name {string} user name {string} y contrasena {string}")
    public void cargoMisDatosNameUserNameYContrasena(String employeName, String userName, String passwod) throws Exception {
        page_admin.cargamosDatos(employeName, userName, passwod);
    }

    @Entonces("verifico que se aya agregado el usurious {string}")
    public void verificoQueSeAyaAgregadoElUsurious(String usuarioBusco) throws Exception {
        page_admin.validoUsuarioEncontrado(usuarioBusco);
    }

    @Y("busco al usere {string}")
    public void buscoAlUsere(String usuario) throws Exception {
        page_admin.encontrarPosicionYSelecciona(usuario);
    }

    @Entonces("lo elimino {string}")
    public void loElimino(String usuario) throws Exception {
        page_admin.buscoYeliminoUsuario(usuario);
    }
}
