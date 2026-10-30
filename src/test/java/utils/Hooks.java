package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        RestAssuredConfig.initialize();
        Log.info("================================");
        Log.info("STARTING SCENARIO");
        Log.info(scenario.getName());
        Log.info("================================");
    }

    @After
    public void afterScenario(Scenario scenario) {

        Log.info("================================");
        Log.info("ENDING SCENARIO");
        Log.info(scenario.getName());
        Log.info("STATUS : "
                + scenario.getStatus());
        Log.info("================================");
    }
}