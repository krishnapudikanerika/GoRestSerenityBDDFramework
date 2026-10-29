package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.ApiSteps;

public class ApiStepDefinitions {

    @Steps
    ApiSteps apiSteps;

    @Given("valid user details")
    public void validUserDetails() {
    }

    @When("user creates a new user through API")
    public void createUser() {
        apiSteps.createUser();
    }

    @When("user updates name and email")
    public void user_updates_name_and_email() {

        apiSteps.updateUser();
    }

    @Then("user details should be updated successfully")
    public void user_details_should_be_updated_successfully() {

        apiSteps.verifyUserUpdated();
    }

    @Then("user should be created successfully")
    public void verifyUserCreated() {
        apiSteps.verifyUserCreated();
    }

    @When("user retrieves the user")
    public void getUser() {
        apiSteps.getUser();
    }

    @Then("correct user details should be returned")
    public void verifyUserRetrieved() {
        apiSteps.verifyUserRetrieved();
    }

    @When("user updates the user")
    public void updateUser() {
        apiSteps.updateUser();
    }

    @Then("user should be updated successfully")
    public void verifyUserUpdated() {
        apiSteps.verifyUserUpdated();
    }

    @When("user deletes the user")
    public void deleteUser() {
        apiSteps.deleteUser();
    }

    @Then("user should be deleted successfully")
    public void verifyDeleteUser() {
        apiSteps.verifyUserDeleted();
    }

    @Given("existing user id")
    public void existing_user_id() {

        apiSteps.createUser();
        apiSteps.verifyUserCreated();
    }

    @When("user partially updates details")
    public void user_partially_updates_details() {

        apiSteps.updateUser();
    }

    @Then("patch request should succeed")
    public void patch_request_should_succeed() {

        apiSteps.verifyUserUpdated();
    }
}