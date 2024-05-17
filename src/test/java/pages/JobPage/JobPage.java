package pages.JobPage;

import actions.*;
import factory.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.CadenaCaracteres;

import java.util.List;

public class JobPage {
    private final Escribir teclado;
    private final Click mouse;
    private final Texto texto;
    private final Acciones accion;

    CadenaCaracteres cadena = new CadenaCaracteres();

    public JobPage(WebDriver driver){
        this.teclado = new Escribir(driver);
        this.mouse = new Click(driver);
        this.texto = new Texto(driver);
        this.accion = new Acciones(driver);
    }
    private final By locator_button_job = By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[2]");
    private final By locator_button_job_titles = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]");
    private final By locator_button_Employment_Status = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[3]");
    private final By locator_button_Job_Categories = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[4]");
    private final By locator_button_Work_Shifts = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[5]");

    private final By localizarEncabezado = By.xpath("//div[@class='orangehrm-header-container']");
    private final By locator_button_add = By.xpath("//button[text()=' Add ']");
    private final By locator_input_title = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_input_description = By.xpath("//textarea[@placeholder='Type description here']");
    private final By locator_input_note = By.xpath("//textarea[@placeholder='Add note']");
    private final By locator_input_name= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By locator_button_save = By.xpath("//button[@type='submit']");
    private final By locator_label_validation_job_titles = By.xpath("//h6[text()='Job Titles']");
    private final By locator_jod_description = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']");
    private final By locator_text_record_found = By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]");
    private final By locator_de_los_ckecks = By.xpath("//div[@class='oxd-table-card-cell-checkbox']");
    private final By locator_button_pay_grade = By.xpath("//a[text()='Pay Grades']");
    private final By localizadorLapices = By.xpath("//div[@class='oxd-table-cell-actions']/button[2]");
    private final By localizadorNombreClick = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By localizadorNombreFinal = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By localizadorGuardo = By.xpath("//button[@type='submit']");
    private final By localizadorCancelar = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");

    private final By localizadorActions = By.xpath("(//div[@role='columnheader'])[3]");
    private final By locator_button_delete_one = By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']");
    private final By locator_button_yes_delete = By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']");
    private final By locator_checkbox_todos = By.xpath("(//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]");
    private final By locator_delete_selected = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']");

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
    public void clickJobTitle() throws Exception {
        mouse.Clickear(locator_button_job_titles);
    }
    public void clickEnEmployment() throws Exception {
        mouse.Clickear(locator_button_Employment_Status);
    }
    public void clickEnJobCataegories() throws Exception {
        mouse.Clickear(locator_button_Job_Categories);
    }
    public void clickEnWork_Shifts() throws Exception {
        mouse.Clickear(locator_button_Work_Shifts);
    }

    public void cantidadJobDescription() throws Exception {
        int totalJobDescription = texto.cantidadElementos(locator_jod_description);
        boolean validar = texto.compararTextoContiene(locator_text_record_found, String.valueOf(totalJobDescription));
        Assert.assertTrue(validar);
    }
    public void clickTodosLosChecks() throws Exception {
        mouse.hacerClickEnElementos(locator_de_los_ckecks);
    }
    public void clickEnPayGrades() throws Exception {
        mouse.Clickear(locator_button_pay_grade);
    }
    public void editarRegistrosPayGrades() throws Exception {
        try {
            List<WebElement> elementosLapiz = Session.getInstance().getWebDriver().findElements(localizadorLapices);
            for (int i = 1; i <= elementosLapiz.size(); i++) {
                WebElement elemento_lapiz = Session.getInstance().getWebDriver().findElement(By.xpath("(//div[@class='oxd-table-cell-actions']/button[2])["+i+"]"));
                accion.hacerScroll(elemento_lapiz);
                elemento_lapiz.click();

                String texto = cadena.generarStringAlfanumericoAleatorio(10);
                mouse.Clickear(localizadorNombreClick);
                teclado.Escribir(localizadorNombreFinal,texto);

                mouse.Clickear(localizadorGuardo);
                mouse.Clickear(localizadorCancelar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hacerScrollEncabezado(){
        accion.hacerScroll(localizarEncabezado);
    }

    public void clickEnAgregarPayGrade() throws Exception {
        //hacerScrollEncabezado();
        accion.hacerScroll(locator_button_add);
         mouse.Clickear(locator_button_add);
        teclado.Escribir(locator_input_name,"Griselda");
        mouse.Clickear(locator_button_save);
    }

    public void clickEnJobCategories() throws Exception {
        mouse.Clickear(locator_button_Job_Categories);
    }

    public void clickEnWorkShifts() throws Exception {
        mouse.Clickear(locator_button_Work_Shifts);
    }

    public void clickEnBorrarPrimerEstado() throws Exception {
        //tuve problemas para que lo encuentre al primero
      // accion.hacerScroll(localizadorActions);
        mouse.Clickear(locator_button_delete_one);
        mouse.Clickear(locator_button_yes_delete);
    }

    public void tildarTodasCategorias() throws Exception {
       // mouse.Clickear(locator_checkbox_todos);
        //mouse.ClickearJs(locator_checkbox_todos);
        mouse.hacerClickEnElementos(locator_checkbox_todos);
    }

    public void clickEnDeletSelected() throws Exception {
        mouse.Clickear(locator_delete_selected);
    }

}