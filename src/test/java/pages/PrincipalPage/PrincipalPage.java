package pages.PrincipalPage;

import actions.Click;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PrincipalPage {
    private final  By locator_label_sesion = By.xpath("//h6[text()='Dashboard']");
    private final Texto texto;
    private final By locator_button_admin = By.xpath("//span[text()='Admin']");



    private final Click mouse;


    public PrincipalPage(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
    }
    public void comparoTexto(String miText) throws Exception {
        boolean validarTexto = texto.compararTextoIgual(locator_label_sesion,miText);
        Assert.assertTrue(validarTexto);
    }
    public void clickAdmin() throws Exception {
        mouse.Clickear(locator_button_admin);

    }
}
