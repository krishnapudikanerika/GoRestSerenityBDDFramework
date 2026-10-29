package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class ConsolePage extends PageObject {

    public void openConsolePage() {

        openUrl("https://gorest.co.in/");
    }

    public void verifyConsolePage() {

        Assert.assertTrue(
                getDriver().getPageSource()
                        .contains("Console")
        );
    }
}