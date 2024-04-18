package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.SosteniblePages;

public class SortableStep {
    WebDriver driver = WebDriverManager.getDriver();
    SosteniblePages page = new  SosteniblePages(driver);
    @Y("clickeo los botones de list")
    public void clickeoLosBotonesDeList() throws Exception {
        page.clickEnTodosDeLaLista();
    }

    @Y("los de tablas tambien")
    public void losDeTablasTambien() throws Exception {
        page.clickBotonesDeTabla();
    }

    @Entonces("Vuelvo a list")
    public void vuelvoAList() throws Exception {
        page.clickList();
    }


    @Y("arratro one a la ultima posicion")
    public void arratroOneALaUltimaPosicion() throws Exception {
        page.moverElemento(page.oneL,page.sixL);
    }

    @Y("el nine a la primera posicion")
    public void elNineALaPrimeraPosicion() throws Exception {
        page.moverElemento(page.fiveL,page.oneL);
    }
}
