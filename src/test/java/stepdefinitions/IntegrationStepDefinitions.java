package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.IntegrationSteps;

public class IntegrationStepDefinitions {

    @Steps
    IntegrationSteps integrationSteps;

    @Then("created user should be visible in Console response")
    public void created_user_should_be_visible() {

        integrationSteps.verifyCreatedUserInConsole();
    }

    @When("user opens GoRest Console")
    public void user_opens_go_rest_console() {

        integrationSteps.openGoRestConsole();
    }
}