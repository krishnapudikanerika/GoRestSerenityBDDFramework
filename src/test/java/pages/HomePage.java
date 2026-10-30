package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.ConfigReader;
import utils.LogUtils;

public class HomePage extends PageObject {

    @FindBy(xpath = "//*[contains(text(),'Go REST')]")
    private WebElementFacade goRestLogo;

    public void openHomePage() {

        LogUtils.step("OPEN HOME PAGE");

        openUrl(
                ConfigReader.get("base.url")
        );
    }

    public boolean isGoRestLogoDisplayed() {

        waitFor(goRestLogo);

        return goRestLogo.isDisplayed();
    }
}