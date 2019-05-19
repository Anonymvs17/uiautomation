package ui.features;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ui.steps.JQueryPageSteps;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class JqueryMenuPageTest extends AbstractTest {

    @Managed(clearCookies = BeforeEachTest)
    private WebDriver driver;

    @Steps
    private JQueryPageSteps jQueryPageSteps;

    @Test
    @WithTag(name = "DynamicLoading")
    public void ableToSelectExcelField() {
        jQueryPageSteps.openJQueryMenuPage()
                .clickOnEnabledButton()
                .clickOnDownloadField()
                .clickOnExcelField();
    }
}
