package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Steps;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(SerenityRunner.class)
public class SearchOverHomepageTest {

    private static String searchText;

    @Managed(clearCookies=BeforeEachTest)
    private WebDriver driver;

    @net.thucydides.core.annotations.Steps
    private Steps navigationSteps;

    @Before
    public void setUp(){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        searchText = variables.getProperty("testdata.searchterm");
    }

    @Test
    @WithTag(name="Search")
    public void customerIsAbleToSearch() {

        navigationSteps
                .openHomepage()
                .searchFor(searchText)
                .checkThatHeadlineContainsText(searchText);
    }
}
