package actions;
import factory.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class DesplazoVentana {
    WebDriver driver = WebDriverManager.getDriver();
    public void desplazarBarraIzquierdaDerecha() {
        // Ejecutar un script JavaScript para desplazar la barra de izquierda a derecha
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft += 1000;", driver.findElement(By.xpath("//tu/xpath/de/la/barra")));
    }

}
