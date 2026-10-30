package steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.ConsolePage;
import pages.DocumentationPage;
import pages.HomePage;
import validations.UIValidator;

public class UiSteps {

    HomePage homePage;
    DocumentationPage documentationPage;
    ConsolePage consolePage;

    @Step
    public void openHomePage() {
        homePage.openHomePage();
    }

    @Step
    public void verifyHomePage() {

        Assert.assertTrue(
                "Go REST logo not displayed",
                homePage.isGoRestLogoDisplayed()
        );
    }

    @Step
    public void openDocumentationPage() {
        documentationPage.openDocumentationPage();
    }

    @Step
    public void verifyDocumentationPage() {

        UIValidator.validateTextPresent(
                documentationPage.getDocsHeader(),
                "Docs and integration guides"
        );
    }

    @Step
    public void openConsolePage() {
        consolePage.openConsolePage();
    }

    @Step
    public void verifyConsolePage() {

        UIValidator.validateUrlContains(
                consolePage.getCurrentUrl(),
                "gorest.co.in"
        );
    }
}