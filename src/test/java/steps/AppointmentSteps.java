package steps;

import factory.BaseScenario;
import factory.ScenarioData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AppointmentPage;
import pages.LoginPage;

public class AppointmentSteps extends BaseScenario {

    public AppointmentSteps(ScenarioData scenarioData) {
        super(scenarioData);
    }

    @Then("I am on appointment page")
    public void iAmOnAppointmentPage() {
        Assert.assertEquals(scenarioData.driver.getCurrentUrl(), AppointmentPage.url);
    }
}
