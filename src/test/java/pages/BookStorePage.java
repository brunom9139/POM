package pages;

import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStorePage {
    private final Escribir escribir;
    private final Click click;
    private final By btBookInicio = By.xpath("//h5[text()='Book Store Application']");
    private final By btBook = By.xpath("//span[text()='Book Store']");
    private final By btSelector = By.xpath("//select[@aria-label='rows per page']");
    private final By btpor5 = By.xpath("//option[text()='5 rows']");
    private final By btpor10 = By.xpath("//option[text()='10 rows']");
    private final By btpor20 = By.xpath("//option[text()='20 rows']");
    private final By btpor25 = By.xpath("//option[text()='25 rows']");
    private final By btpor50 = By.xpath("//option[text()='50 rows']");
    private final By btpor100 = By.xpath("//option[text()='100 rows']");





    public final By busca = By.xpath("//input[@id='searchBox']");
    private final By btBuscar = By.xpath("//span[@id='basic-addon2']");


    public BookStorePage(WebDriver driver){
        this.click = new Click(driver);
        this.escribir = new Escribir(driver);
    }
    public void buscoBook(String arg) throws Exception {
        escribir.Escribir(busca,arg);
        click.Clickear(btBuscar);
    }
    public void voyaStore() throws Exception {
        click.Clickear(btBookInicio);
        click.Clickear(btBook);
    }
    public void seleccionoFilas() throws Exception {
        click.Clickear(btSelector);
        click.Clickear(btpor5);
        click.Clickear(btSelector);
        click.Clickear(btpor10);
        click.Clickear(btSelector);
        click.Clickear(btpor20);
        click.Clickear(btSelector);
        click.Clickear(btpor25);
        click.Clickear(btSelector);
        click.Clickear(btpor50);
        click.Clickear(btSelector);
        click.Clickear(btpor100);

    }


}
