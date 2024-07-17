package steps.adminStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.adminPage.AdminPage;
import pages.organizationPage.OrganizationPage;
import pages.principalPage.PrincipalPage;

public class AdminStep {
    WebDriver driver = WebDriverManager.getDriver();
    AdminPage page_admin = new AdminPage(driver);
    PrincipalPage page_principal = new PrincipalPage(driver);
    OrganizationPage page_organization = new OrganizationPage(driver);


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

    @Entonces("agrego una moneda")
    public void agregoUnaMoneda() {
    }

    @Cuando("igreso en organization")
    public void igresoEnOrganization() throws Exception {
        page_organization.clickEnOrganization();
    }

    @Y("voy a structure")
    public void voyAStructure() throws Exception {
        page_organization.clickEnStructure();
    }

    @Entonces("agrego una unidad a cada estructura")
    public void agregoUnaUnidadACadaEstructura() throws Exception {
        page_organization.clickEnEdit();
        page_organization.agregarUnidadATodos();
    }

    @Cuando("ingreso en cualifications")
    public void ingresoEnCualifications() throws Exception {
        page_admin.clickEnCualifications();
    }

    @Y("voy a education")
    public void voyAEducation() throws Exception {
        page_admin.clickEnEducation();
    }

    @Entonces("selecciono cada una por una y las borro")
    public void seleccionoCadaUnaPorUnaYLasBorro() throws Exception {
        page_admin.marcarUnaPorUna();
        page_admin.clickEnBorrar();
        page_admin.clickEnYes();
    }
}
