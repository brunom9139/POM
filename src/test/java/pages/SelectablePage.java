package pages;

import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectablePage {
    private final Click mouse;
    private final By btGrid = By.xpath("//a[@id='demo-tab-grid']");
    private final By btOne = By.xpath("(//li[@class='list-group-item list-group-item-action'])[1]");
    private final By btTwo = By.xpath("(//li[@class='list-group-item list-group-item-action'])[2]");
    private final By btThree =  By.xpath("(//li[@class='list-group-item list-group-item-action'])[3]");
    private final By btFour = By.xpath("(//li[@class='list-group-item list-group-item-action'])[4]");
    private final By btFive = By.xpath("(//li[@class='list-group-item list-group-item-action'])[5]");
    private final By btSix = By.xpath("(//li[@class='list-group-item list-group-item-action'])[6]");
    private final By btSeven =By.xpath("(//li[@class='list-group-item list-group-item-action'])[7]");
    private final By btEight = By.xpath("(//li[@class='list-group-item list-group-item-action'])[8]");
    private  final By btNine = By.xpath("(//li[@class='list-group-item list-group-item-action'])[9]");
    private final By btList = By.xpath("//a[@id='demo-tab-list']");
    private final By one = By.xpath("//li[contains(text(),'Cras justo odio')]");
    private final By two = By.xpath("//li[contains(text(),'Dapibus ac facilisis in')]");
    private final By three = By.xpath("//li[contains(text(),'Morbi leo risus')]");
    private final By four = By.xpath("//li[contains(text(),'Porta ac consectetur ac')]");
    private final By oneC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[1]");
    private final By twoC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[2]");
    private final By threeC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[3]");
    private final By fourC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[4]");
    private final By fiveC  =  By.xpath("(//li[@class='list-group-item active list-group-item-action'])[5]");
    private final By sixeC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[6]");
    private final By sevenC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[7]");
    private final By eightC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[8]");
    private final By nineC = By.xpath("(//li[@class='list-group-item active list-group-item-action'])[9]");
    private final By a = By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[1]");
    private final By e = By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[2]");
    private final By i = By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[3]");
    private final By o = By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[4]");

    public SelectablePage(WebDriver driver){
        this.mouse = new Click(driver);
    }
    public void voiyAGrid() throws Exception {
        mouse.Clickear(btGrid);
    }
    public void clickInvertido() throws Exception {
        mouse.Clickear(btNine);
        mouse.Clickear(btEight);
        mouse.Clickear(btSeven);
        mouse.Clickear(btSix);
        mouse.Clickear(btFive);
        mouse.Clickear(btFour);
        mouse.Clickear(btThree);
        mouse.Clickear(btTwo);
        mouse.Clickear(btOne);
    }
    public void voiAList() throws Exception {
        mouse.Clickear(btList);
    }
    public void clickearTodoList() throws Exception {
        mouse.Clickear(one);
        mouse.Clickear(two);
        mouse.Clickear(three);
        mouse.Clickear(four);
    }

    public void desckliquearList() throws Exception {
        mouse.Clickear(a);
        mouse.Clickear(e);
        mouse.Clickear(i);
        mouse.Clickear(o);
    }
    public void desclickGrid() throws Exception {
        mouse.Clickear(oneC);
        mouse.Clickear(twoC);
        mouse.Clickear(threeC);
        mouse.Clickear(fourC);
        mouse.Clickear(fiveC);
        mouse.Clickear(sixeC);
        mouse.Clickear(sevenC);
        mouse.Clickear(eightC);
        mouse.Clickear(nineC);

    }

}
