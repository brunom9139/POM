package pages.Griselda;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPageG {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    //constructor
    public FormPageG(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);

    }

    //SELECTORES
    private final By btn_form_practica = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");

     //metodos

    public void ingresarAFormularioPractica() throws Exception{
        mouse.Clickear(btn_form_practica);

    }
}
