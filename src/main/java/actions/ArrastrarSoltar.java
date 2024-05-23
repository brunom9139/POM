package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ConfigReader;

public class ArrastrarSoltar {
    private final EsperarHasta esperar;
    private final Acciones accion;
    private final ElementoResaltado resaltar;
    private WebDriver driver;


    public ArrastrarSoltar(WebDriver driver) {
        this.driver = driver;
        this.esperar = new EsperarHasta(driver);
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
    }

    public void arrastrarYSoltar(By elementoOrigen, By elementoDestino) throws Exception {
        try {
            WebElement fuente = esperar.presente(elementoOrigen);
            WebElement destino = esperar.presente(elementoDestino);
            String colorHabilitado = ConfigReader.obtenerHabilitacionColor();
            if(fuente != null && destino !=null){
                accion.hacerScroll(fuente);
                if ("true".equalsIgnoreCase(colorHabilitado)) {
                    resaltar.resaltar(fuente);
                    resaltar.resaltar(destino);
                }
                accion.arrastrarSoltar(fuente,destino);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public void dragElementByOffset(By locator, int xOffset, int yOffset) {
        WebElement elemento = esperar.presente(locator);
        Actions actions = new Actions(driver);
        actions.clickAndHold(elemento)//para sostener el boton sin soltarlo
                .moveByOffset(xOffset, yOffset)
                .release()//para que lo suelte al boton
                .perform();
    }
}
