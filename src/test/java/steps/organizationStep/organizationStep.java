package steps.organizationStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.elements.*;
import pages.jobPage.JobPage;
import pages.organizationPage.OrganizationPage;

public class organizationStep {
    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainsObj = new MainPage(driver);
    ElementsPage elementsObj = new ElementsPage(driver);
    TextBoxPage textBoxObj = new TextBoxPage(driver);
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    WebTablesPage webTables = new WebTablesPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);

    OrganizationPage org_objeto = new OrganizationPage(driver);
    @Cuando("ingreso en organization")
    public void ingresoEnOrganization() throws Exception {
        org_objeto.clickEnOrganization();
    }

    @Y("voy a general information")
    public void voyAGeneralInformation() throws Exception {
        org_objeto.clickEnGeneralOrganization();
    }

    @Entonces("edito todos los campos {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void editoTodosLosCampos(String nombre, String num, String tax, String telefono, String fax, String email, String direccion1, String direccion2, String ciudad, String provincia, String codigo_postal, String notas) throws Exception {
        org_objeto.editarCampos(nombre,num,tax,telefono,fax,email,direccion1,direccion2,ciudad,provincia,codigo_postal,notas);
    }

    @Y("voy a locations")
    public void voyALocations() throws Exception {
        org_objeto.clickEnLocations();
    }


    @Entonces("busco una localidad {string} {string} {string}")
    public void buscoUnaLocalidad(String nombre, String ciudad, String letra) throws Exception {
        org_objeto.buscarLocation(nombre,ciudad,letra);
    }

    @Entonces("agrego una localidad {string} {string} {string} {string} {string} {string} {string} {string}")
    public void agregoUnaLocalidad(String name, String city, String provincia, String CP, String phone, String fax, String direccion, String notas) throws Exception {
        org_objeto.agregarLocation(name,city,provincia,CP,phone,fax,direccion,notas);
    }
}
