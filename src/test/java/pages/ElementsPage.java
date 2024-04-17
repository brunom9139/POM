package pages;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    private Click mouse;

    private final By selectorComboBoxCompras = By.id("item-0");

    public ElementsPage(WebDriver driver){
        this.mouse = new Click(driver);
    }

    public void hacerClickEnTextBoxFormularioPaginaCompras() throws Exception {
        mouse.ClickearJs(selectorComboBoxCompras);
    }


}
