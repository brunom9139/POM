package pages.Elements;

import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
    private final Click mouse;

    public Main(WebDriver driver){
        this.mouse = new Click(driver);
    }

    private final By locator_button_elements = By.cssSelector(".card:nth-child(1) svg");
    private final By locator_button_alert = By.xpath("//h5[text()='Alerts, Frame & Windows']");


    public void clickAlertFrameWindows() throws Exception {
        mouse.Clickear(locator_button_alert);
    }
    public void clickElements() throws Exception {
        mouse.Clickear(locator_button_elements);
    }

}
