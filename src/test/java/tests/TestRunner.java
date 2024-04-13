package tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

@Test
@CucumberOptions(
        features = "src/test/java/features",//donde estara lo que se debe ejecutar
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        glue = "steps",//indica donde encontrar las pasos con los metodos, asociadoas a los pasos de los escenarios
        tags = "@TestCasillaVerificacion"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}