package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;
import java.util.List;

@DefaultUrl("https://www.ecx.io")
public class SearchResultsPage extends PageObject {

    @FindBy(css = "body.search-results")
    private WebElementFacade pageIndicator;

    @FindBy(css = "h1")
    private WebElementFacade headline;

    @FindBy(css = "div.blog-item a.btn", timeoutInSeconds = "10")
    private List<WebElementFacade> blogRowButtons;

    @WhenPageOpens
    public void waitUntilPageIndicatorAppears() {
        element(pageIndicator).waitUntilVisible();
    }

    public WebElementFacade getHeadline(){
        return headline;
    }

    public SearchResultsPage openFirstResult(){
        WebElementFacade firstBlogRowButton = withTimeoutOf(Duration.ofSeconds(2)).waitFor(blogRowButtons).get(0);
        firstBlogRowButton
                .waitUntilClickable()
                .waitUntilClickable()
                .click();
        return this;
    }

}
