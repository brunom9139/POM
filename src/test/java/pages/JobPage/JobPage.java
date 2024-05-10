package pages.JobPage;

import actions.Click;
import actions.Escribir;
import actions.Texto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JobPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;

    public JobPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
    }
    private final By locator_button_job = By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[2]");
    private final By locator_button_job_titles = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]");
    private final By locator_button_add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    private final By locator_input_title = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_input_description = By.xpath("//textarea[@placeholder='Type description here']");
    private final By locator_input_note = By.xpath("//textarea[@placeholder='Add note']");
    private final By locator_button_save = By.xpath("//button[@type='submit']");
    private final By locator_label_validation_job_titles = By.xpath("//h6[text()='Job Titles']");


    private final By job = By.xpath("");


    public void clickEnJob() throws Exception {
        mouse.Clickear(locator_button_job);

    }
    public void cargarFormularioJobTitle(String titulo,String descripcion,String nota) throws Exception {
        mouse.Clickear(locator_button_job_titles);
        mouse.ClickearJs(locator_button_add);
        teclado.Escribir(locator_input_title,titulo);
        teclado.Escribir(locator_input_description,descripcion);
        teclado.Escribir(locator_input_note, nota);
        mouse.Clickear(locator_button_save);
    }

    public void validarJobCargado(String validacionjob) throws Exception {
        boolean validacion = texto.compararTextoIgual(locator_label_validation_job_titles,validacionjob);
        Assert.assertTrue(validacion);
    }

    public void asdasdasd()throws Exception {
        mouse.Clickear(locator_button_job);
        mouse.Clickear(locator_button_job_titles);
    }

}
