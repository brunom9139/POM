package steps.Elements;

import actions.CambioVentana;
import actions.EsperarTiempo;
import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Elements.Alerts;
import pages.Elements.AlertsFrameyWindowsPage;
import pages.Elements.BrowserWindows;
import pages.Elements.Main;

public class MisTestJuanStep {
    WebDriver driver = WebDriverManager.getDriver();
    Main inicio = new Main(driver);
    AlertsFrameyWindowsPage pageAlert = new AlertsFrameyWindowsPage(driver);
    BrowserWindows page_Alert_Browser = new BrowserWindows(driver);
    CambioVentana ventana = new CambioVentana(driver);
    Alerts page_Alert = new Alerts(driver);
    EsperarTiempo tiempo = new EsperarTiempo();
    @Dado("que me dirijo a Frame & Windows")
    public void queMeDirijoAFrameWindows() throws Exception {
        inicio.clickAlert();
    }

    @Cuando("Estoy en Browser Windows")
    public void estoyEnBrowserWindows() throws Exception {
        pageAlert.clickBrowser();

    }

    @Y("cliqueo los navegadores de abajo hacia arriba y me quedo en New Tab")
    public void cliqueoLosNavegadoresDeAbajoHaciaArribaYMeQuedoEnNewTab() throws Exception {
        page_Alert_Browser.clickWindowManager();
        page_Alert_Browser.clickNewWindows();
        ventana.cerrarTodasLasVentanas();
        page_Alert_Browser.clickNewTab();
        ventana.cambiarVentana();
    }

    @Entonces("Verifico el mensaje {string}")
    public void verificoElMensaje(String arg0) throws Exception {
        page_Alert_Browser.mensajeCompruebo(arg0);
        ventana.cerrarVentanaActual();
    }

    @Cuando("estoy en la pagina Alert")
    public void estoyEnLaPaginaAlert() throws Exception {
        pageAlert.clickAler();
    }

    @Y("cliqueo todo los botones azules y cargo mi nombre en el ultimo {string}")
    public void cliqueoTodoLosBotonesAzulesYCargoMiNombreEnElUltimo(String nombreEnAlert) throws Exception {
        page_Alert.clickPrimerBt();
        ventana.aceptarAlertaSiPresente();
        page_Alert.clickSegundoBt();
        tiempo.esperar(6);
        ventana.aceptarAlertaSiPresente();
        page_Alert.clickTercerBt();
        ventana.aceptarAlertaSiPresente();
        page_Alert.clickCuarto();
        ventana.escribirEnAlerta(nombreEnAlert);
        ventana.aceptarAlertaSiPresente();
    }

    @Entonces("verifico la carga del nombre que cargue previamente {string}")
    public void verificoLaCargaDelNombreQueCarguePreviamente(String nombreValido) throws Exception {
        page_Alert.validoTexto(nombreValido);
    }
}
