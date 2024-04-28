package pages;

import actions.Click;
import actions.Escribir;
import org.openqa.selenium.WebDriver;

public class FromPage {
    private final Click mause;
    private final Escribir escribir;

    public FromPage(WebDriver driver){
        this.mause = new Click(driver);
        this.escribir = new Escribir(driver);
    }
}
