package stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.IntegrationSteps;

public class IntegrationStepDefinitions {

    @Steps
    IntegrationSteps integrationSteps;

    @Then("created user should be visible in Console response")
    public void verifyCreatedUserInUi() {

        integrationSteps.verifyCreatedUserInUi();
    }
}