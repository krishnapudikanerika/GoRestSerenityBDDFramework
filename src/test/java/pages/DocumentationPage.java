package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class DocumentationPage extends PageObject {

    public void openDocumentationPage() {

        openUrl("https://gorest.co.in/");
    }

    public void verifyDocumentationPage() {

        String currentUrl = getDriver().getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("gorest")
        );
    }
}