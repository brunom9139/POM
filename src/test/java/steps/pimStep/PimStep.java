package steps.pimStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.elements.*;
import pages.jobPage.JobPage;
import pages.pimPage.PimPage;
import pages.principalPage.PrincipalPage;

public class PimStep {
    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainsObj = new MainPage(driver);
    ElementsPage elementsObj = new ElementsPage(driver);
    TextBoxPage textBoxObj = new TextBoxPage(driver);
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    WebTablesPage webTables = new WebTablesPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);
    PrincipalPage page_principal = new PrincipalPage(driver);


    PimPage pim_objeto = new PimPage(driver);
    @Entonces("ingreso en PIM")
    public void ingresoEnPIM() throws Exception {
        page_principal.clickPim();
    }

    @Y("busco empleado por id {string}")
    public void buscoEmpleadoPorId(String id) throws Exception {
        pim_objeto.buscarEmpleadoPorId(id);

    }

    @Entonces("cambio su nombre a {string} {string} {string}")
    public void cambioSuNombreA(String primer_nombre, String segundo_nombre, String apellido) {
        pim_objeto.editarNombreEmpleado(primer_nombre,segundo_nombre,apellido);
    }

    @Entonces("agrego un empleado aleatoriamente")
    public void agregoUnEmpleadoAleatoriamente() throws Exception {
        pim_objeto.clickEnAgregar();
        pim_objeto.agregarEmpleado();
    }

    @Entonces("edito su estado y rol")
    public void editoSuEstadoYRol() throws Exception {
        pim_objeto.agregarEmpleadoYEditarlo();
    }
}
