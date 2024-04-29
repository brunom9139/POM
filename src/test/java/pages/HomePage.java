package pages;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    private final By boton_elementos = By.xpath("(//*[@class='category-cards']//div[@class='card-up'])[1]");
    private final By texto_validar_elements = By.xpath("//div[text()='Please select an item from left to start practice.']");
    private final By textovalidar = By.id("Ad.Plus-970x250-1");
    private final By inputsClicks = By.tagName("input");
    private final By butttonSeleniumOnlineTraining = By.xpath("//img[@alt='Selenium Online Traininasdasdg']");
    private final By bottonTutorial = By.xpath("//a[@class='navbar__tutorial-menu']");
    private final By btInteracciones = By.xpath("//*[contains(text(),'Interactions')]");
    private final By btSostenible = By.xpath("//*[contains(text(),'Sortable')]");
    private final By btSelecTable = By.xpath("//span[contains(text(),'Selectable')]");
    private final By btHome = By.xpath("//img[@src='/images/Toolsqa.jpg']");
    private final By btBook = By.xpath("//h5[text()='Book Store Application']");
    private final By btElements = By.xpath("//h5[text()='Elements']");
    private final By btForm = By.xpath("//h5[text()='Forms']");


    public HomePage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);
    }
    public void clickFrom() throws Exception {
        mouse.Clickear(btForm);
    }
    public void clickElements() throws Exception {
        mouse.Clickear(btElements);
    }

    public void clickBook() throws Exception {
        mouse.Clickear(btBook);
    }
    public void voyAlInicio() throws Exception {
        mouse.Clickear(btHome);
    }
    public void clickSelectable() throws Exception {
        mouse.Clickear(btInteracciones);
        mouse.Clickear(btSelecTable);
    }
    public void clickInteraccioesSostenibles() throws Exception {
        mouse.Clickear(btInteracciones);
        mouse.Clickear(btSostenible);
    }

    public void hacerClickEnElementos() throws Exception {
        mouse.Clickear(boton_elementos);
    }

    public void validarTexto(String texto_validar){
        boolean validar = texto.compararTexto(textovalidar, texto_validar);
        Assert.assertTrue(validar, STR."El texto \{texto_validar} no es igual");
    }

    public void clickVariosInputs(){
        mouse.hacerClickEnElementos(inputsClicks);
    }

    public void clickJoinNow() throws Exception {
        mouse.Clickear(butttonSeleniumOnlineTraining);
    }

    public void cambiarUltimaVentana(){
        ventana.cambiarVentana();
    }

    public void clickTutorial() throws Exception {
        mouse.Clickear(bottonTutorial);
    }

    public void volverVentanaPrincipal(){
        ventana.volverVentanaPrincipal();
    }


}