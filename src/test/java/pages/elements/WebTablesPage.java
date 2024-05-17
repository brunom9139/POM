package pages.elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTablesPage {
    private final Escribir teclado;
    private final Texto texto;
    private final Click mouse;

    public WebTablesPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
    }

    private final By locator_input_search_web_tables = By.id("searchBox");
    private final By locator_label_validar_elemento_buscado= By.xpath("(//div[@class='rt-tr -odd']/div[@class='rt-td'])[1]");
    private final By locator_button_delete_primera_fila_web_table = By.id("delete-record-1");
    private final By locator_label_validar_eliminacion_de_registros = By.xpath("//div[@class='rt-noData']");
    private final By locator_button_editar_primera_fila_web_table = By.xpath("//span[@id='edit-record-1']");
    private final By locator_input_first_name = By.xpath("//input[@id='firstName']");
    private final By locator_button_submit_web_tables_edit = By.xpath("//*[@id='submit']");


    public void validarElementoBuscadoEnWebPage(String fullName)throws Exception {
        boolean validacion = texto.compararTextoContiene(locator_label_validar_elemento_buscado,fullName);
        Assert.assertTrue(validacion);
    }

    public void validarQueAparezcaElMensajeNoNoRowsFound(String validarMensajeNorowsfound)throws Exception {
        boolean validacion = texto.compararTextoContiene(locator_label_validar_eliminacion_de_registros,validarMensajeNorowsfound);
        Assert.assertTrue(validacion);
    }

    public void buscarTablaWebPage(String texto_a_buscar) throws Exception {
        teclado.Escribir(locator_input_search_web_tables,texto_a_buscar);
    }

    public void clickEliminarPrimerDatoEncontrado() throws Exception {
        mouse.Clickear(locator_button_delete_primera_fila_web_table);
    }

    public void clickEditarPrimerDatoEncontrado(String nombreEditar) throws Exception {
        mouse.Clickear(locator_button_editar_primera_fila_web_table);
        teclado.Escribir(locator_input_first_name,nombreEditar);
        mouse.Clickear(locator_button_submit_web_tables_edit);
    }

    public void validarEdicionNombreTablaWebTables(String validarMensajeNorowsfound)throws Exception {
        boolean validacion = texto.compararTextoContiene(locator_label_validar_elemento_buscado,validarMensajeNorowsfound);
        Assert.assertTrue(validacion);
    }

}
