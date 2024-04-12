package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BuscarElemento {
    private final WebDriver driver;

    public BuscarElemento(WebDriver driver){
        this.driver = driver;
    }

    public WebElement buscarElemento(By locator){
        try {
            return driver.findElement(locator);
        }catch (NoSuchElementException e){
            throw new ElementoNoEncontradoException(STR."Elemento no encontrado: \{locator.toString()}", e);
        }
    }
}
