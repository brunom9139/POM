package steps.celularesStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.CarritoCelulares.CarritoCelularesPage;
import pages.HomeCelulares.HomeCelularesPage;

public class CelularesStep {

    WebDriver driver = WebDriverManager.getDriver();
    HomeCelularesPage home_page = new HomeCelularesPage(driver);
    CarritoCelularesPage carrito_celulares = new CarritoCelularesPage(driver);
    @Dado("que busco el {string}")
    public void queBuscoEl(String celular) throws Exception {
        home_page.buscoProducto(celular);
    }

    @Cuando("agrego al carrito")
    public void agregoAlCarrito() throws Exception {
        home_page.agregoCarrito();
        carrito_celulares.clickBTCarrito();
    }

    @Y("cargo mis datos para efectuar la compra {string} {string} {string} {string} {string} {string}")
    public void cargoMisDatosParaEfectuarLaCompra(String nombre, String Country, String City, String Credit , String Month, String Year) throws Exception {

        carrito_celulares.cargoDatosEnCarrito(nombre,Country,City,Credit,Month,Year);
    }

    @Entonces("verifico que se efectuo la compra {string}")
    public void verificoQueSeEfectuoLaCompra(String verifico) throws Exception {
        carrito_celulares.verificoMensaje(verifico);
    }

    @Dado("que agrego a mi carrito {string} , {string} , {string} y {string}")
    public void queAgregoAMiCarritoY(String celular1, String celular2, String laptop, String monitor) throws Exception {
        home_page.buscoProducto(celular1);
        home_page.agregoCarrito();

        home_page.clickBTHome();
        home_page.clickPhone();
        home_page.buscoProducto(celular2);
        home_page.agregoCarrito();

        home_page.clickBTHome();
        home_page.clickLaptop();
        home_page.buscoProducto(laptop);
        home_page.agregoCarrito();

        home_page.clickBTHome();
        home_page.clickMonitors();
        home_page.buscoProducto(monitor);
        home_page.agregoCarrito();
    }

    @Cuando("voy a mi carrito")
    public void voyAMiCarrito() throws Exception {
        carrito_celulares.clickCarrito();
    }

    @Y("elimino el producto {string}")
    public void eliminoElProducto(String producto) throws Exception {
        carrito_celulares.buscoYelimino(producto);
    }
}
