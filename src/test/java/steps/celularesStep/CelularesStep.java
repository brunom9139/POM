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

    @Dado("que voy a Sign up")
    public void queVoyASignUp() throws Exception {
        home_page.clickSingUp();
    }


    @Y("voy a mirar el video sobre nosotros {string} segundos")
    public void voyAMirarElVideoSobreNosotrosSegundos(String tiempo) throws Exception {
        home_page.clickAbout();
        home_page.mirarVideoporUnTiempo(tiempo);
    }

    @Entonces("vuelvo a home")
    public void vuelvoAHome() throws Exception {
        home_page.clickBTHome();
    }

    @Y("me inscribe con mis datos {string} {string} a menos que ya este inscripto {string}")
    public void meInscribeConMisDatosAMenosQueYaEsteInscripto(String nombre, String password, String existe) throws Exception {
        home_page.cargoDatos(nombre,password,existe);
    }

    @Dado("que exploro todas las pestañas del encabezado y portadas, luego")
    public void queExploroTodasLasPestanasDelEncabezadoYPortadasLuego() throws Exception {
        home_page.recorroEncabezado();
    }

    @Cuando("escloreo en todos los catalogos de productos")
    public void escloreoEnTodosLosCatalogosDeProductos() throws Exception {
        home_page.hacerScroll();
        home_page.veoPortadas();
    }

    @Y("envio el mensaje cargando mis datos{string} {string} y envio {string}")
    public void envioElMensajeCargandoMisDatosYEnvio(String gmail, String nameUser, String mensaje) throws Exception {
        home_page.clickContact();
        home_page.enviar_mensaje(gmail,nameUser,mensaje);
    }

    @Entonces("verifico que el mensaje se envio con el mensaje {string}")
    public void verificoQueElMensajeSeEnvioConElMensaje(String mensaje) {
        home_page.validoEnvioMensaje(mensaje);
    }
}
