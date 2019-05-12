package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("/dynamic_loading")
public class DynamicLoadingOverviewPage extends PageObject {

    @FindBy(css = "h3")
    private WebElementFacade headline;

    @FindBy(css = "[href=\"/dynamic_loading/1\"]", timeoutInSeconds = "10")
    private WebElementFacade  firstLink;

    public WebElementFacade getHeadline(String headlineText) {
        return headline;
    }

    public void clickOnFirstLink(){
        firstLink.click();
    }
}
