package pages;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import actions.SubirArchivo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FormPage {
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final SubirArchivo subir;
    private final By btPractiForm = By.xpath("//span[text()='Practice Form']");
    public final By firstName = By.xpath("//input[@id='firstName']");
    public final By lastName = By.xpath("//input[@id='lastName']");
    private final By email_xpath = By.xpath("//input[@id='userEmail']");
    private final By gender = By.xpath("//input[@value='Male']");
    private final By number = By.xpath("//input[@id='userNumber']");
    private final By button_store_aplicacion = By.xpath("//div[text()='Book Store Application']");
    private final By btFecha = By.id("dateOfBirthInput");
    private final By miAnio = By.xpath("//option[@value='1998']");
    private final By miMes = By.xpath("//option[@value='0']");
    private final By miDia = By.xpath("(//div[text()='1'])[1]");
    private final By subjet = By.id("subjectsContainer");
    private final By btReading = By.xpath("//input[@id='hobbies-checkbox-2']");
    private final By foto = By.xpath("//input[@id='uploadPicture']");

    public FormPage(WebDriver driver) {
        //super(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.subir = new SubirArchivo(driver);
    }
    public void subirArchivo(File ruta) throws Exception {
        subir.subir(foto,ruta);
    }
    public void cargoCampoSubjet(String subjets) throws Exception {
        teclado.Escribir(subjet,subjets);
        mouse.Clickear(btReading);
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
    public void cargoNombre2NombreSexoNumeroTel(String nameP,String nameS,String tel) throws Exception {
        teclado.EscribirJs(firstName,nameP);
        teclado.Escribir(lastName,nameS);
        mouse.Clickear(gender);
        teclado.Escribir(number,tel);
    }

    public void ingresarEmail(String email) throws Exception {
        teclado.Escribir(email_xpath,email);
    }

    public void hacerClickEnBotonStore(){
        acciones.hacerClick(button_store_aplicacion);
    }
}























