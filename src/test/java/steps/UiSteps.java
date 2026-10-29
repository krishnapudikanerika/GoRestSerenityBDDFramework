package steps;

import net.serenitybdd.annotations.Step;
import pages.HomePage;
import net.serenitybdd.annotations.Step;
import pages.ConsolePage;
import pages.DocumentationPage;

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
        homePage.verifyHomePageTitle();
    }

    @Step
    public void openDocumentationPage() {
        documentationPage.openDocumentationPage();
    }

    @Step
    public void verifyDocumentationPage() {
        documentationPage.verifyDocumentationPage();
    }

    @Step
    public void openConsolePage() {
        consolePage.openConsolePage();
    }

    @Step
    public void verifyConsolePage() {
        consolePage.verifyConsolePage();
    }
}