package pages.demoqa;

import actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPageDemo {
    private final Texto texto;
    private final Click mouse;
    private final Acciones acciones;
    private final Escribir teclado;
    private final EsperarTiempo esperar_tiempo;

    public ElementsPageDemo(WebDriver driver){
        this.texto = new Texto(driver);
        this.mouse = new Click(driver);
        this.teclado = new Escribir(driver);
        this.acciones = new Acciones(driver);
        this.esperar_tiempo = new EsperarTiempo();

    }

    private final By button_text_box = By.xpath("//li[@id='item-0']");
    private final By button_check_box = By.xpath("//li[@id='item-1']");
    private final By button_radio_button = By.xpath("//li[@id='item-2']");
    private final By button_web_tables = By.xpath("//li[@id='item-3']");
    private final By button_buttons = By.xpath("//li[@id='item-4']");
    private final By button_links = By.xpath("//li[@id='item-5']");
    private final By button_broken_links = By.xpath("//li[@id='item-6']");
    private final By button_upload = By.xpath("//li[@id='item-7']");
    private final By button_dinamic = By.xpath("//li[@id='item-8']");
    private final By elements = By.xpath("(//div[@class='header-wrapper'])[1]");
    private final By flecha_abajo_elements = By.xpath("(//div[@class='icon'])[1]");
    private final By forms = By.xpath("(//div[@class='header-wrapper'])[2]");
    private final By flecha_abajo_forms = By.xpath("(//div[@class='icon'])[2]");
    private final By alert = By.xpath("(//div[@class='header-wrapper'])[3]");
    private final By flecha_abajo_alert = By.xpath("(//div[@class='icon'])[3]");
    private final By widgets = By.xpath("(//div[@class='header-wrapper'])[4]");
    private final By flecha_abajo_widgets = By.xpath("(//div[@class='icon'])[4]");
    private final By iteracciones = By.xpath("(//div[@class='header-wrapper'])[5]");
    private final By flecha_abajo_interacciones = By.xpath("(//div[@class='icon'])[5]");
    private final By book = By.xpath("(//div[@class='header-wrapper'])[6]");
    private final By flecha_abajo_book = By.xpath("(//div[@class='icon'])[6]");

//selectores de textboxpage
    private final By input_full_name = By.xpath("//*[@id='userName']");
    private final By input_email = By.xpath("//*[@id='userEmail']");
    private final By input_address_one = By.xpath("//*[@id='currentAddress']");
    private final By input_address_two = By.xpath("//*[@id='permanentAddress']");
    private final By button_submit = By.xpath("//*[@id='submit']");

    //selectores de check box
    private final By button_mas = By.xpath("//button[@title='Expand all']");
    private final By button_menos = By.xpath("//button[@title='Collapse all']");
    private final By icono_flecha_home  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[1]");
    private final By button_check_home = By.xpath("(//span[@class='rct-checkbox'])[1]");
    private final By button_check_desktop = By.xpath("(//span[@class='rct-checkbox'])[2]");
    private final By icono_flecha_desktop  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]");
    private final By button_check_notes = By.xpath("(//span[@class='rct-checkbox'])[3]");
    private final By button_check_commands = By.xpath("(//span[@class='rct-checkbox'])[4]");
    private final By button_check_documents = By.xpath("(//span[@class='rct-checkbox'])[5]");
    private final By icono_flecha_documents  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]");
    private final By button_check_workspace = By.xpath("(//span[@class='rct-checkbox'])[6]");
    private final By icono_flecha_workspace  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[4]");
    private final By button_check_react = By.xpath("(//span[@class='rct-checkbox'])[7]");
    private final By button_check_angular = By.xpath("(//span[@class='rct-checkbox'])[6]");
    private final By button_check_veu = By.xpath("(//span[@class='rct-checkbox'])[7]");
    private final By button_check_office = By.xpath("(//span[@class='rct-checkbox'])[10]");
    private final By icono_flecha_office  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[5]");
    private final By button_check_public = By.xpath("(//span[@class='rct-checkbox'])[11]");
    private final By button_check_private = By.xpath("(//span[@class='rct-checkbox'])[12]");
    private final By button_check_classified = By.xpath("(//span[@class='rct-checkbox'])[13]");
    private final By button_check_general = By.xpath("(//span[@class='rct-checkbox'])[14]");
    private final By button_check_downloads = By.xpath("(//span[@class='rct-checkbox'])[15]");
    private final By icono_flecha_downloads  = By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[6]");
    private final By button_check_word = By.xpath("(//span[@class='rct-checkbox'])[16]");
    private final By button_check_excel = By.xpath("(//span[@class='rct-checkbox'])[17]");


