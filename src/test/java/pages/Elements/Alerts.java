package pages.Elements;

import actions.CambioVentana;mal
import actions.Click;
import actions.Escribir;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Alerts {
    private final Click mouse;
    private final Escribir teclado;mal
    private final Texto texto;
    private final By bt_one = By.xpath("(//button[@class='btn btn-primary'])[1]");
    private final By bt_two = By.xpath("(//button[@class='btn btn-primary'])[2]");
    private final By bt_tree = By.xpath("(//button[@class='btn btn-primary'])[3]");
    private final By bt_four = By.xpath("(//button[@class='btn btn-primary'])[4]");
    private final By verifico = By.xpath("//span[text()='Juan Carlos']");

    public Alerts(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.texto = new Texto(driver);
    }

    public void clickPrimerBt() throws Exception {
        mouse.Clickear(bt_one);
    }
    public void clickSegundoBt() throws Exception {
        mouse.Clickear(bt_two);
    }
    public void clickTercerBt() throws Exception {
        mouse.Clickear(bt_tree);
    }
    public void clickCuarto() throws Exception {
        mouse.Clickear(bt_four);
    }
    public void validoTexto(String nombre) throws Exception {
        boolean valido = texto.compararTextoContains(verifico,nombre);
        Assert.assertTrue(valido);
    }

}
