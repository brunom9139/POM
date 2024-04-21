package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.BookPage;
import pages.HomePage;

public class BoockStep {
    WebDriver driver = WebDriverManager.getDriver();
    HomePage inicio = new HomePage(driver);
    BookPage page = new BookPage(driver);
    @Dado("que me dirijo a biblioteca")
    public void queMeDirijoABiblioteca() throws Exception {
        inicio.clickBook();
    }


    @Y("voy a login y trato de ingresar como {string} y contraseña {string}")
    public void voyALoginYTratoDeIngresarComoYContrasena(String arg0, String arg1) throws Exception {
        page.cargoForm(arg0,arg1);
    }


}
