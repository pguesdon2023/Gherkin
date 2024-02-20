package pages;

import factory.BaseScenario;
import factory.ScenarioData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{

    public ScenarioData scenarioData;
    public LoginPage(ScenarioData scenarioData) {
        this.scenarioData = scenarioData;
    }

    public static String url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";

    public WebElement getUsername(){
        return scenarioData.driver.findElement(By.id("txt-username"));
    }
    public WebElement getPassword(){
        return scenarioData.driver.findElement(By.id("txt-password"));
    }
    public WebElement getLogin(){
        return scenarioData.driver.findElement(By.id("btn-login"));
    }
}
