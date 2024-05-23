package pages.AdminPage;

import actions.*;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;

public class AdminPage {
    private final Texto texto;
    private final Click mouse;
    private final Acciones acciones;
    private final Escribir teclado;
    private final EsperarTiempo esperar_tiempo;
    private final SubirArchivo subir_archivo;
    private final ArrastrarSoltar arrastrar_soltar;
    private final ElementoResaltado elemento_resaltado;


    private final By locator_input_username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_select_user_role = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    private final By locator_input_emmployee = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    private final By locator_select_status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    private final By locator_button_submit = By.xpath("//button[@type = 'submit']");
    private final By locator_user_encontrado =By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]");
    private final By locator_button_reset = By.xpath("(//button[@type = 'button'])[4]");
    private final By locator_system_users_label = By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");
    private final By locator_corporate_branding = By.xpath("//a[text()='Corporate Branding']");
    private final By locator_input_file = By.xpath("(//input[@class='oxd-file-input'])[1]");
    private final By locator_button_color = By.xpath("//div[@class='oxd-color-picker-indicator']");
    private final By locator_color_button = By.xpath("(//*[@class='oxd-color-input-preview'])[3]");



    public AdminPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();
        this.subir_archivo = new SubirArchivo(driver);
        this.arrastrar_soltar = new ArrastrarSoltar(driver);
        this.elemento_resaltado = new ElementoResaltado(driver);

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

    public void encontrarPosicionYSelecciona(String textoBuscado) throws Exception {
        //locator_system_users_label
        int posicion = texto.encontrarPosicionTexto(locator_system_users_label,textoBuscado);
        System.out.println(posicion);
        WebElement checks = Session.getInstance().getWebDriver().findElement(By.xpath("(//div[@class='oxd-table-body']/div/div/div[1])["+posicion+"]"));
        checks.click();
    }

    public void clickCorporateBranding() throws Exception {
        mouse.Clickear(locator_corporate_branding);
        File file = new File("C:\\Users\\NEW GAME\\Downloads\\SELENIUM\\SELECTORES.txt");
        subir_archivo.subir(locator_input_file,file);
    }


    public void clickCorporateBrandingMoverColor() throws Exception {
        mouse.Clickear(locator_corporate_branding);
        mouse.Clickear(locator_color_button);
        mouse.Clickear(locator_button_color);
        arrastrar_soltar.dragElementByOffset(locator_button_color, 150,0);
    }

    public void clickCorporateBrandingjS() throws Exception {
        mouse.Clickear(locator_corporate_branding);
        mouse.Clickear(locator_color_button);
        WebElement elemento = Session.getInstance().getWebDriver().findElement(By.xpath("//div[@class='oxd-color-picker-indicator']"));
        elemento_resaltado.resaltarColorCajaTexto(elemento, 150,150);
        arrastrar_soltar.dragElementByOffset(locator_button_color, -50,30);
    }


}
