package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class HomePage extends PageObject {

    public void openHomePage() {

//        WebDriverManager.chromedriver().setup();

        openUrl("https://gorest.co.in/");
    }

    public void verifyHomePageTitle() {

        Assert.assertTrue(
                getDriver().getTitle().contains("GoRest")
        );
    }
}