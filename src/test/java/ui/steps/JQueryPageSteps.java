package ui.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ui.pages.JqueryUIMenuPage;

public class JQueryPageSteps extends ScenarioSteps {

    private JqueryUIMenuPage jqueryUIMenuPage;

    @Step("Navigate to jQuery menu page")
    public JQueryPageSteps openJQueryMenuPage() {
        jqueryUIMenuPage.open();
        return this;
    }

    @Step("Click on enabled button")
    public JQueryPageSteps clickOnEnabledButton() {
        jqueryUIMenuPage
                .getEnabledField()
                .click();
        return this;
    }

    @Step("Click on download field")
    public JQueryPageSteps clickOnDownloadField() {
        jqueryUIMenuPage
                .getDownloadField()
                .waitUntilVisible()
                .click();
        return this;
    }

    @Step("Click on excel field")
    public JQueryPageSteps clickOnExcelField() {
        jqueryUIMenuPage
                .getExcelMenuLink()
                .waitUntilVisible()
                .click();
        return this;
    }
}
