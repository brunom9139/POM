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
    private final By Pname = By.xpath("//input[@id='firstname']");
    private final By Sname = By.xpath("//input[@id='lastname']");
    private final By Uname = By.xpath("//input[@id='userName']");
    private final By Ccontra = By.xpath("//input[@id='password']");
    private final By noRobot = By.xpath("//*[@id='recaptcha-anchor']");
    private final By btRegistrarse = By.xpath("//button[@id='register']");
    private final By inicio = By.xpath("//img[@src='/images/Toolsqa.jpg']");



    public BookPage(WebDriver driver){
        this.mouse = new Click(driver);
        this.escribir = new Escribir(driver);
    }
    public void cierroTodo() throws Exception {
        mouse.Clickear(inicio);
    }
    public void meRegistro() throws Exception {
        mouse.Clickear(btRegistrarse);
    }
    public void meRegistro(String n1,String n2,String n3,String n4) throws Exception {
        escribir.Escribir(Pname,n1);
        escribir.Escribir(Sname,n2);
        escribir.Escribir(Uname,n3);
        escribir.Escribir(Ccontra,n4);

    }
    public void botonLogueo() throws Exception {
        mouse.Clickear(btLoginMenu);
    }
    public void clickNewLog() throws Exception {
        mouse.Clickear(btNewLog);
    }
    public void clickLogin() throws Exception {
        mouse.Clickear(btLog);
    }
    public void cargoForm(String n1,String n2) throws Exception {
        escribir.Escribir(btNombre,n1);
        escribir.Escribir(btContra,n2);

    }


}
