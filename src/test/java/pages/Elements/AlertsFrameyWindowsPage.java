package pages.Elements;

import actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFrameyWindowsPage {
    private final Click mouse;

    public AlertsFrameyWindowsPage(WebDriver driver){
        this.mouse = new Click(driver);
    }

    private final By locator_button_browser_Windows = By.xpath("//span[text()='Browser Windows']");
    private final By locator_button_alert = By.xpath("//span[text()='Alerts']");
    private final By locator_button_framen = By.xpath("//span[text()='Text Box']");
    public void clickBrowser() throws Exception {
        mouse.Clickear(locator_button_browser_Windows);
    }
    public void clickAler() throws Exception {
        mouse.Clickear(locator_button_alert);
    }
    public void clickFrame() throws Exception {
        mouse.Clickear(locator_button_framen);
    }
}
