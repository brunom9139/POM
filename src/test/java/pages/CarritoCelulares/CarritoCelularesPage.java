package pages.CarritoCelulares;

import actions.Click;
import actions.Escribir;
import actions.EsperarTiempo;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.w3c.dom.Text;

public class CarritoCelularesPage {
    private final Click mouse;
    private final Escribir teclado;
    private final Texto texto;
    private final EsperarTiempo tiempo;
    private final By button_carrito = By.id("cartur");
    private final By button_place_order = By.xpath("//button[@class='btn btn-success']");
    private final By locator_name = By.id("name");
    private final By locator_country = By.id("country");
    private final By locator_city = By.id("city");
    private final By locator_credy_cart = By.id("card");
    private final By locator_month = By.id("month");
    private final By locator_year = By.id("year");
    private final By button_finalizar_compra = By.xpath("//button[@onclick='purchaseOrder()']");
    private final By locator_validacion = By.xpath("//h2[text()='Thank you for your purchase!']");
    private final By locator_button_ok = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");
    private final By locator_list_carrito = By.xpath("//tr[@class='success']/td[2]");


    public CarritoCelularesPage(WebDriver driver) {
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.texto = new Texto(driver);
        this.tiempo = new EsperarTiempo();
    }
    public void clickBTCarrito() throws Exception {
        mouse.Clickear(button_carrito);
    }

    public void cargoDatosEnCarrito(String nombre, String country, String city, String credit, String month, String year) throws Exception {
        tiempo.esperar(2);

        mouse.Clickear(button_place_order);
        teclado.Escribir(locator_name, nombre);
        teclado.Escribir(locator_country, country);
        teclado.Escribir(locator_city, city);
        teclado.Escribir(locator_credy_cart, credit);
        teclado.Escribir(locator_month, month);
        teclado.Escribir(locator_year, year);
        mouse.Clickear(button_finalizar_compra);
    }

    public void verificoMensaje(String validacion) throws Exception {
        boolean mensaje = texto.compararTextoContiene(locator_validacion, validacion);
        Assert.assertTrue(mensaje);
        mouse.Clickear(locator_button_ok);
    }
    public void buscoYelimino(String producto) throws Exception {
        int posicion = texto.buscoEnListaYObtengoPosicion(locator_list_carrito,producto);
        final By button_delete = By.xpath("(//tr[@class='success']/td[4]/a)["+posicion+"]");
        mouse.Clickear(button_delete);
        tiempo.esperar(2);
    }
    public void clickCarrito() throws Exception {
        mouse.Clickear(button_carrito);
        tiempo.esperar(2);
    }


}