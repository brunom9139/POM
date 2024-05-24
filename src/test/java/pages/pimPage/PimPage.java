package pages.pimPage;

import actions.*;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CadenaCaracteres;
import utils.RandomNameGenerator;

import java.util.List;

public class PimPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;
    private final Acciones accion;
    private final EsperarTiempo esperar_tiempo;
    private final CadenaCaracteres cadenaCaracteres;


    CadenaCaracteres cadena = new CadenaCaracteres();

    public PimPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.accion = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();
        this.cadenaCaracteres = new CadenaCaracteres();
    }

    private String primer_nombre_empleado;
    private String segundo_nombre_empleado;
    private String apellido_empleado;
    private String nombre_usuario;

    private final By locator_label = By.xpath("(//label[@class='oxd-label'])[2]");
    private final By locator_input_search_id = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_buton_submit = By.xpath("//button[@type='submit']");
    private final By locator_button_add = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    private final By locator_lapiz_edit = By.xpath("//div[@class='oxd-table-body']//div//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]");
    private final By locator_input_name1 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
    private final By locator_input_name2 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']");
    private final By locator_input_apellido = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
    private final By locator_button_admin = By.xpath("//span[text()='Admin']");
    private final By locator_button_user_management = By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]");
    private final By locator_button_users = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])");
    private final By lapiz = By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]");
    private final By input_rol = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    private final By input_status = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
    private final By locator_input_employeet_buscador = By.xpath("//input[@placeholder='Type for hints...']");
    private final By locator_button_edit_redondo = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    private final By locator_input_username_focus = By.xpath("(//input)[8]");
    private final By locator_input_contra1_focus = By.xpath("(//input)[11]");
    private final By locator_input_contra2_focus = By.xpath("(//input)[12]");
    private final By locator_button_status_redondo = By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]");

    private final By locator_name_user_search = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By id_locator = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    public void buscarEmpleadoPorId(String ID) throws Exception {
        accion.hacerScroll(locator_label);
        teclado.Escribir(locator_input_search_id,ID);
        accion.hacerScroll(locator_buton_submit);
        mouse.ClickearJs(locator_buton_submit);
    }

    public void editarNombreEmpleado(String nombre1,String nombre2,String apellido){
        try {
            List<WebElement> elementosLapiz = Session.getInstance().getWebDriver().findElements(locator_lapiz_edit);
            for (int i = 1; i <= elementosLapiz.size(); i++) {
                WebElement elemento_lapiz = Session.getInstance().getWebDriver().findElement(By.xpath("(//div[@class='oxd-table-cell-actions']/button[2])["+i+"]"));
                accion.hacerScroll(elemento_lapiz);
                elemento_lapiz.click();
                //click en cada input y escribir
                accion.hacerScroll(locator_input_name1);
                accion.limpiarCampoyEscribir(locator_input_name1,nombre1);

                accion.hacerScroll(locator_input_name2);
                accion.limpiarCampoyEscribir(locator_input_name2,nombre2);

                accion.hacerScroll(locator_input_apellido);
                accion.limpiarCampoyEscribir(locator_input_apellido,apellido);

                accion.hacerScroll(locator_buton_submit);
                mouse.Clickear(locator_buton_submit);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickEnAgregar() throws Exception {
        accion.hacerScroll(locator_button_add);
        mouse.ClickearJs(locator_button_add);
    }

    public void agregarEmpleado() throws Exception {
        primer_nombre_empleado = RandomNameGenerator.obtenerNombreModificado();
        segundo_nombre_empleado = RandomNameGenerator.obtenerNombreModificado();
        apellido_empleado = RandomNameGenerator.obtenerApellidoModificado();
        nombre_usuario = RandomNameGenerator.generateAnimalStringWithNumber();
        String contra = cadenaCaracteres.generarStringAlfanumericoAleatorio(12);

        teclado.Escribir(locator_input_name1, primer_nombre_empleado);
        teclado.Escribir(locator_input_name2, segundo_nombre_empleado);
        teclado.Escribir(locator_input_apellido, apellido_empleado);

        mouse.Clickear(locator_button_edit_redondo);

        //FALTA ESCRIBIR  EL ID ALEATORIO 4 NUM
        accion.limpiarCampoyEscribir(id_locator,cadenaCaracteres.generarStringNumericoAleatorio(4));
       // teclado.Escribir(id_locator,"9463");

        esperar_tiempo.esperar(2);
        accion.limpiarCampoyEscribir(locator_input_username_focus,nombre_usuario);

        mouse.ClickearJs(locator_button_status_redondo);

        accion.limpiarCampoyEscribir(locator_input_contra1_focus,contra);

        accion.limpiarCampoyEscribir(locator_input_contra2_focus,contra);

        mouse.Clickear(locator_buton_submit);
        //aqui  me salta el error de requerido, por lo tanto no guarda el empleado
        }

    public void agregarEmpleadoYEditarlo() throws Exception {

        mouse.Clickear(locator_button_admin);
        mouse.Clickear(locator_button_user_management);
        mouse.Clickear(locator_button_users);

        teclado.Escribir(locator_name_user_search,nombre_usuario);
        esperar_tiempo.esperar(5);

       // accion.flechaAbajo();

        accion.hacerScroll(locator_buton_submit);
        mouse.ClickearJs(locator_buton_submit);

        esperar_tiempo.esperar(8);

        accion.hacerScroll(lapiz);
        mouse.Clickear(lapiz);

        accion.clickFlechaAbajo(input_rol);
        accion.clickFlechaAbajo(input_status);

        mouse.ClickearJs(locator_buton_submit);

    }


}
