package pages.Griselda;

import actions.Acciones;
import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPageG {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;


    //constructor
    public ElementsPageG(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);

    }

    //selectores
    private final By boton_text_box = By.id("item-0");
    private final By boton_check_box = By.id("item-1");
    //METODOS
    public void hacerClickEnCheckBox(){
        mouse.hacerClickEnElementos(boton_check_box);
    }

}
