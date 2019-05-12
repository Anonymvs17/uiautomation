package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.DynamicLoadedElementsPage;
import pages.DynamicLoadingOverviewPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DynamicLoadingPageSteps extends ScenarioSteps {

    private DynamicLoadingOverviewPage dynamicLoadingPage;
    private DynamicLoadedElementsPage dynamicLoadedElementsPage;

    @Step("Navigate to dynamic loading element page")
    public DynamicLoadingPageSteps openDynamicLoadingElementsPage() {
        dynamicLoadingPage.open();
        return this;
    }

    @Step("Click on first link")
    public DynamicLoadingPageSteps clickOnFirstLink() {
        dynamicLoadingPage.clickOnFirstLink();
        return this;
    }

    @Step("Headline contains text: \"{0}\"")
    public DynamicLoadingPageSteps checkThatHeadlineContainsText(String text){
        assertThat(text, equalTo(dynamicLoadingPage.getHeadline(text).getText()));
        return this;
    }

    @Step("Click on start button")
    public DynamicLoadingPageSteps clickOnStartButton(){
        dynamicLoadedElementsPage.clickOnStartButton();
        return this;
    }

    @Step("Wait for element to load and verify presence of text after loading \"{0}\"")
    public DynamicLoadingPageSteps waitForLoadingElementAndVerifyText(String text){
        String textOfLoadedWebelement = dynamicLoadedElementsPage.getWebELementAfterLoading().getText();
        assertThat(textOfLoadedWebelement, equalTo(text));
        return this;
    }

}
