package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.UiSteps;


public class UiStepsDefinition {

    @Steps
    UiSteps uiSteps;

    @Given("user opens GoRest application")
    public void openHomePage() {
        uiSteps.openHomePage();
    }

    @Then("Home Page should be displayed")
    public void verifyHomePage() {
        uiSteps.verifyHomePage();
    }

    @Given("user opens Documentation page")
    public void openDocumentationPage() {
        uiSteps.openDocumentationPage();
    }

    @Then("Documentation page should be displayed")
    public void verifyDocumentationPage() {
        uiSteps.verifyDocumentationPage();
    }

    @Given("user opens Console page")
    public void openConsolePage() {
        uiSteps.openConsolePage();
    }

    @Then("Console page should be displayed")
    public void verifyConsolePage() {
        uiSteps.verifyConsolePage();
    }
}
