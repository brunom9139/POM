package pages.Elements;

import actions.Click;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ModalsDialogs {
    private final By locator_button_small_modal = By.xpath("//button[@id='showSmallModal']");
    private final By locator_respuesta_smash = By.xpath("//div[contains(text(),'Small Modal')]");
    private final By locator_button_close_smash = By.id("closeSmallModal");
    private final By locator_button_large_modal = By.id("showLargeModal");
    private final By locator_respuesta_large = By.xpath("//div[contains(text(),'Large Modal')]");
    private final By locator_button_close_large = By.id("closeLargeModal");
    private final Texto texto;
    private final Click mouse;
    public ModalsDialogs(WebDriver driver){
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
    }
    public void clickBTsmash() throws Exception {
        mouse.Clickear(locator_button_small_modal);
    }
    public void verificoTextEnSmallModals(String mensaje) throws Exception {
        boolean verifica = texto.compararTextoContains(locator_respuesta_smash,mensaje);
        Assert.assertTrue(verifica);
        mouse.Clickear(locator_button_close_smash);
    }
    public void clickBTlarge() throws Exception {
        mouse.Clickear(locator_button_large_modal);
    }
    public void verificoTextoEnLargeModals(String mensaje) throws Exception {
        boolean verifico = texto.compararTextoContains(locator_respuesta_large,mensaje);
        Assert.assertTrue(verifico);
        mouse.Clickear(locator_button_close_large);
    }
}
