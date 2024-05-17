package pages.organizationPage;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CadenaCaracteres;

public class OrganizationPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;
    private final Acciones accion;

    CadenaCaracteres cadena = new CadenaCaracteres();

    public OrganizationPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.accion = new Acciones(driver);
    }

    private final By locator_button_organization = By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[3]");
    private final By locator_button_general_organization = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]");
    private final By locator_button_edit = By.xpath("//input[@type='checkbox']");
    private final By locator_input_name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_number_registration= By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By locator_input_tax = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
    private final By locator_input_phone = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
    private final By locator_input_fax = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
    private final By locator_input_email = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
    private final By locator_input_adress1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
    private final By locator_input_adress2 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[9]");
    private final By locator_input_city = By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
    private final By locator_input_province = By.xpath("(//input[@class='oxd-input oxd-input--active'])[11]");
    private final By locator_input_codigo_postal = By.xpath("(//input[@class='oxd-input oxd-input--active'])[12]");
    private final By locator_input_country_select = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    private final By locator_textarea_notes = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
    private final By locator_button_save = By.xpath("//button[@type='submit']");
    private final By locator_succes = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']");

    public void clickEnOrganization() throws Exception {
        mouse.Clickear(locator_button_organization);
    }

    public void clickEnGeneralOrganization() throws Exception {
        mouse.Clickear(locator_button_organization);
    }

    public void clickEnEdit() throws Exception {
        mouse.Clickear(locator_button_edit);
    }

    public void editarCampos(String nombre, String num, String tax, String telefono, String fax, String email, String direccion1, String direccion2, String ciudad, String provincia, String codigo_postal, String notas) throws Exception {
        teclado.Escribir(locator_input_name,nombre);
        teclado.Escribir(locator_number_registration, String.valueOf(num));
        teclado.Escribir(locator_input_tax, String.valueOf(tax));
        teclado.Escribir(locator_input_phone, String.valueOf(telefono));
        teclado.Escribir(locator_input_fax, String.valueOf(fax));
        teclado.Escribir(locator_input_email,email);
        teclado.Escribir(locator_input_adress1,direccion1);
        teclado.Escribir(locator_input_adress2,direccion2);
        teclado.Escribir(locator_input_city,ciudad);
        teclado.Escribir(locator_input_province,provincia);
        teclado.Escribir(locator_input_codigo_postal, String.valueOf(codigo_postal));
        mouse.Clickear(locator_input_country_select);
        accion.clickFlechaAbajoDoble(locator_input_country_select);
        teclado.Escribir(locator_textarea_notes,notas);
        mouse.Clickear(locator_button_save);
    }


}
