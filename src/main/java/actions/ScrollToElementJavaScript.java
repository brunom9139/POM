package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToElementJavaScript {
    private WebDriver driver;
    private BuscarElemento buscar;
    public ScrollToElementJavaScript(WebDriver driver){
        this.driver = driver;
        this.buscar = new BuscarElemento(driver);
    }

    public void scrollLocator(By locator){
        WebElement element = buscar.buscarElemento(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
