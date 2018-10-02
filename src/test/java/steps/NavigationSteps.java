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
    public void openHomepage() {
        homepage.open();
    }

    @Step("Search for \"{0}\"")
    public void searchFor(String searchText) {
        homepage
                .enterSearchTerm(searchText)
                .clickOnSearchButton();
    }

    @Step("Headline contains text: \"{0}\"")
    public void headlineContainsText(String text){
        assertThat(searchResultsPage.getHeadline().getText(), containsString(text));
    }
}
