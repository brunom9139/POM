package pages.gestionPage;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionPage {
    private final Texto texto;
    private final Click mouse;
    private final Acciones acciones;
    private final Escribir teclado;
    private final EsperarTiempo esperar_tiempo;

    public GestionPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }

    private final By locator_button_user_management = By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]");
    private final By locator_button_users = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])");

    private final By locator_input_nombre_usuario = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_input_select_role= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    private final By locator_input_nombre_trabajo = By.xpath("//input[@placeholder='Type for hints...']");
    private final By locator_input_select_status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    private final By locator_button_search = By.xpath("//button[@type='submit']");
    private final By locator_button_add = By.xpath("//button[@type='button']");

    public void clickEnUserManegement() throws Exception {
        mouse.Clickear(locator_button_user_management);
    }

    public void clickEnUsers() throws Exception {
        mouse.Clickear(locator_button_users);
    }

    public void buscarUsuario(String nombre,String nombre_trabajo) throws Exception {
        //mouse.ClickearJs(locator_input_nombre_usuario,nombre);
        teclado.Escribir(locator_input_nombre_usuario,nombre);
        teclado.Escribir(locator_input_nombre_trabajo,nombre_trabajo);
        mouse.ClickearJs(locator_button_search);
    }

    public void agregarUsuario(String rol,String nombre_empleado,String estado,String nombre_usuario,String contraseña) throws Exception {
        //NECESITO QUE EL USUARIO SEA VALIDO
        //CONTRASEÑA ALFANUMERICA
        mouse.Clickear(locator_button_add);

    }

}
