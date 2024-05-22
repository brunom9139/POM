package steps.jobStep;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.elements.*;
import pages.jobPage.JobPage;

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

    @Cuando("voy a job title")
    public void voyAJobTitle() throws Exception {
        job_objeto.clickJobTitle();
    }

    @Entonces("compruebo la coincidencia de los Job Description y Records Found")
    public void comprueboLaCoincidenciaDeLosJobDescriptionYRecordsFound() throws Exception {
        job_objeto.cantidadJobDescription();
    }

    @Cuando("voy a job title y hago clicks en la lista de Jab Titles")
    public void voyAJobTitleYHagoClicksEnLaListaDeJabTitles() throws Exception {
        job_objeto.clickTodosLosChecks();
    }

    @Cuando("voy a job paygrades")
    public void voyAJobPaygrades() throws Exception {
        job_objeto.clickEnPayGrades();
    }

    @Y("edito todos los registros de paygrades")
    public void editoTodosLosRegistrosDePaygrades() throws Exception {
        job_objeto.editarRegistrosPayGrades();
    }

    @Entonces("agrego un nuevo paygrade")
    public void agregoUnNuevoPaygrade() throws Exception {
        job_objeto.clickEnAgregarPayGrade();
    }

    @Y("voy a Employment Status")
    public void voyAEmploymentStatus() throws Exception {
        job_objeto.clickEnEmployment();
    }

    @Entonces("elimino primer estado de empleo")
    public void eliminoPrimerEstadoDeEmpleo() throws Exception {
        job_objeto.clickEnBorrarPrimerEstado();
    }

    @Y("voy a Job Categories")
    public void voyAJobCategories() throws Exception {
        job_objeto.clickEnJobCategories();
    }

    @Entonces("borro todas las categorias")//borrar todos hacer uno solo paso
    public void borroTodasLasCategorias() throws Exception {
        job_objeto.tildarTodos();
        job_objeto.clickEnDeletSelected();
    }



    @Entonces("agrego un nuevo titulo")
    public void agregoUnNuevoTitulo() throws Exception {
        job_objeto.clickEnAgregarTitle();
    }

    @Entonces("borro la posicion")
    public void borroLaPosicion() {

    }

    @Entonces("edito todos los paygrades")
    public void editoTodosLosPaygrades() throws Exception {
        job_objeto.editarRegistrosPayGrades();
    }

    @Entonces("borro todos los titulos de job")
    public void borroTodosLosTitulosDeJob() throws Exception {
        job_objeto.tildarTodos();
        job_objeto.clickEnDeletSelected();
    }

    @Entonces("borro todos los paygrades de job")
    public void borroTodosLosPaygradesDeJob() throws Exception {
        job_objeto.tildarTodos();
        job_objeto.clickEnDeletSelected();
    }

    @Entonces("agrego estado de empleo {string}")
    public void agregoEstadoDeEmpleo(String estado) throws Exception {
        job_objeto.clickEnAgregarEstado(estado);
    }

    @Entonces("verifico que aparezca en la lista {string}")
    public void verificoQueAparezcaEnLaLista(String estado_agregado) {
    }

    @Entonces("ordenar en forma descendente")
    public void clickEnOrdenarEnFormaDescendente() throws Exception {
        job_objeto.ordenarDesscendentemente();
    }

    @Entonces("ordenar en forma ascendente")
    public void clickEnOrdenarEnFormaAscendente() throws Exception {
        job_objeto.ordenarAscendentemente();
    }

    @Entonces("borro la posicion que contiene {string}")
    public void borroLaPosicionQueContiene(String texto_A_Borrar) throws Exception {
        job_objeto.borrarPosicionDeseada(texto_A_Borrar);
    }


    @Entonces("edito todos los estados a null")
    public void editoTodosLosEstadosANull() {
        job_objeto.editarEstadosANull();
    }

    @Y("voy a Work Shifts")
    public void voyAWorkShifts() throws Exception {
        job_objeto.clickEnWorkShifts();
    }

    @Entonces("edito todos los horarios de trabajo a turno noche de {string} a {string}")
    public void editoTodosLosHorariosDeTrabajoATurnoNocheDeA(String horario_inicio, String horario_fin) {
        job_objeto.editarHorariosDeTrabajoANoche(horario_inicio,horario_fin);
    }


}