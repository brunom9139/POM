package pages.elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TextBoxPage {
    private final Click mouse;
    private final Escribir teclado;
    private final Texto texto;

    public TextBoxPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.texto = new Texto(driver);
    }

    private final By locator_input_fullName = By.id("userName");
    private final By locator_input_email = By.id("userEmail");
    private final By locator_input_address1 = By.id("currentAddress");
    private final By locator_input_address2 = By.id("permanentAddress");
    private final By locator_button_subtmit_form_text_box = By.id("submit");
    private final By locator_label_name_validar_carga_formulario = By.xpath("//div[@id='output']//p[1]");

    public void completarFormularioTextBox(String fullName,String email, String address1,String address2) throws Exception {
        teclado.Escribir(locator_input_fullName,fullName);
        teclado.Escribir(locator_input_email,email);
        teclado.Escribir(locator_input_address1,address1);
        teclado.Escribir(locator_input_address2,address2);
        mouse.Clickear(locator_button_subtmit_form_text_box);
    }

    public void validarCargaFormularioTextBoxElements(String fullName)throws Exception {
        boolean validacion = texto.compararTextoContiene(locator_label_name_validar_carga_formulario,fullName);
        Assert.assertTrue(validacion);
    }

}
