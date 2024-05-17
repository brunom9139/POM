package pages.adminPage;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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


    public AdminPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }

    public void cargoLosDatosEnAdmin(String nombre,String employee ) throws Exception {
        teclado.Escribir(locator_input_username,nombre);
        mouse.Clickear(locator_select_user_role);
        acciones.flechaAbajoDoble();
        teclado.Escribir(locator_input_emmployee,employee);
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
        teclado.Escribir(locator_input_username,nombre);
        mouse.Clickear(locator_select_user_role);
        acciones.flechaAbajoDoble();
        teclado.Escribir(locator_input_emmployee,employee);
        esperar_tiempo.esperar(2);
        acciones.clickFlechaAbajo(locator_input_emmployee);
        acciones.clickFlechaAbajo(locator_select_status);
        mouse.Clickear(locator_button_reset);
    }

}
