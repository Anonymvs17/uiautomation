package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Homepage;
import pages.SearchResultsPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class NavigationSteps extends ScenarioSteps {

    private Homepage homepage;
    private SearchResultsPage searchResultsPage;

    @Step("Navigate to homepage")
    public NavigationSteps openHomepage() {
        homepage.open();
        return this;
    }

    @Step("Search for \"{0}\"")
    public NavigationSteps searchFor(String searchText) {
        homepage
                .enterSearchTerm(searchText)
                .clickOnSearchButton();
        return this;
    }

    @Step("Headline contains text: \"{0}\"")
    public NavigationSteps checkThatHeadlineContainsText(String text){
        assertThat(searchResultsPage.getHeadline().getText(), containsString(text));
        return this;
    }
}
