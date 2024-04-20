package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.SelectablePage;

public class SelecTableSetep {
    WebDriver driver = WebDriverManager.getDriver();
    SelectablePage page = new SelectablePage(driver);

    @Y("voy a grit")
    public void voyAGrit() throws Exception {
        page.voiyAGrid();
    }

    @Y("cliqueo en todos los botones")
    public void cliqueoEnTodosLosBotones() throws Exception {
        page.clickInvertido();
    }

    @Y("voy a list y cliqueo todo")
    public void voyAListYCliqueoTodo() throws Exception {
        page.voiAList();
        page.clickearTodoList();
    }

    @Cuando("desmarco todos los botones de grit y list")
    public void desmarcoTodosLosBotonesDeGritYList() throws Exception {
        page.voiyAGrid();
        page.desclickGrid();
        page.voiAList();
        page.desckliquearList();
    }
}
