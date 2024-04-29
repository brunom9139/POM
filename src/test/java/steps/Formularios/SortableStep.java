package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.SosteniblePages;

public class SortableStep {
    WebDriver driver = WebDriverManager.getDriver();
    SosteniblePages page = new  SosteniblePages(driver);

    @Entonces("Vuelvo a list")
    public void vuelvoAList() throws Exception {
        page.clickList();
    }
    @Y("cliqueo todo los botones de lista y tabla")
    public void cliqueoTodoLosBotonesDeListaYTabla() throws Exception {
        page.clickEnTodosDeLaLista();
        page.clickBotonesDeTabla();
    }

    @Y("en lista arratro one a la ultima posicion y nine a la primera posicion")
    public void enListaArratroOneALaUltimaPosicionYNineALaPrimeraPosicion() throws Exception {
        page.clickList();
        page.moverElemento(page.oneL,page.sixL);
        page.moverElemento(page.fiveL,page.oneL);
    }
    @Dado("que ingreso a widge")
    public void queIngresoAWidge() {
    }
    @Dado("que ingreso SorTable")
    public void queIngresoSorTable() throws Exception {
        page.voyASortable();
    }
}
