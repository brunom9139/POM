package pages.HomeCelulares;

import actions.Acciones;
import actions.Click;
import actions.EsperarTiempo;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeCelularesPage {
    private final Click mouse;
    private final Texto teclado;
    private final Acciones action;
    private final EsperarTiempo tiempo;
    private final By locator_celulares = By.xpath("//h4[@class='card-title']");
    private final By button_add = By.xpath("//a[@class='btn btn-success btn-lg']");
    private final By button_phone = By.xpath("//a[text()='Phones']");
    private final By button_laptops = By.xpath("//a[text()='Laptops']");
    private final By button_monitors = By.xpath("//a[text()='Monitors']");
    private final By button_home = By.xpath("//a[contains(text(),'Home ')]");

    public HomeCelularesPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Texto(driver);
        this.action = new Acciones(driver);
        this.tiempo = new EsperarTiempo();

    }
    public void buscoProducto(String celular) throws Exception {
        teclado.clickElementoPorNombre(locator_celulares,celular);
    }
    public void clickBTHome() throws Exception {
        mouse.Clickear(button_home);
    }
    public void agregoCarrito() throws Exception {
        mouse.Clickear(button_add);
        action.aceptarAlertaConEspera(3);
    }
    public void clickPhone() throws Exception {
        mouse.Clickear(button_phone);
    }
    public void clickLaptop() throws Exception {
        mouse.Clickear(button_laptops);
        tiempo.esperar(2);
    }
    public void clickMonitors() throws Exception {
        mouse.Clickear(button_monitors);
        tiempo.esperar(2);
    }



}
