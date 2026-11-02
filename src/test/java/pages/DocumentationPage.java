package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.ConfigReader;
import utils.LogUtils;

public class DocumentationPage extends PageObject {

    @FindBy(linkText = "Tools")
    private WebElementFacade docsLink;

    @FindBy(xpath = "//h1[contains(text(),'16 small tools')]")
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