package pages.Elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Radio {
    private final Click mouse;
    private final Texto texto;

    public Radio(WebDriver driver){
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
    }

    private final By locator_button_radio_yes = By.cssSelector(".custom-control:nth-child(2) > .custom-control-label");
    private final By locator_button_radio_impressive = By.cssSelector(".custom-control:nth-child(3) > .custom-control-label");
    private final By locator_label_validar_seleccion_radio = By.xpath("//span[@class='text-success']");

    public void clickRadioYes() throws Exception {
        mouse.Clickear(locator_button_radio_yes);
    }

    public void clickRadioImpressive() throws Exception {
        mouse.Clickear(locator_button_radio_impressive);
    }

    public void validarCargaFormularioTextBoxElements(String fullName)throws Exception {
        boolean validacion = texto.compararTextoContains(locator_label_validar_seleccion_radio,fullName);
        Assert.assertTrue(validacion);
    }
}