public void clickEnElements() throws Exception {
    mouse.Clickear(elements);
}
public void clickEnForms() throws Exception {
    mouse.Clickear(forms);
}
public void clickEnAlerts() throws Exception {
    mouse.Clickear(alert);
}
public void clickEnWidgets() throws Exception {
    mouse.Clickear(widgets);
}
public void clickEnInteracciones() throws Exception {
    mouse.Clickear(iteracciones);
}
public void clickEnBook() throws Exception {
    mouse.Clickear(book);
}
public void clickEnFlechaElement() throws Exception {
    mouse.Clickear(flecha_abajo_elements);
}
public void clickEnFlechaForms() throws Exception {
    mouse.Clickear(flecha_abajo_forms);
}
public void clickEnFlechaAlerts() throws Exception {
    mouse.Clickear(flecha_abajo_alert);
}
public void clickEnFlechaWidgets() throws Exception {
    mouse.Clickear(flecha_abajo_widgets);
}
public  void clickEnFlechaInteracciones() throws Exception {
    mouse.Clickear(flecha_abajo_interacciones);
}
public void clickEnFlechaBook() throws Exception {
    mouse.Clickear(flecha_abajo_book);
}
public void clickEnTextBox() throws Exception {
    mouse.Clickear(button_text_box);
}
public void clickEnCheckBox() throws Exception {
    mouse.Clickear(button_check_box);
}
public void clickEnRadioButton() throws Exception {
    mouse.Clickear(button_radio_button);
}
public void clickEnWebTables() throws Exception {
    mouse.Clickear(button_web_tables);
}
public void clickEnButtons() throws Exception {
    mouse.Clickear(button_buttons);
}
public void clickEnLinks() throws Exception {
    mouse.Clickear(button_links);
}
public void clickEnBrokens() throws Exception {
    mouse.Clickear(button_broken_links);
}
public void clickEnUpload() throws Exception {
    mouse.Clickear(button_upload);
}
public void clickEnDinamic() throws Exception {
    mouse.Clickear(button_dinamic);
}

//funciones con click en check y flechas
public void clickEnCheckHogar() throws Exception {
    mouse.Clickear(button_check_home);
}
public void clickEnFlechaHome() throws Exception {
    mouse.Clickear(icono_flecha_home);
}
public void clickEnCheckDesktop() throws Exception {
    mouse.Clickear(button_check_desktop);
}
public void clickEnFlechaDesktop() throws Exception {
    mouse.Clickear(icono_flecha_desktop);
}
public void clickEnCheckDocuments() throws Exception {
    mouse.Clickear(button_check_documents);
}
public void clickEnFlechaDocuments() throws Exception {
    mouse.Clickear(icono_flecha_documents);
}
public void clickEnCheckDownload() throws Exception {
    mouse.Clickear(button_check_downloads);
}
public void clickEnFlechaDownload() throws Exception {
    mouse.Clickear(icono_flecha_downloads);
}
public void clickEnNotas() throws Exception {
    mouse.Clickear(button_check_notes);
}
public void clickEnComandos() throws Exception {
    mouse.Clickear(button_check_commands);
}
public void clickEnWorkspace() throws Exception {
    mouse.Clickear(button_check_workspace);
}
public void clickEnOffice() throws Exception {
    mouse.Clickear(button_check_office);
}
public void clickEnFlechaWorkspace() throws Exception {
    mouse.Clickear(icono_flecha_workspace);
}
public void clickEnFlechaOficce() throws Exception {
    mouse.Clickear(icono_flecha_office);
}
public void clickEnBotonMas() throws Exception {
    mouse.Clickear(button_mas);
}
public void clickEnBotonMenos() throws Exception {
    mouse.Clickear(button_menos);
}
public void clickEnAngular() throws Exception {
    mouse.Clickear(button_check_angular);
}
public void clickEnVeu() throws Exception {
    mouse.Clickear(button_check_veu);
}
public void clickEnReact() throws Exception {
    mouse.Clickear(button_check_react);
}
public void clickEnPublic() throws Exception {
    mouse.Clickear(button_check_public);
}
public void clickEnPrivate() throws Exception {
    mouse.Clickear(button_check_private);
}
public void clickEnClasified() throws Exception {
    mouse.Clickear(button_check_classified);
}
public void clickEnGeneral() throws Exception {
    mouse.Clickear(button_check_general);
}
public void clickEnFlechaDownloads() throws Exception {
    mouse.Clickear(icono_flecha_downloads);
}
public void clickEnWord() throws Exception {
    mouse.Clickear(button_check_word);
}
public void clickEnExcel() throws Exception {
    mouse.Clickear(button_check_excel);
}
//funciones de elements
public void completarTexBox(String name, String email, String dir1, String dir2) throws Exception {
    teclado.onEscribir(input_full_name,name);
    teclado.onEscribir(input_email,email);
    teclado.onEscribir(input_address_one,dir1);
    teclado.onEscribir(input_address_two,dir2);
    mouse.Clickear(button_submit);
}


public void clickearComands() throws Exception {
    mouse.Clickear(icono_flecha_desktop);
    clickEnComandos();
}
public void clickearWorkspase() throws Exception {
    mouse.Clickear(icono_flecha_documents);
    clickEnWorkspace();
}
public void clickearOffice() throws Exception {
    mouse.Clickear(icono_flecha_documents);
    clickEnOffice();
}
}

