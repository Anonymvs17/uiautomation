package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.ecx.io")
public class SearchResultsPage extends PageObject {

    @FindBy(css = "body.search-results")
    private WebElementFacade pageIndicator;

    @FindBy(css = "h1")
    private WebElementFacade headline;

    @FindBy(className = "blog-item", timeoutInSeconds = "10")
    private List<WebElementFacade>  blogItems;

    @WhenPageOpens
    public void waitUntilPageIndicatorAppears() {
        element(pageIndicator).waitUntilVisible();
    }

    public WebElementFacade getHeadline(){
        return headline;
    }
}
