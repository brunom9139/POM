package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

public class Texto {

    private final WebDriver driver;
    private final Acciones accion;
    private final ElementoResaltado resaltar;

    public Texto(WebDriver driver) {
        this.driver = driver;
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
    }

    public boolean compararTextoIgual(By locator, String texto) throws Exception {
        try {
            WebElement elemento = driver.findElement(locator);
            String colorEnabled = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                accion.hacerScroll(elemento);
                if ("true".equalsIgnoreCase(colorEnabled)) {
                    resaltar.resaltar(elemento);
                }
                String textoElemento = elemento.getText().trim();
                return textoElemento.equals(texto.trim());
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean compararTextoContiene(By locator, String texto) throws Exception {
        try {
            WebElement elemento = driver.findElement(locator);
            String colorEnabled = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                accion.hacerScroll(elemento);
                if ("true".equalsIgnoreCase(colorEnabled)) {
                    resaltar.resaltar(elemento);
                }
                String textoElemento = elemento.getText().trim();
                return textoElemento.contains(texto.trim());
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
