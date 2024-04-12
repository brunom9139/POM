package pages;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    public final By full_name_xpath = By.id("userName");

    private final By email_xpath = By.id("userEmail");
    private final By address_xpath = By.id("currentAddress");
    private final By button_store_aplicacion = By.xpath("//div[text()='Book Store Application']");

    public FormPage(WebDriver driver) {
        //super(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
    }

    public void ingresarNombreCompleto(String name) throws Exception {
        teclado.Escribir(full_name_xpath,name);
    }

    public void ingresarEmail(String email) throws Exception {
        teclado.Escribir(email_xpath,email);
    }

    public void ingresarDireccion(String email) throws Exception {
        teclado.Escribir(address_xpath, email);
    }

    public void hacerClickEnBotonStore(){
        acciones.hacerClick(button_store_aplicacion);
    }
}























