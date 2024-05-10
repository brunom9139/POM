package steps.JobStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.Elements.*;
import pages.JobPage.JobPage;

public class JobSteps {


    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainsObj = new MainPage(driver);
    ElementsPage elementsObj = new ElementsPage(driver);
    TextBoxPage textBoxObj = new TextBoxPage(driver);
    CheckBoxPage checkBoxObj = new CheckBoxPage(driver);
    RadioPage radioObj = new RadioPage(driver);
    WebTablesPage webTables = new WebTablesPage(driver);
    ButtonPage buttonTables = new ButtonPage(driver);

    JobPage job_objeto = new JobPage(driver);
    @Y("ingreso en job")
    public void ingresoEnJob() throws Exception {
        job_objeto.clickEnJob();
    }

    @Y("ingreso en job titles y agrego un job {string} {string} {string}")
    public void ingresoEnJobTitlesYAgregoUnJob(String titulo, String descripcion, String nota) throws Exception {
        job_objeto.cargarFormularioJobTitle(titulo, descripcion, nota);
    }

    @Entonces("verifico el texto {string}")
    public void verificoElTexto(String validacion) throws Exception {
        job_objeto.validarJobCargado(validacion);
    }

    @Y("ingreso en job y a titles")
    public void ingresoEnJobYATitles() throws Exception {
        job_objeto.asdasdasd();
    }

}
