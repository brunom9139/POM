package steps.Formularios;

import actions.Acciones;
import factory.WebDriverManager;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.BookStorePage;

public class BookStoryStep {
    WebDriver driver = WebDriverManager.getDriver();
    BookStorePage page = new BookStorePage(driver);
    @Dado("que me dirijo a book store")
    public void queMeDirijoABookStore() throws Exception {
        page.voyaStore();
    }

    @Y("amplio las filas de mayor a menor")
    public void amplioLasFilasDeMayorAMenor() throws Exception {
        page.seleccionoFilas();
    }
    @Y("luego busco en la biblioteca el libro {string}")
    public void luegoBuscoEnLaBibliotecaElLibro(String arg0) throws Exception {
        page.buscoBook(arg0);
    }
}
