package tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

import java.io.IOException;

@Test
@CucumberOptions(
        features = "src/test/java/features",//donde estara lo que se debe ejecutar
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        glue = "steps",//indica donde encontrar las pasos con los metodos, asociadoas a los pasos de los escenarios
        tags = "@Logeo"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void EliminarChrome() throws Exception {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //GRISELDA
}