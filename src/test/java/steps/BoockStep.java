package steps.Formularios;

import factory.WebDriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import pages.BookPage;

public class BoockStep {
    WebDriver driver = WebDriverManager.getDriver();
    BookPage page = new BookPage(driver);
    @Dado("que me dirijo a biblioteca")
    public void queMeDirijoABiblioteca() throws Exception {
    }
    @Y("voy a login y trato de ingresar como {string} y contraseña {string}")
    public void voyALoginYTratoDeIngresarComoYContrasena(String usuario, String contrasenia) throws Exception {
        page.botonLogueo();
        page.cargoForm(usuario,contrasenia);
    }


    @Cuando("trato de ingresar y no ingresa entonces voy a registrarme")
    public void tratoDeIngresarYNoIngresaEntoncesVoyARegistrarme() throws Exception {
        page.clickLogin();
        page.clickNewLog();
    }
    @Y("cargo mis datos como {string} {string} {string} contraseña {string}")
    public void cargoMisDatosComoContrasena(String arg0, String arg1, String arg2, String arg3) throws Exception {
        page.meRegistro(arg0,arg1,arg2,arg3);
    }

    @Entonces("me registre y vuelvo al inicio")
    public void meRegistreYVuelvoAlInicio() throws Exception {
        page.meRegistro();
        page.cierroTodo();
    }

    @Entonces("cierro todo y vuelvo a inicio")
    public void cierroTodoYVuelvoAInicio() throws Exception {
        page.cierroTodo();
    }
}
