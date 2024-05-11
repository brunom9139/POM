package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

import java.io.File;

public class SubirArchivo {

    private WebDriver driver;
    private final Acciones accion;
    private final ElementoResaltado resaltar;


    public SubirArchivo(WebDriver driver){
        this.driver = driver;
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
    }


    /**
     * Este método permite subir un archivo a través de un campo de carga de archivos en una página web.
     *
     * @param locator El localizador del elemento de carga de archivos.
     * @param archivo El archivo que se va a subir.
     * Un ejemplo de cómo implementarlo es:
     * File file = new File("C:\\archivos\\archivo_prueba.txt");
     * SubirArchivo uploader = new SubirArchivo(driver);
     * uploader.subir(fileUploadLocator, file);
     * ejemplo de uso subir_archivo.subir(locator_file_submit, new File("C:\\Users\\NEW GAME\\OneDrive\\Escritorio\\Nuevo documento de texto.txt"));
     * @throws Exception si ocurre algún error durante el proceso de subida del archivo.
     */
    public void subir(By locator, File archivo) throws Exception {
        try {
            WebElement elemento = driver.findElement(locator);
            String colorHabilitado = ConfigReader.obtenerHabilitacionColor();
            if (elemento != null) {
                accion.hacerScroll(elemento);
                if ("true".equalsIgnoreCase(colorHabilitado)) {
                    resaltar.resaltar(elemento);
                }
                elemento.sendKeys(archivo.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("No se pudo subir el archivo.");
        }
    }
}
