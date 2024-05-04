package pages.Elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxPage {
    private final Click mouse;
    private final Texto texto;
    public CheckBoxPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
    }

    private final By locator_validar_resultado_check_box = By.xpath("//div[@id='result']/span[1]");
    private final By locator_check_expandir_todos = By.xpath("//button[@title='Expand all']");
    private final By locator_check_seleccionar_todos = By.cssSelector("#tree-node > ol > .rct-node > .rct-text .rct-checkbox > .rct-icon");

    public void seleccionarTodosLosCheckBox()throws Exception {
        mouse.Clickear(locator_check_expandir_todos);
        mouse.Clickear(locator_check_seleccionar_todos);
    }

    public void validarTextCheckBox(String youHaveSelected)throws Exception {
        boolean validacion = texto.compararTextoContiene(locator_validar_resultado_check_box,youHaveSelected);
        Assert.assertTrue(validacion);
    }
}
