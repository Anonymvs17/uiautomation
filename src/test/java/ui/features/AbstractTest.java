package ui.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(SerenityRunner.class)
public abstract class AbstractTest {

    @Managed(clearCookies = BeforeEachTest)
    private WebDriver driver;

    protected EnvironmentVariables getTestData(){
        return SystemEnvironmentVariables.createEnvironmentVariables();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
