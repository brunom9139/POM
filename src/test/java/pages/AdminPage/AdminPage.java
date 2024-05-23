package pages.AdminPage;

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
    private final By locator_button_add = By.xpath("(//button[@type='button'])[5]");
    private final By locator_input_user_role = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    private final By locator_input_status = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    private final By locator_input_employ_name = By.xpath("//input[@placeholder='Type for hints...']");
    private final By locator_input_user_name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_input_password = By.xpath("(//input[@type='password'])[1]");
    private final By locator_input_password_2 = By.xpath("(//input[@type='password'])[2]");
    private final By locator_save = By.xpath("//button[@type='submit']");
    private final By locator_listas = By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");
    private final By locator_bt_corporate = By.xpath("//a[text()='Corporate Branding']");
    private final By locator_primary_color = By.xpath("(//div[@class='oxd-color-input-preview'])[1]");
    private final By locator_slader = By.xpath("//input[@type='range']");



    public AdminPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }
    public void desplazoSliderColor(){

    }
    public void clickEnSesionCorporati() throws Exception {
        mouse.Clickear(locator_bt_corporate);
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
    public void agregamosUsuario(String nombreEmpleado,String nombreUsuario ,String password) throws Exception {

        mouse.ClickearJs(locator_button_add);
        acciones.clickFlechaAbajo(locator_input_user_role);
        teclado.Escribir(locator_input_employ_name,nombreEmpleado);
        esperar_tiempo.esperar(2);
        acciones.flechaAbajo();
        acciones.clickFlechaAbajoDoble(locator_input_status);
        teclado.Escribir(locator_input_user_name,nombreUsuario);
        teclado.Escribir(locator_input_password,password);
        teclado.Escribir(locator_input_password_2,password);
        mouse.ClickearJs(locator_save);
        esperar_tiempo.esperar(3);
    }
    public void palomeoEncontrado(String nombreBuscar) throws Exception {
       int posicion = texto.buscoEnListaYObtengoPosicion(locator_listas,nombreBuscar);
       texto.clickPosicion(posicion);
    }

}
