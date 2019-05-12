package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("dynamic_loading/1")
public class DynamicLoadedElementsPage extends PageObject {

    @FindBy(css = "h3")
    private WebElementFacade headline;

    @FindBy(css = "#start button", timeoutInSeconds = "10")
    private WebElementFacade startButton;

    @FindBy(css = "#finish", timeoutInSeconds = "30")
    private WebElementFacade finishElement;


    public DynamicLoadedElementsPage isHeadlineDisplayed(String headlineText) {
        element(headline).containsText(headlineText);
        return this;
    }

    public void clickOnStartButton(){
        startButton.click();
    }

    public WebElementFacade getWebELementAfterLoading(){
        finishElement.waitUntilVisible();
        return finishElement;
    }
}
