package pages.LoginPage;

import actions.Click;
import actions.Escribir;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogueoPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;

    public LogueoPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
    }



    private final By locator_input_name = By.xpath("//input[@name='username']");
    private final By locator_input_pasword = By.xpath("//input[@name='password']");
    private final By locator_button = By.xpath("//button[@type='submit']");
    private final  By locator_label_credenciales_incorrectas = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");




    public void cargarCampos(String nombre, String contrasena) throws Exception {
        teclado.Escribir(locator_input_name,nombre);
        teclado.Escribir(locator_input_pasword,contrasena);
        mouse.Clickear(locator_button);
    }

    public void validarCredencialesInvalidasLogeo(String credencialesInvalidas) throws Exception {
        boolean validarTexto = texto.compararTextoIgual(locator_label_credenciales_incorrectas,credencialesInvalidas);
        Assert.assertTrue(validarTexto);
    }
}