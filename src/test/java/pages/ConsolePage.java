package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.ConfigReader;
import utils.LogUtils;

public class ConsolePage extends PageObject {

    @FindBy(css = "a[href='/rest-console']")
    private WebElementFacade consoleLink;

    @FindBy(id = "rsq-url")
    private WebElementFacade requestUrl;

    @FindBy(xpath = "//button[@type='button']")
    private WebElementFacade sendButton;

    @FindBy(xpath = "//*[@id='main']/div/div[2]/div[3]/section[2]/p/span[1]")
    private WebElementFacade responseCode;

    @FindBy(xpath = "//*[@id='main']/div/div[2]/div[3]")
    private WebElementFacade responseSection;

    public void openConsolePage() {

        LogUtils.step("OPEN CONSOLE PAGE");

        openUrl(
                ConfigReader.get("base.url")
        );

        waitFor(consoleLink);

        consoleLink.click();
    }

    public void sendGetUserRequest(int userId) {

        String endpoint =
                ConfigReader.get("api.base.url")
                        + "/users/"
                        + userId;

        LogUtils.step("EXECUTING USER API IN CONSOLE");

        waitFor(requestUrl);

        requestUrl.clear();

        requestUrl.type(endpoint);

        sendButton.click();
    }

    public String getResponseCode() {

        waitFor(responseCode);

        return responseCode.getText();
    }

    public String getResponseText() {

        waitFor(responseSection);

        return responseSection.getText();
    }

    public String getCurrentUrl() {

        return getDriver().getCurrentUrl();
    }
}