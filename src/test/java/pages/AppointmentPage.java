package pages;

import factory.ScenarioData;

public class AppointmentPage {

    public ScenarioData scenarioData;
    public AppointmentPage(ScenarioData scenarioData) {
        this.scenarioData = scenarioData;
    }

    public static String url = "https://katalon-demo-cura.herokuapp.com/#appointment";
}
