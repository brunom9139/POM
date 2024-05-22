package pages.claimPage;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CadenaCaracteres;


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




    public void clickEnAgregar() throws Exception {
        mouse.ClickearJs(locator_button_agregar_reclamo);
    }

    public void agregarReclamo() throws Exception {
        teclado.Escribir(locator_employeet_name,"A");
        esperar_tiempo.esperar(5);
        accion.flechaAbajoDoble();

        mouse.Clickear(locator_event_select);
        mouse.Clickear(locator_event_button);

        mouse.Clickear(locator_currency_select);
        mouse.Clickear(locator_afganistan_button);

        mouse.Clickear(locator_buton_submit_create);
    }
}