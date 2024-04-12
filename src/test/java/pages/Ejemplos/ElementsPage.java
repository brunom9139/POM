package pages.Ejemplos;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    private Click mouse;
    private Escribir teclado;
    private Acciones acciones;

    private final By selectorComboBoxCompras = By.id("item-0");

    public ElementsPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
    }

    public void hacerClickEnTextBoxFormularioPaginaCompras() throws Exception {
        mouse.ClickearJs(selectorComboBoxCompras);
    }

}
