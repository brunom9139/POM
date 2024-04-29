package pages;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class FormPage {
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final SubirArchivo subir;
    private final Texto texto;
    private final By btPractiForm = By.xpath("//span[text()='Practice Form']");
    public final By firstName = By.xpath("//input[@id='firstName']");
    public final By lastName = By.xpath("//input[@id='lastName']");
    private final By email_selector = By.xpath("//input[@id='userEmail']");
    private final By gender = By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]");
    private final By number = By.xpath("//input[@id='userNumber']");
    private final By button_store_aplicacion = By.xpath("//div[text()='Book Store Application']");
    private final By btFecha = By.id("dateOfBirthInput");
    private final By miAnio = By.xpath("//option[@value='1998']");
    private final By miMes = By.xpath("//option[@value='0']");
    private final By miDia = By.xpath("(//div[text()='1'])[1]");
    private final By hobies= By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[2]");
    private final By address = By.xpath("//textarea[@id='currentAddress']");
    private final By btEstado = By.xpath("(//div[@class=' css-1hwfws3'])[1]");
    private final By btCiudad = By.xpath("(//div[@class=' css-1hwfws3'])[2]");
    private final By btSubbmid = By.id("submit");
    private final By respuesta = By.xpath("//td[text()='Juan Carlos']");
    private final By foto = By.xpath("//input[@id='uploadPicture']");

    public FormPage(WebDriver driver) {
        //super(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.subir = new SubirArchivo(driver);
        this.texto = new Texto(driver);
    }
    public void clickSubmid() throws Exception {
        mouse.Clickear(btSubbmid);
    }
    public void estadoYCIudad(String estad,String ciudad) throws Exception {
        teclado.Escribir(btEstado,estad);
        teclado.Escribir(btCiudad,ciudad);
    }
    public void subirArchivo(File ruta) throws Exception {
        subir.subir(foto,ruta);
    }
    public void cargoFecha() throws Exception {
        mouse.Clickear(btFecha);
        mouse.Clickear(miAnio);
        mouse.Clickear(miMes);
        mouse.Clickear(miDia);
    }
    public void clickParticipeFrom() throws Exception {
        mouse.Clickear(btPractiForm);
    }
    public void cargoNombre2NombreSexoNumeroTel(String nameP,String nameS,String email,String tel) throws Exception {
        teclado.EscribirJs(firstName,nameP);
        teclado.Escribir(lastName,nameS);
        teclado.Escribir(email_selector,email);
        mouse.Clickear(gender);
        teclado.Escribir(number,tel);
        mouse.Clickear(hobies);
    }
    public void escriboDirecction(String direccio) throws Exception {
        teclado.Escribir(address,direccio);
    }
    public void validoCarga(String nombreCompleto){
        boolean validacion = texto.compararTexto(respuesta,nombreCompleto);
        Assert.assertTrue(validacion);
    }
    public void hacerClickEnBotonStore(){
        acciones.hacerClick(button_store_aplicacion);
    }
}























