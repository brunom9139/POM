package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

public class ElementoResaltado {
    private final WebDriver driver;

    public ElementoResaltado(WebDriver driver) {
        this.driver = driver;
    }

    public void resaltar(WebElement elemento) {
        String colorElemento = ConfigReader.obtenerColorElemento();
        int tiempoElemento = ConfigReader.obtenerTiempoResaltadoElemento();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px solid " + colorElemento + "'", elemento);
        try {
            Thread.sleep(tiempoElemento);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].style.border=''", elemento);
    }

}
