package actions;

import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.util.List;

public class Click {
    private final EsperarHasta esperar;
    private final Acciones accion;
    private final ElementoResaltado resaltar;
    private final JavaScript javaScript;


    public Click(WebDriver driver){
        this.esperar = new EsperarHasta(driver);
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
        this.javaScript = new JavaScript(driver);
    }

    public void ClickearJs(By locator) throws Exception {
        clickearElemento(locator, true);
    }

    public void Clickear(By locator) throws Exception {
        clickearElemento(locator, false);
    }

    public void hacerClickEnElementos(By locator) {
        try {
            List<WebElement> elementos = Session.getInstance().getWebDriver().findElements(locator);
            if (elementos != null && !elementos.isEmpty()) {
                for (WebElement elemento : elementos) {
                    accion.hacerScroll(elemento);
                    elemento.click();
                }
            } else {
                System.out.println("La lista de elementos está vacía o es nula.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void clickearElemento(By locator, boolean usarJs) throws Exception {
        try {
            WebElement elemento = esperar.presente(locator);
            String colorEnabled = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                javaScript.scrollLocator(locator);
                if ("true".equalsIgnoreCase(colorEnabled)) {
                    resaltar.resaltar(elemento);
                }
                if (usarJs) {
                    javaScript.click(elemento);
                } else {
                    elemento.click();
                }
            } else {
                throw new Exception("El elemento no se encontró o no es clickeable.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
