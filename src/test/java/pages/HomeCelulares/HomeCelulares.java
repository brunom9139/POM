package pages.HomeCelulares;

import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeCelulares {
    private final Click mouse;
    private final By locator_celulares = By.xpath("//h4[@class='card-title']");

    public HomeCelulares(WebDriver driver){
        this.mouse = new Click(driver);
    }
    public void buscoCelular(){

    }
}
