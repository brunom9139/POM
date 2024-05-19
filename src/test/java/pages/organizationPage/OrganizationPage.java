package pages.organizationPage;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import actions.Texto;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private final By locator_button_locations = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]");
    private final By locator_button_structure = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[3]");
    private final By locator_button_edit = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-left']");
    private final By locator_input_name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_input_name_location_search = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_number_registration= By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By locator_input_city_location_search = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");

    private final By locator_input_tax = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
    private final By locator_input_phone = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
    private final By locator_input_phone_add = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");

    private final By locator_input_fax = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
    private final By locator_input_fax_add = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");

    private final By locator_input_email = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
    private final By locator_input_adress1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
    private final By locator_input_adress2 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[9]");
    private final By locator_input_city = By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
    private final By locator_input_city_add = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    private final By locator_input_province = By.xpath("(//input[@class='oxd-input oxd-input--active'])[11]");
    private final By locator_input_province_add = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By locator_input_codigo_postal = By.xpath("(//input[@class='oxd-input oxd-input--active'])[12]");
    private final By locator_input_codigo_postal_add = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");

    private final By locator_input_country_select = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    private final By locator_textarea_notes = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
    private final By locator_button_save = By.xpath("//button[@type='submit']");
    private final By locator_succes = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']");
    private final By locator_country=By.xpath("//label[text()='Country']");
    private final By locator_button_add = By.xpath("//button[text()=' Add ']");
    private final By locator_direccion_add = By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]");
    private final By locator_nota_add = By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]");


    public void clickEnOrganization() throws Exception {
        mouse.Clickear(locator_button_organization);
    }

    public void clickEnGeneralOrganization() throws Exception {
        mouse.Clickear(locator_button_general_organization);
    }

    public void clickEnLocations() throws Exception {
        mouse.Clickear(locator_button_locations);
    }

    public void clickEnStructure() throws Exception {
        mouse.Clickear(locator_button_structure);
    }

    public void editarCampos(String nombre, String num, String tax, String telefono, String fax, String email, String direccion1, String direccion2, String ciudad, String provincia, String codigo_postal, String notas) throws Exception {
        accion.hacerScroll(locator_button_edit);
        mouse.ClickearJs(locator_button_edit);

      //  accion.borrarTexto(locator_input_name);
        WebElement campo = Session.getInstance().getWebDriver().findElement(locator_input_name);
        mouse.ClickearJs(locator_input_name);
        campo.clear();
        teclado.Escribir(locator_input_name,nombre);

        mouse.ClickearJs(locator_number_registration);
        teclado.Escribir(locator_number_registration, String.valueOf(num));

        teclado.Escribir(locator_input_tax, String.valueOf(tax));

        teclado.Escribir(locator_input_phone, String.valueOf(telefono));

        teclado.Escribir(locator_input_fax, String.valueOf(fax));

        teclado.Escribir(locator_input_email,email);

        teclado.Escribir(locator_input_adress1,direccion1);

        teclado.Escribir(locator_input_adress2,direccion2);

        teclado.Escribir(locator_input_city,ciudad);

        mouse.ClickearJs(locator_input_province);
        teclado.Escribir(locator_input_province,provincia);

        accion.hacerScroll(locator_input_codigo_postal);
        mouse.ClickearJs(locator_input_codigo_postal);
        teclado.Escribir(locator_input_codigo_postal, String.valueOf(codigo_postal));

        accion.hacerScroll(locator_country);
        mouse.Clickear(locator_input_country_select);
        accion.clickFlechaAbajoDoble(locator_input_country_select);

        teclado.Escribir(locator_textarea_notes,notas);
        mouse.Clickear(locator_button_save);
    }

    public void  buscarLocation(String nombre,String ciudad, String letra) throws Exception {
        teclado.Escribir(locator_input_name_location_search,nombre);
        teclado.Escribir(locator_input_city_location_search,ciudad);
        accion.hacerScroll(locator_input_country_select);
        mouse.ClickearJs(locator_input_country_select);
        teclado.Escribir(locator_input_country_select,letra);
        //apretar enter
        mouse.ClickearJs(locator_button_save);
    }

    public void agregarLocation(String nombre,String ciudad,String provincia,String codigo_p, String telefono,String fax,String direccion,String notas) throws Exception {
        accion.hacerScroll(locator_button_add);
        mouse.ClickearJs(locator_button_add);
        teclado.Escribir(locator_input_name,nombre);
        teclado.Escribir(locator_input_city_add,ciudad);
        teclado.Escribir(locator_input_province_add,provincia);
        teclado.Escribir(locator_input_codigo_postal_add,codigo_p);
        teclado.Escribir(locator_input_phone_add,telefono);
        accion.hacerScroll(locator_input_fax_add);
        teclado.Escribir(locator_input_fax_add,fax);
        teclado.Escribir(locator_direccion_add,direccion);
        teclado.Escribir(locator_nota_add,notas);
        accion.hacerScroll(locator_button_save);
        mouse.ClickearJs(locator_button_save);

    }
}
