package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.NavigationSteps;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(SerenityRunner.class)
public class SearchOverHomepageTest {

    private static final String SEARCH_TEXT = "test";

    @Managed(clearCookies=BeforeEachTest)
    private WebDriver driver;

    @Steps
    private NavigationSteps navigationSteps;

    @Test
    @WithTag(type="feature", name="Search")
    public void customerIsAbleToSearch() {
        navigationSteps.openHomepage();
        navigationSteps.searchFor(SEARCH_TEXT);
        navigationSteps.headlineContainsText(SEARCH_TEXT);
    }
}
