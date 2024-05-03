package pages.Elements;

import actions.CambioVentana;
import actions.Click;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserWindows {
    private final Click mouse;
    private final Texto texto;
    private final CambioVentana ventana;mal
    public BrowserWindows(WebDriver driver){
        this.mouse = new Click(driver);
        this.ventana = new CambioVentana(driver);
        this.texto = new Texto(driver);
    }
    private final By locator_bt_new_tab = By.id("tabButton");
    private final By locator_bt_new_windows = By.xpath("//button[@id='windowButton']");
    private final By locator_bt_new_manager = By.xpath("//button[@id='messageWindowButton']");
    private final By mensaje_optenido = By.xpath("//h1[text()='This is a sample page']");

    public void mensajeCompruebo(String valido) throws Exception {
        boolean validacio = texto.compararTexto(mensaje_optenido,valido);
        Assert.assertTrue(validacio);
    }
    public void clickNewTab() throws Exception {
        mouse.Clickear(locator_bt_new_tab);
    }
    public void clickNewWindows() throws Exception {
        mouse.Clickear(locator_bt_new_windows);
    }
    public void clickWindowManager() throws Exception {
        mouse.Clickear(locator_bt_new_manager);
    }

}
