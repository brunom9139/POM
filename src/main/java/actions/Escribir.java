package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;


public class Escribir {
    private final WebDriver driver;
    private final EsperarHasta esperar;
    private final Acciones accion;
    private final ElementoResaltado resaltar;

    public Escribir(WebDriver driver){
        this.driver = driver;
        this.esperar = new EsperarHasta(driver);
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
    }

    public void Escribir(By locator,String texto) throws Exception {
        escribirTexto(locator,texto, false);
    }

    public void EscribirJs(By locator, String texto) throws Exception {
        escribirTexto(locator,texto, true);
    }

    public void escribirTexto(By locator, String texto, boolean usarJs) {
        try {
            WebElement elemento = esperar.presente(locator);
            String colorHabilitado = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                accion.hacerScroll(elemento);
                if ("true".equalsIgnoreCase(colorHabilitado)) {
                    resaltar.resaltar(elemento);
                }
                if (usarJs) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", elemento);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", elemento, texto);
                } else {
                    elemento.clear();
                    elemento.sendKeys(texto);
                }
            } else {
                System.out.println("El elemento no se encontró o no es escribible.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
