package pages.Griselda;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormPracticePageG {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    //constructor
    public FormPracticePageG(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);

    }
    //SELECTORES

    private final By nombre = By.xpath("//input[@id='firstName']");
    private final By apellido = By.xpath("//input[@id='lastName']");
    private final By correo = By.xpath("//input[@id='userEmail']");
    private final By genero = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]");
    private final By movil = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]");
    private final By fecha_nac = By.xpath("//input[@id='dateOfBirthInput']");
    private final By asignaturas = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]");
    private final By aficiones = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]");
    private final By imagen = By.id("uploadPicture");
    private final By direccion = By.id("currentAddress");
    private final By estado = By.id("currentAddress");
    private final By estado_seleccion = By.xpath("//div[@class=' css-1uccc91-singleValue']");
    private final By ciudad = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]");
    private final By ciudad_seleccionada = By.xpath("");
    private final By btn_entregar = By.id("submit");
    //METODOS

    public void completarFormulario() throws Exception{
       // mouse.Clickear(nombre);
        teclado.Escribir(nombre,"griselda");
        teclado.Escribir(apellido,"medrano");
        teclado.Escribir(correo,"gri@gmail.com");
        mouse.Clickear(genero);
        teclado.Escribir(movil,"364463565");
        //faltafecha
        teclado.Escribir(asignaturas,"matematicas");
        mouse.Clickear(aficiones);
        //faltaimagen
       // teclado.Escribir(direccion,"alderetes");
        //falta estado y ciudad
    }
    public void entregar()throws Exception{
        mouse.Clickear(btn_entregar);

    }
}

