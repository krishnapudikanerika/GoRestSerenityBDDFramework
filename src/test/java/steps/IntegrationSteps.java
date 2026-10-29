package steps;

import net.serenitybdd.annotations.Step;

public class IntegrationSteps {

    @Step
    public void verifyCreatedUserInUi() {

        System.out.println(
                "Verify User ID : "
                        + utils.TestContext.userId
        );
    }
}