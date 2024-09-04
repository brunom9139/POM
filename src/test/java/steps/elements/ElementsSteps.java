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
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);

    @Y("selecciono todos los chexbox")
    public void seleccionoTodosLosChexbox() throws Exception {
        checkBoxObj.seleccionarTodosLosCheckBox();
    }

    @Entonces("valido que aparezca el texto {string}")
    public void validoQueAparezcaElTexto(String youHaveSelected) throws Exception {
        checkBoxObj.validarTextCheckBox(youHaveSelected);
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

    @Entonces("Se valida los siguientes mensajes {string} {string} {string}")
    public void seValidaLosSiguientesMensajes(String validarDobleClick, String validarClickSecundario, String validarCLick) throws Exception {
       buttonTables.validarTodosLosBotonesSessionButton(validarDobleClick,validarClickSecundario,validarCLick);
    }


    @Y("click en los tres botones")
    public void clickEnLosTresBotones() throws Exception {
        buttonTables.clickearTodosLosBotonesSessionButton();
    }

    @Dado("que ingreso a la seccion element")
    public void queIngresoALaSeccionElement() {

    }

    @Cuando("ingreso a la seccion TextBox")
    public void ingresoALaSeccionTextBox() {

    }

    @Y("completo el formulario {string} {string} {string} {string}")
    public void completoElFormulario(String arg0, String arg1, String arg2, String arg3) {

    }

    @Cuando("ingreso a la seccion ChexBox")
    public void ingresoALaSeccionChexBox() {

    }

    @Entonces("valido el nombre del {string}")
    public void validoElNombreDel(String arg0) {

    }

    @Cuando("ingreso a la seccion Radio")
    public void ingresoALaSeccionRadio() {

    }

    @Cuando("ingreso a la seccion Web Tables")
    public void ingresoALaSeccionWebTables() {

    }

    @Y("busca por el nombre {string}")
    public void buscaPorElNombre(String arg0) {

    }

    @Entonces("Se valida que encontro el nombre {string} en la tabla web tables")
    public void seValidaQueEncontroElNombreEnLaTablaWebTables(String arg0) {

    }

    @Y("elimino la primera fila encontrada")
    public void eliminoLaPrimeraFilaEncontrada() {

    }

    @Entonces("Se valida que aparece en Web Tables el mensaje {string}")
    public void seValidaQueApareceEnWebTablesElMensaje(String arg0) {

    }

    @Y("edito el nombre Cierra por {string}")
    public void editoElNombreCierraPor(String arg0) {

    }

    @Entonces("Se valida se edito el nombre {string} de manera correcta")
    public void seValidaSeEditoElNombreDeManeraCorrecta(String arg0) {

    }

    @Cuando("ingreso a la seccion Button")
    public void ingresoALaSeccionButton() {
    }
}
