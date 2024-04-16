package pages.Griselda;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BotonesPageGri {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    //constructor
    public BotonesPageGri(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);

    }

    //selectores
    private final By boton_doble = By.id("doubleClickBtn");

    private final By TextoDobleClick = By.id("doubleClickMessage");


    //metodos

    public void hacerDobleClick(){
        acciones.hacerDobleClick(boton_doble);
    }

    public void verificarAccion(String txt){
        Assert.assertEquals(txt,"Has hecho un doble clic");
    }
}
