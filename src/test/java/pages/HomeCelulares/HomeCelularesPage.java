package pages.HomeCelulares;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeCelularesPage {
    private final Click mouse;
    private final Texto texto;
    private final Escribir teclado;
    private final Acciones action;
    private final EsperarTiempo tiempo;
    private final By locator_celulares = By.xpath("//h4[@class='card-title']");
    private final By button_add = By.xpath("//a[@class='btn btn-success btn-lg']");
    private final By button_phone = By.xpath("//a[text()='Phones']");
    private final By button_laptops = By.xpath("//a[text()='Laptops']");
    private final By button_monitors = By.xpath("//a[text()='Monitors']");
    private final By button_home = By.xpath("//a[contains(text(),'Home ')]");
    private final By button_contact = By.xpath("//a[contains(text(),'Contact')]");
    private final By button_about_us = By.xpath("//a[text()='About us']");
    private final By button_cart = By.xpath("//a[text()='Cart']");
    private final By button_log_in = By.xpath("//a[text()='Log in']");
    private final By button_Sing_Up = By.xpath("//a[text()='Sign up']");



    private final By input_name = By.id("sign-username");
    private final By input_password = By.id("sign-password");
    private final By button_close_sing_up = By.xpath("(//button[@class='btn btn-secondary'])[2]");
    private final By button_inscribirse = By.xpath("//button[@onclick='register()']");
    private final By bt_video = By.xpath("//button[@class='vjs-big-play-button']");
    private final By bt_close_video = By.xpath("(//button[text()='Close'])[4]");
    private final By locator_controles = By.xpath("//video[@class='vjs-tech']");

    //LOCATORS ENCABEZADOS
    private final By locator_X_contact = By.xpath("(//span[text()='×'])[1]");
    private final By locator_X_abonUp = By.xpath("(//span[text()='×'])[4]");
    private final By locator_X_logIn = By.xpath("(//span[text()='×'])[4]");
    private final By locator_X_singUp = By.xpath("(//span[text()='×'])[2]");
    private final By locator_bt_previous_scroll = By.xpath("//button[text()='Previous']");
    private final By locator_bt_next_portada = By.xpath("//span[@class='carousel-control-next-icon']");


    //LOCATORS PARA ENVIAR MENSAJES
    private final By locator_contact_emal = By.id("recipient-email");
    private final By locator_name_user = By.id("recipient-name");
    private final By locator_mensaje = By.id("message-text");
    private final By locator_send_messager = By.xpath("//button[@onclick='send()']");



    public HomeCelularesPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.action = new Acciones(driver);
        this.tiempo = new EsperarTiempo();
        this.teclado = new Escribir(driver);
    }
    public void clickBTHome() throws Exception {
        mouse.Clickear(button_home);
    }
    public void clickContact() throws Exception {
        mouse.Clickear(button_contact);
    }
    public void clickAbout() throws Exception {
        mouse.Clickear(button_about_us);
    }
    public void clickSingUp() throws Exception {
        mouse.Clickear(button_Sing_Up);
    }
    public void buscoProducto(String celular) throws Exception {
        texto.clickElementoPorNombre(locator_celulares,celular);
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
    public void cargoDatos(String nombre, String password,String existe) throws Exception {
        teclado.Escribir(input_name,nombre);
        teclado.Escribir(input_password,password);
        mouse.Clickear(button_inscribirse);
        tiempo.esperar(2);
        if( action.compararTextoAlert(existe)){
            action.aceptarAlertaConEspera(2);
            mouse.Clickear(button_close_sing_up);
        }else {
            action.aceptarAlertaConEspera(3);

        }
    }
    public void mirarVideoporUnTiempo(String tieme) throws Exception {
        mouse.Clickear(bt_video);
        tiempo.esperar(Integer.parseInt(tieme));
        mouse.Clickear(locator_controles);
        tiempo.esperar(2);

        mouse.Clickear(bt_close_video);
    }
    public void recorroEncabezado() throws Exception {
        mouse.Clickear(button_contact);
        tiempo.esperar(2);
        mouse.Clickear(locator_X_contact);
        mouse.Clickear(button_about_us);
        tiempo.esperar(2);
        mouse.Clickear(locator_X_abonUp);
        mouse.Clickear(button_cart);
        tiempo.esperar(2);
        mouse.Clickear(button_log_in);
        tiempo.esperar(2);
        mouse.Clickear(locator_X_logIn);
        mouse.Clickear(button_Sing_Up);
        tiempo.esperar(2);
        mouse.Clickear(locator_X_singUp);
        mouse.Clickear(button_home);
    }
    public void hacerScroll() throws Exception {
        action.hacerScroll(locator_bt_previous_scroll);
        tiempo.esperar(1);
        mouse.Clickear(button_laptops);
        action.hacerScroll(locator_bt_previous_scroll);
        tiempo.esperar(1);
        mouse.Clickear(button_monitors);
        action.hacerScroll(locator_bt_previous_scroll);
        tiempo.esperar(1);
    }
    public void enviar_mensaje(String correo, String nameUser, String mensaje) throws Exception {
        teclado.Escribir(locator_contact_emal,correo);
        teclado.Escribir(locator_name_user,nameUser);
        teclado.Escribir(locator_mensaje,mensaje);
        mouse.Clickear(locator_send_messager);

    }
    public void veoPortadas() throws Exception {
        mouse.Clickear(locator_bt_next_portada);
        mouse.Clickear(locator_bt_next_portada);
        mouse.Clickear(locator_bt_next_portada);
    }
    public void validoEnvioMensaje(String mensaje){
        boolean valido = action.compararTextoAlert(mensaje);
        if (valido){
            Assert.assertTrue(valido);
            action.aceptarAlertaConEspera(2);
        }

    }

}
