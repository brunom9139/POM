package pages.Griselda;


import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeGriPage {
    //variables privadas
    private final Click mouse;
    private final Escribir teclado;
    private final Acciones acciones;
    private final Texto texto;
    private final CambioVentana ventana;


    //constructor
    public HomeGriPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.texto = new Texto(driver);
        this.ventana = new CambioVentana(driver);

    }

    //selectores

    private final By logoPrincipal = By.xpath("//header/a[1]/img[1]");
    private final By banner = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]");
    private final By zona_elementos = By.xpath("//div[@class='category-cards']");
    private final By elementos = By.xpath("//div[@class='category-cards']/div[1]//div[@class='card-up']");
    private final By elm = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    private final By forms = By.xpath("(//div[@class='card mt-4 top-card'])[2]");
    private final By alert = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    private final By widgets = By.xpath("(//div[@class='card mt-4 top-card'])[4]");
    private final By interactions = By.xpath("(//div[@class='card mt-4 top-card'])[5]");
    private final By book = By.xpath("(//div[@class='card mt-4 top-card'])[6]");


    public void ingresarEnElementos() throws Exception {
        mouse.Clickear(elementos);
    }
    public void ingresarEnForms() throws Exception{
        mouse.Clickear(forms);

    }

}
