package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;


public class Escribir {
    private final EsperarHasta esperar;
    private final ElementoResaltado resaltar;
    private final JavaScript javaScript;


    public Escribir(WebDriver driver){
        this.esperar = new EsperarHasta(driver);
        this.resaltar = new ElementoResaltado(driver);
        this.javaScript = new JavaScript(driver);
    }

    public void Escribir(By locator,String texto) throws Exception {
        escribirTexto(locator,texto, false);
    }

    public void EscribirJs(By locator, String texto) throws Exception {
        escribirTexto(locator,texto, true);
    }

    private void escribirTexto(By locator, String texto, boolean usarJs) {
        try {
            WebElement elemento = esperar.presente(locator);
            String colorHabilitado = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                javaScript.scrollLocator(locator);
                if ("true".equalsIgnoreCase(colorHabilitado)) {
                    resaltar.resaltar(elemento);
                }
                if (usarJs) {
                    javaScript.limpiar(elemento);
                    javaScript.escribir(elemento,texto);
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
