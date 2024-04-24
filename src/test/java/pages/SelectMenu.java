package pages;

import actions.Click;
import actions.Escribir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectMenu {
    private final Click click;
    private final Escribir escribo;

    private final By btWidgeth = By.xpath("//h5[text()='Widgets']");
    private final By btSelecMen = By.xpath("//spaN[text()='Select Menu']");
    private final By btValue = By.xpath("(//*[@class=' css-1hwfws3'])[1]");
    private final By btSeleTipe = By.xpath("(//*[@class=' css-1hwfws3'])[2]");
    private final By btOption3 = By.xpath("//option[@value='2']");
    private final  By btDowm = By.xpath("//div[text()='Select...']");
    private final By btVolvo = By.xpath("//option[text()='Volvo']");



    public SelectMenu(WebDriver driver){
        this.click = new Click(driver);
        this.escribo = new Escribir(driver);
    }
    public void campoDownYvolvo(String n1) throws Exception {
        escribo.Escribir(btDowm,n1);
        click.Clickear(btVolvo);
    }
    public void option3() throws Exception {
        click.Clickear(btOption3);
    }
    public void meDirijoASelecMenu() throws Exception {
        click.Clickear(btWidgeth);
        click.Clickear(btSelecMen);
    }
    public void cargoDatos() throws Exception {
        click.Clickear(btValue);
    }
    public void escriboEnCampo(String n1,String n2) throws Exception {
        escribo.Escribir(btValue,n1);
        escribo.Escribir(btSeleTipe,n2);
    }

}
