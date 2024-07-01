package pages.MyInfoPage;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class MyInfoPage {
    private final By locator_button_myInfo = By.xpath("//span[text()='My Info']");
    private final By locator_first_name = By.xpath("//input[@name='firstName']");
    private final By locator_middle_name = By.xpath("//input[@name='middleName']");
    private final By locator_last_name = By.xpath("//input[@name='lastName']");
    private final By locator_button_img = By.xpath("(//img[@alt='profile picture'])[2]");
    private final By locator_subo_img = By.xpath("//input[@class='oxd-file-input']");
    private final By locator_button_save_foto = By.xpath("//button[@type='submit']");
    private final By locator_scroll = By.xpath("//h6[text()='Personal Details']");
    private final By locator_datos_personales = By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[1]");
    private final By locator_texto_valido = By.xpath("//div[@class='orangehrm-edit-employee-name']");
    private final By locator_save_datod = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");



    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final SubirArchivo file;
    private final EsperarTiempo tiempo;
    private final Texto texto;
    public MyInfoPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.file = new SubirArchivo(driver);
        this.tiempo = new EsperarTiempo();
        this.texto = new Texto(driver);

    }
    public void clickMyInfo() throws Exception {
        mouse.Clickear(locator_button_myInfo);
    }
    public void cargoMisDatos(String nombre,String SegundoNombre,String Apellido) throws Exception {
        acciones.hacerScroll(locator_scroll);
        tiempo.esperar(2);
        acciones.hacerDobleClick(locator_first_name);
        acciones.borrarTexto(locator_first_name);
        teclado.Escribir(locator_first_name,nombre);
        acciones.hacerScroll(locator_scroll);
        acciones.hacerDobleClick(locator_middle_name);
        acciones.borrarTexto(locator_middle_name);
        teclado.Escribir(locator_middle_name,SegundoNombre);
        acciones.hacerScroll(locator_scroll);
        acciones.hacerDobleClick(locator_last_name);
        acciones.borrarTexto(locator_last_name);
        teclado.Escribir(locator_last_name,Apellido);
        acciones.hacerScroll(locator_save_datod);
        tiempo.esperar(2);
        mouse.ClickearJs(locator_save_datod);

    }
    public void cargoFotoPerfil() throws Exception {
        mouse.ClickearJs(locator_button_img);
        tiempo.esperar(1);
        File fuboFile = new File("C:\\Users\\Juan Carlos\\Pictures\\motos\\ybr azul.jpg");
        file.subir(locator_subo_img,fuboFile);
        mouse.Clickear(locator_button_save_foto);
    }
    public void verificoDatosCargados(String apellido) throws Exception {
        mouse.Clickear(locator_button_myInfo);
        tiempo.esperar(4);
        boolean mensaje = texto.compararTextoContiene(locator_texto_valido,apellido);
        Assert.assertTrue(mensaje);
    }

}
