package actions;

import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.util.List;
import java.util.Objects;

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


    public boolean validarSiTextoSeEncontro(By locator, String texto)throws Exception {
        boolean encuentra = false;
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement element : elements) {
            if(element.getText() == texto){
                encuentra = true;
                break;
            }
        }
        return encuentra;

        /*boolean encuentra = false;
        try {
            // Encontrar elementos usando el locator proporcionado
            List<WebElement> elements = driver.findElements(locator);

            // Utilizar stream y anyMatch para verificar si algún elemento coincide con el texto
            encuentra = elements.stream()
                    .map(WebElement::getText)
                    .anyMatch(elementText -> elementText.equals(texto));

        } catch (Exception e) {
            // Manejar posibles excepciones
            e.printStackTrace();
        }
        return encuentra;*/
    }
    public int cantidadElementos(By locator)throws Exception {
        List<WebElement> elementos = driver.findElements(locator);
        return elementos.size();
    }
    public String estraerTexto(By locator){
        WebElement elemento = driver.findElement(locator);
        return elemento.getText();
    }

    public int encontrarPosicionTexto(By locator, String texto_a_comparar)throws Exception {
        List<WebElement> elementos = driver.findElements(locator);
        int posicionTexto = 1;
        for (WebElement elemento : elementos) {
            if(Objects.equals(elemento.getText(), texto_a_comparar)){
                break;
            }
            else{
                posicionTexto++;
            }
        }
        return posicionTexto;
    }

    /*int posicionTexto = texto.encontrarPosicionTexto(locator_textos_job_categories,texto_A_Borrar);
    WebElement locator_borrar_posicion_deseada = Session.getInstance().getWebDriver().findElement(By.xpath("(//div[@class='oxd-table-body']//button[1])["+posicionTexto+"]"));
        accion.hacerScroll(locator_borrar_posicion_deseada);
        locator_borrar_posicion_deseada.click();
        mouse.Clickear(locator_button_yes_delete);*/

}
