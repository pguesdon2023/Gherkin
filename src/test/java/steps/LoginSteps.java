package steps;

import factory.BaseScenario;
import factory.ScenarioData;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps extends BaseScenario {

    public LoginPage loginPage;

    @Before
    public void inject(){
        loginPage = new LoginPage(scenarioData);
    }
    public LoginSteps(ScenarioData scenarioData) {
        super(scenarioData);
    }

    @Given("I'm on Cura Login Page")
    public void iMOnCuraLoginPage() throws InterruptedException {
        scenarioData.driver.get(LoginPage.url);
        Thread.sleep(2000);
    }

    @When("I log with username {string} and password {string}")
    public void iLogWithUsernameAndPassword(String usernamne, String password) throws InterruptedException {
        loginPage.getUsername().sendKeys(usernamne);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLogin().click();
        Thread.sleep(2000);
    }

    @Then("I am on login page")
    public void iAmOnLoginPage() {
        Assert.assertEquals(scenarioData.driver.getCurrentUrl(), LoginPage.url);
    }
}
