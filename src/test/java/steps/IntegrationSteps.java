package steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.ConsolePage;
import utils.TestContext;

public class IntegrationSteps {

    ConsolePage consolePage;

    public void openGoRestConsole() {
        consolePage.openConsolePage();
    }

    @Step
    public void verifyCreatedUserInConsole() {

        consolePage.openConsolePage();

        consolePage.sendGetUserRequest(
                TestContext.userId
        );

////        Assert.assertEquals(
////                "200",
////                consolePage.getResponseCode()
//        );

//        Assert.assertTrue(
//                consolePage.getResponseText()
//                        .contains(
//                                String.valueOf(
//                                        TestContext.userId
//                                )
//                        )
//        );
    }
}