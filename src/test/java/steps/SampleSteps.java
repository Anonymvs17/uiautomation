package steps;

import modules.CookieBarModule;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactUsPage;
import pages.Homepage;
import pages.SearchResultsPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SampleSteps extends ScenarioSteps {

    private Homepage homepage;
    private SearchResultsPage searchResultsPage;
    private ContactUsPage contactUsPage;
    private CookieBarModule cookieBarModule;

    @Step("Navigate to homepage")
    public SampleSteps openHomepage() {
        homepage.open();
        return this;
    }

    @Step("Search for \"{0}\"")
    public SampleSteps searchFor(String searchText) {
        homepage
                .enterSearchTerm(searchText)
                .clickOnSearchButton();
        return this;
    }

    @Step("Headline contains text: \"{0}\"")
    public SampleSteps checkThatHeadlineContainsText(String text){
        assertThat(searchResultsPage.getHeadline().getText(), containsString(text));
        return this;
    }

    @Step("Open first result")
    public SampleSteps openFirstResult(){
        searchResultsPage.openFirstResult();
        return this;
    }

    @Step("Click on contact us button")
    public SampleSteps clickOnContactUsButton(){
        homepage.clickOnContactUsButton();
        return this;
    }

    @Step("Typed in first name \"{0}\"")
    public SampleSteps typeFirstName(String firstName){
        contactUsPage.enterFirstName(firstName);
        return this;
    }

    @Step("Type in last name \"{0}\"")
    public SampleSteps typeLastName(String lastName){
        contactUsPage.enterLastName(lastName);
        return this;
    }

    @Step("Acceppt cookies")
    public SampleSteps acceptCookies(){
        cookieBarModule.acceptCookies();
        return this;
    }
}
