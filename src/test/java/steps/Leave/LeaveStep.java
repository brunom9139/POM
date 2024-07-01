package steps.Leave;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Leave.LeavePage;

public class LeaveStep {
    WebDriver driver = WebDriverManager.getDriver();
    LeavePage page_leave = new LeavePage(driver);
    @Cuando("voy a Leave")
    public void voyALeave() throws Exception {
        page_leave.clickLeavel();
    }

    @Y("cargo las fechas {string} {string}")
    public void cargoLasFechas(String fecha1, String fecha2) throws Exception {
        page_leave.cargoFecha(fecha1,fecha2);
    }

    @Y("guardamos con todos los datos ya cargados {string}")
    public void guardamosConTodosLosDatosYaCargados(String nombre) throws Exception {
        page_leave.cargamosLosStatus(nombre);
        page_leave.guardamosDatos();
    }
}
