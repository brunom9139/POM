package pages.Griselda;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxPageG {
    private Click mouse;
    private Escribir teclado;
    private Acciones acciones;

    public CheckBoxPageG(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
    }

    private final By casilla = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]");

    public void TildarTodos(){

        mouse.hacerClickEnElementos(casilla);
    }
    public void validarSeleccion(String txt){

        Assert.assertEquals(txt,"You have selected :");
    }
}
