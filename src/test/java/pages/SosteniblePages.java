package pages;

import actions.ArrastrarSoltar;
import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SosteniblePages {
    private final Click click;
    private final ArrastrarSoltar muevo;
    public final By oneL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]");
    private final By twoL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[2]");
    private final By trheeL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[3]");
    private  final By fourL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[4]");
    public final By fiveL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[5]");
    public final By sixL = By.xpath("(//div[@class='list-group-item list-group-item-action'])[6]");
    private final By btGrit = By.xpath("//a[@id='demo-tab-grid']");
    private final By oneT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[7]");
    private final By twoT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[8]");
    private final By treeT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[9]");
    private final By fourT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[10]");
    private final By fiveT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[11]");
    private final By sixT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[12]");
    private final By sevenT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[13]");
    private final By eightT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[14]");
    private final By nineT = By.xpath("(//div[@class='list-group-item list-group-item-action'])[15]");
    private final By btList = By.xpath("//*[@id='demo-tab-list']");

    public SosteniblePages(WebDriver driver){

        this.click = new Click(driver);
        this.muevo = new ArrastrarSoltar(driver);

    }
    public void clickEnTodosDeLaLista() throws Exception {
        click.Clickear(oneL);
        click.Clickear(twoL);
        click.Clickear(trheeL);
        click.Clickear(fourL);
        click.Clickear(fiveL);
        click.Clickear(sixL);

    }
    public void clickTabla() throws Exception {
        click.Clickear(btGrit);
    }
    public void clickBotonesDeTabla() throws Exception {
        clickTabla();
        click.Clickear(oneT);
        click.Clickear(twoT);
        click.Clickear(treeT);
        click.Clickear(fourT);
        click.Clickear(fiveT);
        click.Clickear(sixT);
        click.Clickear(sevenT);
        click.Clickear(eightT);
        click.Clickear(nineT);
    }
    public void clickList() throws Exception {
        click.Clickear(btList);
    }
    public void moverElemento(By uno,By dos) throws Exception {
        muevo.arrastrarYSoltar(uno,dos);
    }
}
