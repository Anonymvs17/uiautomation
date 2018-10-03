package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SampleSteps;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(SerenityRunner.class)
public class SearchOverHomepageTest {

    private static String searchText;

    @Managed(clearCookies=BeforeEachTest)
    private WebDriver driver;

    @Steps
    private SampleSteps sampleSteps;

    @Before
    public void setUp(){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        searchText = variables.getProperty("testdata.searchterm");
    }

    @Test
    @WithTag(name="Search")
    public void customerIsAbleToSearch() {

        sampleSteps
                .openHomepage()
                .searchFor(searchText)
                .checkThatHeadlineContainsText(searchText);
    }
}
