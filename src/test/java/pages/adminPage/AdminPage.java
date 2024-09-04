package pages.adminPage;

import actions.*;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AdminPage {
    private final Texto texto;
    private final Click mouse;
    private final Acciones acciones;
    private final Escribir teclado;
    private final EsperarTiempo esperar_tiempo;

    private final By locator_input_username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_select_user_role = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    private final By locator_input_emmployee = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    private final By locator_select_status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    private final By locator_button_submit = By.xpath("//button[@type = 'submit']");
    private final By locator_user_encontrado =By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]");
    private final By locator_button_reset = By.xpath("(//button[@type = 'button'])[4]");

    private final By locator_button_cualifications = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent'][3]");

    private final By locator_button_education = By.xpath("(//a[@role='menuitem'])[2]");
    private final By locator_button_checked = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-card-cell-checkbox']//div[@class='oxd-checkbox-wrapper']");
    private final By locator_button_delete = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']");
    private final By locator_button_yes = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");



    public AdminPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }

    public void cargoLosDatosEnAdmin(String nombre,String employee ) throws Exception {
        teclado.onEscribir(locator_input_username,nombre);
        mouse.Clickear(locator_select_user_role);
        acciones.flechaAbajoDoble();
        teclado.onEscribir(locator_input_emmployee,employee);
        esperar_tiempo.esperar(2);
        acciones.clickFlechaAbajo(locator_input_emmployee);
        acciones.clickFlechaAbajo(locator_select_status);
        mouse.Clickear(locator_button_submit);
    }

    public void validoUsuarioEncontrado(String mensajeValidacionRecordFound) throws Exception {
        boolean mensaje = texto.compararTextoContiene(locator_user_encontrado, mensajeValidacionRecordFound);
        Assert.assertTrue(mensaje);
    }
    public void cargoLosDatosEnAdminyResetear(String nombre,String employee ) throws Exception {
        teclado.onEscribir(locator_input_username,nombre);
        mouse.Clickear(locator_select_user_role);
        acciones.flechaAbajoDoble();
        teclado.onEscribir(locator_input_emmployee,employee);
        esperar_tiempo.esperar(2);
        acciones.clickFlechaAbajo(locator_input_emmployee);
        acciones.clickFlechaAbajo(locator_select_status);
        mouse.Clickear(locator_button_reset);
    }

    public void clickEnCualifications() throws Exception {
        mouse.ClickearJs(locator_button_cualifications);
    }

    public void clickEnEducation() throws Exception {
        mouse.ClickearJs(locator_button_education);

    }

    public void marcarUnaPorUna() throws Exception {
        try {
            List<WebElement> elementosLapiz = Session.getInstance().getWebDriver().findElements(locator_button_checked);
            for (int i = 1; i <= elementosLapiz.size(); i++) {
                WebElement elemento_lapiz = Session.getInstance().getWebDriver().findElement(By.xpath("(//div[@class='oxd-table-body']//div[@class='oxd-table-card-cell-checkbox']//div[@class='oxd-checkbox-wrapper'])["+i+"]"));
                acciones.hacerScroll(elemento_lapiz);
                elemento_lapiz.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickEnBorrar() throws Exception {
        mouse.ClickearJs(locator_button_delete);
    }

    public void clickEnYes() throws Exception {
        mouse.ClickearJs(locator_button_yes);
    }

}
