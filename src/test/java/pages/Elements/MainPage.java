package pages.Elements;

import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final Click mouse;

    public MainPage(WebDriver driver){
        this.mouse = new Click(driver);
    }

    private final By locator_button_elements = By.cssSelector(".card:nth-child(1) svg");

    public void clickElements() throws Exception {
        mouse.Clickear(locator_button_elements);
    }
}
