package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;

@At(urls={"#HOST"})
public class Homepage extends PageObject {

    @FindBy(css = "body.page-template-page-full-home")
    private WebElementFacade pageIndicator;

    @FindBy(css = ".search-form input")
    private WebElementFacade searchBox;

    @FindBy(css = ".search-form button", timeoutInSeconds = "10")
    private WebElementFacade searchButton;

    @FindBy(css = "a[href*=\"contact\"]")
    private WebElementFacade contactUsButton;

    @WhenPageOpens
    public void waitUntilPageIndicatorAppears() {
        element(pageIndicator).waitUntilVisible();
    }

    public Homepage enterSearchTerm(String searchTerm){
        searchBox
                .waitUntilClickable()
                .then()
                .type(searchTerm);
        return this;
    }

    public Homepage clickOnSearchButton(){
        searchButton.click();
        return this;
    }

    public Homepage clickOnContactUsButton(){
        contactUsButton
                .waitUntilClickable()
                .then()
                .click();
        return this;
    }
}
