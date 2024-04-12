package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;

public class ArrastrarSoltar {
    private final EsperarHasta esperar;
    private final Acciones accion;
    private final ElementoResaltado resaltar;

    public ArrastrarSoltar(WebDriver driver) {
        this.esperar = new EsperarHasta(driver);
        this.accion = new Acciones(driver);
        this.resaltar = new ElementoResaltado(driver);
    }

    public void arrastrarYSoltar(By elementoOrigen, By elementoDestino) throws Exception {
        try {
            WebElement fuente = esperar.presente(elementoOrigen);
            WebElement destino = esperar.presente(elementoDestino);
            String colorHabilitado = ConfigReader.obtenerHabilitacionColor();
            if(fuente != null && destino !=null){
                accion.hacerScroll(fuente);
                if ("true".equalsIgnoreCase(colorHabilitado)) {
                    resaltar.resaltar(fuente);
                    resaltar.resaltar(destino);
                }
                accion.arrastrarSoltar(fuente,destino);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
