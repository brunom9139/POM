package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CambioVentana {

    private final WebDriver driver;
    private String ventanaPrincipal; // Variable para almacenar la ventana principal
    private String ultimaVentana; // Variable para almacenar la última ventana

    public CambioVentana(WebDriver driver){
        this.driver = driver;
        ventanaPrincipal = driver.getWindowHandle(); // Inicialización fuera de los métodos
    }

    public void cambiarVentana(){
        Set<String> ventanas = driver.getWindowHandles();
        for(String ventana : ventanas) {
            if(!ventana.equals(driver.getWindowHandle())) {
                driver.switchTo().window(ventana);
                ultimaVentana = ventana; // Actualiza la última ventana
                break;
            }
        }
    }

    public void volverVentanaPrincipal(){
        if (!ultimaVentana.isEmpty()) {
            driver.switchTo().window(ultimaVentana); // Cambia a la última ventana
            driver.close(); // Cierra la última ventana
        }
        driver.switchTo().window(ventanaPrincipal); // Cambia a la ventana principal
    }
    public void cerrarVentanaActual() {
        driver.close();
        driver.switchTo().window(ventanaPrincipal); // Vuelve a la ventana principal después de cerrar la ventana actual
    }

    public void cerrarTodasLasVentanas() {
        Set<String> ventanas = driver.getWindowHandles();
        for(String ventana : ventanas) {
            if(!ventana.equals(ventanaPrincipal)) {
                driver.switchTo().window(ventana);
                driver.close();
            }
        }
        driver.switchTo().window(ventanaPrincipal); // Vuelve a la ventana principal después de cerrar todas las ventanas
    }
    public void aceptarAlertaSiPresente() {
        try {
            Alert alerta = driver.switchTo().alert();
            alerta.accept();
        } catch (NoAlertPresentException e) {
            // No se encontró ninguna alerta, no es necesario hacer nada
        }
    }
    public void escribirEnAlerta(String texto) {
        try {
            Alert alerta = driver.switchTo().alert();
            alerta.sendKeys(texto);
        } catch (NoAlertPresentException e) {
            // No se encontró ninguna alerta que requiera texto, no es necesario hacer nada
        }
    }


}
