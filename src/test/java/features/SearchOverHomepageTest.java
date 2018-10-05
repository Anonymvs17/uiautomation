package features;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.SampleSteps;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class SearchOverHomepageTest extends AbstractTest{

    private static String searchText;

    @Managed(clearCookies=BeforeEachTest)
    private WebDriver driver;

    @Steps
    private SampleSteps sampleSteps;

    @Before
    public void setUp(){
        searchText = getTestData().getProperty("testdata.searchterm");
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
