package ui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("/dynamic_loading")
public class DynamicLoadingOverviewPage extends PageObject {

    @FindBy(css = "h3")
    private WebElementFacade headline;

    @FindBy(css = "[href=\"/dynamic_loading/1\"]", timeoutInSeconds = "10")
    private WebElementFacade  firstLink;

    public WebElementFacade getHeadline() {
        return headline;
    }

    public WebElementFacade getFirstLink() {
        return firstLink;
    }
}
