package steps.Elements;

import actions.CambioVentana;
import actions.EsperarTiempo;
import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Elements.*;

public class MisTestJuanStep {
    WebDriver driver = WebDriverManager.getDriver();
    Main inicio = new Main(driver);
    AlertsFrameyWindowsPage page_Alert_FrameWindows = new AlertsFrameyWindowsPage(driver);
    BrowserWindows page_Alert_Browser = new BrowserWindows(driver);
    CambioVentana ventana = new CambioVentana(driver);
    Alerts page_Alert = new Alerts(driver);
    EsperarTiempo tiempo = new EsperarTiempo();
    ModalsDialogs pag_eModals = new ModalsDialogs(driver);
    @Dado("que me dirijo a Frame & Windows")
    public void queMeDirijoAFrameWindows() throws Exception {
        inicio.clickAlertFrameWindows();
        page_Alert_FrameWindows.clickModalsDialogs();
    }

    @Cuando("Estoy en Browser Windows")
    public void estoyEnBrowserWindows() throws Exception {
        page_Alert_FrameWindows.clickBrowser();

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
        page_Alert_FrameWindows.clickAler();
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

    @Cuando("estoy en la pagina Modals Dialogs Hago click en Smash Modals")
    public void estoyEnLaPaginaModalsDialogsHagoClickEnSmashModals() throws Exception {
        pag_eModals.clickBTsmash();
    }

    @Y("verifico el mensaje del primer renglon {string}")
    public void verificoElMensajeDelPrimerRenglon(String mensaje) throws Exception {
        pag_eModals.verificoTextEnSmallModals(mensaje);
    }

    @Cuando("hago click en Large Modals")
    public void hagoClickEnLargeModals() throws Exception {
        pag_eModals.clickBTlarge();
    }

    @Y("verifico el mensje del primer renglon {string}")
    public void verificoElMensjeDelPrimerRenglon(String mensaje) throws Exception {
        pag_eModals.verificoTextoEnLargeModals(mensaje);
    }

    @Entonces("las verificaciones fueron aprovadas")
    public void lasVerificacionesFueronAprovadas() throws Exception {
        page_Alert_FrameWindows.clickModalsDialogs();
    }
}
