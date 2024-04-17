package pages.Griselda;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CajaTextoPageG {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    //constructor
    public CajaTextoPageG(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);

    }
    //..selectores
    private  final By caja = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
    private final By nom_completo = By.id("userName");
    private final By email = By.id("userEmail");
    private final By direccion = By.id("currentAddress");
    private final By dir_verificacion = By.id("permanentAddress");
    private final By boton_entregar = By.xpath("//font[contains(text(),'Entregar')]");

    //..modulos
    public void IngresarACajaDeTexto() throws Exception {
        mouse.Clickear(caja);
    }
    public void CompletarCampos() throws Exception {
        teclado.Escribir(nom_completo,"GRI MEDRANO");
        teclado.Escribir(email,"hfghj@gmail.com");
        teclado.Escribir(direccion,"PASAJE PRIMERO DE MAYO");
        teclado.Escribir(dir_verificacion,"PASAJE PRIMERO DE MAYO");

    }
    public void hacerEntrega() throws Exception {
        mouse.Clickear(boton_entregar);
    }
}
