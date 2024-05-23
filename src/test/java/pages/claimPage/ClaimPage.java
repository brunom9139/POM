package pages.claimPage;

import actions.*;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CadenaCaracteres;

import java.util.List;


public class ClaimPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;
    private final Acciones accion;
    private final EsperarTiempo esperar_tiempo;
    private final CadenaCaracteres cadenaCaracteres;


    CadenaCaracteres cadena = new CadenaCaracteres();

    public ClaimPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.accion = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();
        this.cadenaCaracteres = new CadenaCaracteres();
    }

    private final By locator_button_agregar_reclamo = By.xpath("//button[text()=' Assign Claim ']");
    private final By locator_employeet_name = By.xpath("//input[@placeholder='Type for hints...']");
    private final By locator_event_select = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    private final By locator_event_button = By.xpath("//*[text()='Accommodation']");
    private final By locator_currency_select = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    private final By locator_afganistan_button = By.xpath("//*[text()='Afghanistan Afghani']");
    private final By locator_buton_submit_create = By.xpath("//*[@type='submit']");
    private final By locator_button_view_todos = By.xpath("//div[@class='oxd-table-body']//div//div//div//button");

    private final By locator_button_add = By.xpath("(//button[text()=' Add '])[1]");
    private final By locator_date = By.xpath("//input[@placeholder='yyyy-dd-mm']");
    private final By locator_amount = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
    private final By locator_note = By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]");
    private final By locator_button_save = By.xpath("//button[@type='submit']");
    private final By locator_selecct = By.xpath("//*[text()='-- Select --']");





    public void clickEnAgregar() throws Exception {
        mouse.ClickearJs(locator_button_agregar_reclamo);
    }

    public void agregarReclamo() throws Exception {
        teclado.Escribir(locator_employeet_name,"A");
        esperar_tiempo.esperar(5);
        accion.flechaAbajoDoble();

        mouse.Clickear(locator_selecct);
        mouse.Clickear(locator_event_button);

        mouse.Clickear(locator_currency_select);
        mouse.Clickear(locator_afganistan_button);

        mouse.Clickear(locator_buton_submit_create);
    }

    public void agregarReclamoConExpensa(String expensa) throws Exception {

        accion.hacerScroll(locator_button_add);
        mouse.ClickearJs(locator_button_add);

        mouse.Clickear(locator_selecct);
        accion.flechaAbajoDoble();

        esperar_tiempo.esperar(2);
        mouse.Clickear(locator_date);
        accion.limpiarCampoyEscribir(locator_date,"2024-02-05");

        esperar_tiempo.esperar(5);
        mouse.Clickear(locator_amount);
        teclado.Escribir(locator_amount,expensa);

        teclado.Escribir(locator_note,"delivery por la noche");
        mouse.Clickear(locator_button_save);



    }
}