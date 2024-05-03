package pages.Elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ButtonPage {
    private final Click mouse;
    private final Texto texto;
    private final Acciones acciones;
    private final JavaScript javaScript;
    private final EsperarTiempo esperar_tiempo;

    public ButtonPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.acciones = new Acciones(driver);
        this.javaScript = new JavaScript(driver);
        this.esperar_tiempo = new EsperarTiempo();
    }

    private final By locator_button_doble_click = By.id("doubleClickBtn");
    private final By locator_button_click_derecho = By.id("rightClickBtn");
    private final By locator_button_click_normal = By.xpath("//button[text()='Click Me']");
    private final By locator_label_validar_doble_click = By.id("doubleClickMessage");
    private final By locator_label_validar_click_secundario = By.id("rightClickMessage");
    private final By locator_label_validar_click = By.id("dynamicClickMessage");

    public void clickearTodosLosBotonesSessionButton()throws Exception {
        javaScript.dobleClick(locator_button_doble_click);
        esperar_tiempo.esperar(1);
        acciones.hacerClickSecundario(locator_button_click_derecho);
        mouse.Clickear(locator_button_click_normal);
    }

    public void validarTodosLosBotonesSessionButton(String validarDobleClick, String validarClickSecundario, String validarCLick)throws Exception {
        boolean validacionDobleClick = texto.compararTextoContiene(locator_label_validar_doble_click,validarDobleClick);
        Assert.assertTrue(validacionDobleClick);
        boolean validacionClickSecundario = texto.compararTextoContiene(locator_label_validar_click_secundario,validarClickSecundario);
        Assert.assertTrue(validacionClickSecundario);
        boolean validacionClick = texto.compararTextoContiene(locator_label_validar_click,validarCLick);
        Assert.assertTrue(validacionClick);
    }
}
