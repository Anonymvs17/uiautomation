package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public abstract class AbstractTest {

    protected EnvironmentVariables getTestData(){
        return SystemEnvironmentVariables.createEnvironmentVariables();
    }
}
