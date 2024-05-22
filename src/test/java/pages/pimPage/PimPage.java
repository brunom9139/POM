package pages.pimPage;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import actions.Texto;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CadenaCaracteres;

import java.util.List;

public class PimPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;
    private final Acciones accion;

    CadenaCaracteres cadena = new CadenaCaracteres();

    public PimPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.accion = new Acciones(driver);
    }

    private final By locator_label = By.xpath("(//label[@class='oxd-label'])[2]");
    private final By locator_input_search_id = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_buton_submit = By.xpath("//button[@type='submit']");
    private final By locator_lapiz_edit = By.xpath("//div[@class='oxd-table-body']//div//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]");
    private final By locator_input_name1 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
    private final By locator_input_name2 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']");
    private final By locator_input_apellido = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");

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



}
