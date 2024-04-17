package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript {
    private WebDriver driver;
    private BuscarElemento buscar;
    public JavaScript(WebDriver driver){
        this.driver = driver;
        this.buscar = new BuscarElemento(driver);
    }

    public void scrollLocator(By locator){
        WebElement element = buscar.buscarElemento(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void click(WebElement elemento)  {
        try{
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elemento);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public void limpiar(WebElement elemento)  {
        try{
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", elemento);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public void escribir(WebElement elemento,String texto)  {
        try{
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", elemento, texto);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
