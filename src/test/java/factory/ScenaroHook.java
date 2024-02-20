package factory;

import factory.ScenarioData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenaroHook extends BaseScenario{

    public ScenaroHook(ScenarioData scenarioData) {
        super(scenarioData);
    }

    @Before
    public void setUp(){
        scenarioData.driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        scenarioData.driver.close();
    }
}
