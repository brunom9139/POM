package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Acciones {
    private WebDriver driver;
    private BuscarElemento buscar;

    public Acciones(WebDriver driver){
        this.driver = driver;
        this.buscar = new BuscarElemento(driver);
    }

    public void Tab(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.TAB).perform();
    }

    public void hacerClick(By locator){
        Actions actions = new Actions(driver);
        scrollElemento(locator, actions).click().perform();
    }

    private Actions scrollElemento(By locator, Actions actions){
        return actions.moveToElement(buscar.buscarElemento(locator));
    }

    public void hacerScroll(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(buscar.buscarElemento(locator)).perform();
    }

    public void hacerScroll(WebElement elemento){
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).perform();
    }

    public void hacerClickSecundario(By locator){
        Actions actions = new Actions(driver);
        actions.contextClick(buscar.buscarElemento(locator)).perform();
    }

    public void clickEscribirFlechaAbajoEnter(By locator, String text){
        Actions actions = new Actions(driver);
        actions.click(buscar.buscarElemento(locator))
                .sendKeys(text)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
    }
    public void flechaAbajoDoble(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }
    public void flechaAbajo(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }
    public void clickFlechaAbajoDoble(By locator){
        Actions actions = new Actions(driver);
        //actions.click(buscar.buscarElemento(locator))
        scrollElemento(locator, actions).click()
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
    }
    //puede mejorarse
    public void clickFlechaAbajo(By locator){
        Actions actions = new Actions(driver);
        actions.click(buscar.buscarElemento(locator))
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
    }

    public void hacerDobleClick(By locator){
        Actions actions = new Actions(driver);
        actions.doubleClick(buscar.buscarElemento(locator)).perform();
    }

    public void arrastrarSoltar(By fuente, By destino){
        Actions actions = new Actions(driver);
        WebElement archivoFuente = buscar.buscarElemento(fuente);
        WebElement archivoDestino = buscar.buscarElemento(destino);
        actions.dragAndDrop(archivoFuente,archivoDestino).perform();
    }

    public void arrastrarSoltar(WebElement fuente, WebElement destino){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fuente,destino).perform();
    }
    public void aceptarAlertaConEspera(int tiempo) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempo));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    public boolean compararTextoAlert(String textoEsperado) {
        try {
            // Cambia el foco al alert
            Alert alert = driver.switchTo().alert();

            // Obtiene el texto del alert
            String textoAlert = alert.getText().trim();

            // Compara el texto del alert con el texto esperado
            return textoAlert.equals(textoEsperado.trim());
        } catch (NoAlertPresentException e) {
            System.out.println("No se encontró ninguna alerta.");
            return false;
        }
    }
    public void control_A(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(buscar.buscarElemento(locator))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();
    }

    public void realizarAccionConTeclas(By locator, Keys keyModifier, CharSequence keyToSend){
        Actions actions = new Actions(driver);
        WebElement elemento = buscar.buscarElemento(locator);
        actions.moveToElement(elemento);
        actions.keyDown(keyModifier);
        actions.sendKeys(keyToSend);
        actions.keyUp(keyModifier);
        actions.perform();
        //realizarAccionConTeclas(By.id("miElemento"), Keys.SHIFT, "t"); Ejemplo de como usarla
    }
    public void borrarTexto(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(buscar.buscarElemento(locator)).sendKeys(Keys.DELETE).perform();
    }
}


















