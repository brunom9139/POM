package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CambioFrame {
    private final WebDriver driver;

    public CambioFrame(WebDriver driver){
        this.driver = driver;
    }

    public void cambiarAFramePorId(String id) {
        driver.switchTo().frame(id);
    }

    public void cambiarAFramePorNombre(String nombre) {
        driver.switchTo().frame(nombre);
    }

    public void cambiarAFramePorElemento(By locator) {
        driver.switchTo().frame(driver.findElement(locator));
    }

    public void volverAlContenidoPrincipal() {
        driver.switchTo().defaultContent();
    }
}
