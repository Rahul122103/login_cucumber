package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
     features = "C:\\Users\\gs\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\cucumberTestng\\src\\test\\resources\\login\\login.feature",
       glue = "Stepsmain"
       )
public class Runnerlogin extends AbstractTestNGCucumberTests {

}
