package ui.features;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import ui.steps.DynamicLoadingPageSteps;

public class DynamicLoadingPageTest extends AbstractTest {

    private String searchText;

    @Steps
    private DynamicLoadingPageSteps dynamicLoadingPageSteps;

    @Before
    public void setUp() {
        searchText = getTestData().getProperty("testdata.searchterm");
    }

    @Test
    @WithTag(name = "DynamicLoading")
    public void dynamicPageLoading() {
        dynamicLoadingPageSteps
                .openDynamicLoadingElementsPage()
                .checkThatHeadlineContainsText("Dynamically Loaded Page Elements")
                .clickOnFirstLink()
                .clickOnStartButton()
                .waitForLoadingElementAndVerifyText("Hello World!");
    }
}
