package pages;

import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage {
    private final Click mouse;
    private final Escribir escribir;
    private final By btLoginMenu = By.xpath("//span[text()='Login']");
    private final By btNombre = By.xpath("//input[@id='userName']");
    private final By btContra = By.xpath("//input[@id='password']");
    private final By btLog = By.xpath("//button[@id='login']");
    private final By btNewLog = By.xpath("//button[@id='newUser']");


    public BookPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.escribir = new Escribir(driver);
    }
    public void clickLogin() throws Exception {
        mouse.Clickear(btLoginMenu);
    }
    public void cargoForm(String n1,String n2) throws Exception {
        escribir.Escribir(btNombre,n1);
        escribir.Escribir(btContra,n2);
        mouse.Clickear(btLog);
    }


}
