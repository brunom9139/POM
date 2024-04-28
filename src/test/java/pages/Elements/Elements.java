package pages.Elements;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
    private final Click mouse;

    public Elements(WebDriver driver){
        this.mouse = new Click(driver);
    }

    private final By locator_button_checkBox = By.xpath("//li[@id='item-1']/span");
    private final By locator_button_radio = By.xpath("//li[@id='item-2']/span");
    private final By locator_button_textBox = By.xpath("//li[@id='item-0']/span");
    private final By locator_button_webTables = By.xpath("//li[@id='item-3']/span");

    public void clickTextBox() throws Exception {
        mouse.Clickear(locator_button_textBox);
    }
    public void clickRadio() throws Exception {
        mouse.Clickear(locator_button_radio);
    }

    public void clickCheckBox() throws Exception {
        mouse.Clickear(locator_button_checkBox);
    }

    public void clickWebTables() throws Exception {
        mouse.Clickear(locator_button_webTables);
    }

}
