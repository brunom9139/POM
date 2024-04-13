package actions;

import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.util.List;

public class Click {//clase
    private final WebDriver driver;
    private final EsperarHasta esperar;
    private final Acciones accion;
    private final ElementoResaltado resaltar;
    private final ScrollToElementJavaScript scroll;


    public Click(WebDriver driver){//construcor que declara todo lo que neceisto usar
        this.driver = driver;
        this.esperar = new EsperarHasta(driver);
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
        this.scroll = new ScrollToElementJavaScript(driver);

    }

    public void ClickearJs(By locator) throws Exception {//ESTE ES PARA UN SOLO CLICK CON JAVASCRIPT
        clickearElemento(locator, true);//lleva true
    }

    public void Clickear(By locator) throws Exception {//ESTE ES PARA UN SOLO CLICK CON SELENIUM
        clickearElemento(locator, false);//lleve false
    }

    //los dos metodos de arriba llaman a un mismo metodo clickearElemento

    //CON ESTE PODES CONTROLAR VARIAS COSAS BOTONES IMPUTS CON UN SOLO SELECTOR
    public void hacerClickEnElementos(By locator) {//ESTE AUN NO LO USES ES PARA HACER VARIOS CLICKS PERO AUN NO LES ENSEÑE
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
            String colorEnabled = ConfigReader.obtenerHabilitacionColor();//almacenamos en una variable para ver si se pintara
            if (elemento != null) {
                //accion.hacerScroll(elemento);//este no te estaba reaccionando bien.
                scroll.scrollLocator(locator);//este es el nuevo scroll
                if ("true".equalsIgnoreCase(colorEnabled)) {//evalua la condicion de un metodo para ver si pinta, pinta si es true
                    resaltar.resaltar(elemento);//pinta el recuadro
                }
                if (usarJs) {//aqui decide por que hara click por que ya esta definido en el mismo metodo de arriba
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemento);//click con java script
                } else {
                    elemento.click();//click con selenium
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
