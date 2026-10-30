package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.ConfigReader;
import utils.LogUtils;

public class DocumentationPage extends PageObject {

    @FindBy(xpath = "//*[@id='app']/div[2]/header/div/nav/a[2]")
    private WebElementFacade docsLink;

    @FindBy(xpath = "//*[@id='main']/div[1]/h1")
    private WebElementFacade docsHeader;

    public void openDocumentationPage() {

        LogUtils.step("OPEN DOCUMENTATION PAGE");

        openUrl(
                ConfigReader.get("base.url")
        );

        waitFor(docsLink);

        docsLink.click();
    }

    public String getDocsHeader() {

        waitFor(docsHeader);

        return docsHeader.getText();
    }
}