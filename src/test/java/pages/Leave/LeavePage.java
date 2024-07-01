package pages.Leave;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import actions.EsperarTiempo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    private final Click mouse;
    private final EsperarTiempo tiempo;
    private final Escribir teclado;
    private final Acciones action;
    private final By locator_button_leabel = By.xpath("//span[text()='Leave']");
    private final By locator_from_dato = By.xpath("(//div[@class='oxd-date-wrapper'])[1]");
    private final By locator_to_dato = By.xpath("(//div[@class='oxd-date-wrapper'])[2]");
    private final By locator_Show_Leave_with_Status = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    private final By locator_Leave_Type = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    private final By locator_Employee_Name = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    private final By locator_Sub_Unit = By.xpath("(//div[@class='oxd-select-text-input'])[3]");
    private final By locator_Include_Past_Employees = By.xpath("//div[@class='oxd-switch-wrapper']");

    private final By locator_button_submit = By.xpath("//button[@type='submit']");

    public LeavePage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.action = new Acciones(driver);
        this.tiempo = new EsperarTiempo();
    }
    public void clickLeavel() throws Exception {
        mouse.Clickear(locator_button_leabel);
    }
    public void cargoFecha(String fecha1,String fecha2) throws Exception {
        action.borroInputMetodoEspesifico(locator_from_dato);
        action.EscriboTextoMetodoEspesifico(locator_from_dato,fecha1);
        action.borroInputMetodoEspesifico(locator_to_dato);
        action.EscriboTextoMetodoEspesifico(locator_to_dato,fecha2);
    }
    public void cargamosLosStatus(String nombre) throws Exception {
        action.clickFlechaAbajo(locator_Show_Leave_with_Status);
        action.clickFlechaAbajoDoble(locator_Show_Leave_with_Status);
        action.clickFlechaAbajoTresVeces(locator_Show_Leave_with_Status);
        action.clickFlechaAbajoDoble(locator_Leave_Type);
        action.clickEscribirFlechaAbajoEnter(locator_Employee_Name,nombre);
        tiempo.esperar(2);
        action.FlechaAbajo(locator_Employee_Name);
        action.clickFlechaAbajo(locator_Sub_Unit);
        mouse.Clickear(locator_Include_Past_Employees);
    }
    public void guardamosDatos() throws Exception {
        mouse.Clickear(locator_button_submit);
    }

}
