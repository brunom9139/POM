package pages.demoqa;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPageDemo {
    private final Texto texto;
    private final Click mouse;
    private final Acciones acciones;
    private final Escribir teclado;
    private final EsperarTiempo esperar_tiempo;

    public PrincipalPageDemo(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }
    private final By button_elementos = By.xpath("(//div[@class='card-up'])[1]");
    private final By button_formularios = By.xpath("(//div[@class='card-up'])[2]");
    private final By button_alertas = By.xpath("(//div[@class='card-up'])[3]");
    private final By button_widgets = By.xpath("(//div[@class='card-up'])[4]");
    private final By button_interacciones = By.xpath("(//div[@class='card-up'])[5]");
    private final By button_librerias = By.xpath("(//div[@class='card-up'])[6]");



    public void clickEnElementos() throws Exception {
        mouse.Clickear(button_elementos);
    }
    public void clickEnFormularios() throws Exception {
        mouse.Clickear(button_formularios);
    }
    public void clickEnAlertas() throws Exception {
        mouse.Clickear(button_alertas);
    }
    public void clickEnWidgets() throws Exception {
        mouse.Clickear(button_widgets);
    }
    public void clickEnInteracciones() throws Exception {
        mouse.Clickear(button_interacciones);
    }
    public void clickEnLibrerias() throws Exception {
        mouse.Clickear(button_librerias);
    }
}
