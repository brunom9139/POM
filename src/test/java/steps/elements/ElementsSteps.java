package steps.elements;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.elements.*;

public class ElementsSteps {
    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainsObj = new MainPage(driver);
    ElementsPage elementsObj = new ElementsPage(driver);
    TextBoxPage textBoxObj = new TextBoxPage(driver);
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    WebTablesPage webTables = new WebTablesPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);

    @Dado("que ingreso a la seccion element")
    public void queIngresoALaSeccionElement() throws Exception {
        mainsObj.clickElements();
    }

    @Cuando("ingreso a la seccion TextBox")
    public void ingresoALaSeccionTextBox() throws Exception {
        elementsObj.clickTextBox();
    }

    @Y("completo el formulario {string} {string} {string} {string}")
    public void completoElFormulario(String fullName, String email, String address1, String address2) throws Exception {
        textBoxObj.completarFormularioTextBox(fullName,email,address1,address2);
    }

    @Entonces("valido el nombre del {string}")
    public void validoElNombreDel(String fullName) throws Exception {
        textBoxObj.validarCargaFormularioTextBoxElements(fullName);
    }

    @Cuando("ingreso a la seccion ChexBox")
    public void ingresoALaSeccionChexBox() throws Exception {
        elementsObj.clickCheckBox();
    }

    @Y("selecciono todos los chexbox")
    public void seleccionoTodosLosChexbox() throws Exception {
        checkBoxObj.seleccionarTodosLosCheckBox();
    }

    @Entonces("valido que aparezca el texto {string}")
    public void validoQueAparezcaElTexto(String youHaveSelected) throws Exception {
        checkBoxObj.validarTextCheckBox(youHaveSelected);
    }

    @Cuando("ingreso a la seccion Radio")
    public void ingresoALaSeccionRadio() throws Exception {
        elementsObj.clickRadio();
    }

    @Y("selecciona el boton Yes")
    public void seleccionaElBotonYes() throws Exception {
        radioObj.clickRadioYes();
    }

    @Y("selecciona el boton impressive")
    public void seleccionaElBotonImpressive() throws Exception {
        radioObj.clickRadioImpressive();
    }

    @Entonces("Se valida que aparezca el mensaje {string}")
    public void seValidaQueAparezcaElMensaje(String mensajeValidar) throws Exception {
        radioObj.validarCargaFormularioTextBoxElements(mensajeValidar);
    }

    @Cuando("ingreso a la seccion Web Tables")
    public void ingresoALaSeccionWebTables() throws Exception {
        elementsObj.clickWebTables();
    }

    @Y("busca por el nombre {string}")
    public void buscaPorElNombre(String nombre) throws Exception {
        webTables.buscarTablaWebPage(nombre);
    }

    @Entonces("Se valida que encontro el nombre {string} en la tabla web tables")
    public void seValidaQueEncontroElNombreEnLaTablaWebTables(String nombre) throws Exception {
        webTables.validarElementoBuscadoEnWebPage(nombre);
    }

    @Y("elimino la primera fila encontrada")
    public void eliminoLaPrimeraFilaEncontrada() throws Exception {
        webTables.clickEliminarPrimerDatoEncontrado();
    }

    @Entonces("Se valida que aparece en Web Tables el mensaje {string}")
    public void seValidaQueApareceEnWebTablesElMensaje(String validarMensajeNorowsfound) throws Exception {
        webTables.validarQueAparezcaElMensajeNoNoRowsFound(validarMensajeNorowsfound);
    }

    @Y("edito el nombre Cierra por {string}")
    public void editoElNombreCierraPor(String nombreEditar) throws Exception {
        webTables.clickEditarPrimerDatoEncontrado(nombreEditar);
    }

    @Entonces("Se valida se edito el nombre {string} de manera correcta")
    public void seValidaSeEditoElNombreDeManeraCorrecta(String nombreEditado) throws Exception {
        webTables.validarEdicionNombreTablaWebTables(nombreEditado);
    }

    @Entonces("Se valida los siguientes mensajes {string} {string} {string}")
    public void seValidaLosSiguientesMensajes(String validarDobleClick, String validarClickSecundario, String validarCLick) throws Exception {
       buttonTables.validarTodosLosBotonesSessionButton(validarDobleClick,validarClickSecundario,validarCLick);
    }

    @Cuando("ingreso a la seccion Button")
    public void ingresoALaSeccionButton() throws Exception {
        elementsObj.clickButton();
    }

    @Y("click en los tres botones")
    public void clickEnLosTresBotones() throws Exception {
        buttonTables.clickearTodosLosBotonesSessionButton();
    }
}
