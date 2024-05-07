package pages.ToolsQaFormulario;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQaPage {
    private final Click mouse;
    private final Acciones acciones;
    private final CambioVentana cambiar_ventana;
    private final Escribir escribir;
    private final ComboBox combo;


    public ToolsQaPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.acciones = new Acciones(driver);
        this.cambiar_ventana = new CambioVentana(driver);
        this.escribir = new Escribir(driver);
        this.combo = new ComboBox(driver);

    }

    private final By locator_tools_qa = By.xpath("//img[@class='banner-image']");
    private final By locator_button_enroll_now = By.xpath("//a[@class='btn-block btn btn-primary-shadow btn-shadow']");

    private final By locator_input_primer_nombre = By.id("first-name");
    private final By locator_input_apellido = By.id("last-name");
    private final By locator_input_email = By.id("email");
    private final By locator_input_telefono = By.id("mobile");
    private final By locator_input_pais = By.xpath("//select[@name='country']");
    private final By locator_input_ciudad = By.id("city");
    private final By locator_input_mensaje = By.id("message");




    public void clickToolsQa() throws Exception {
        mouse.Clickear(locator_tools_qa);
        cambiar_ventana.cambiarVentana();
    }

    public void clickEnrollNow() {
        acciones.hacerClick(locator_button_enroll_now);
    }


    public void cargaFormularioEnrollNow(String nombre, String apellido, String email, String telefono, String pais, String ciudad, String comentario) throws Exception {
        escribir.Escribir(locator_input_primer_nombre,nombre);
        escribir.Escribir(locator_input_apellido,apellido);
        escribir.Escribir(locator_input_email,email);
        escribir.Escribir(locator_input_telefono,telefono);
        combo.seleccionarPorIndex(locator_input_pais,pais);
        escribir.Escribir(locator_input_ciudad,ciudad);
        escribir.Escribir(locator_input_mensaje,comentario);
    }

}
