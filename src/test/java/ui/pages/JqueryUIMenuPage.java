package ui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("/jqueryui/menu")
public class JqueryUIMenuPage extends PageObject {

    @FindBy(css = "#ui-id-2")
    private WebElementFacade enabledField;

    @FindBy(css = "#ui-id-4")
    private WebElementFacade downloadField;

    @FindBy(css = "[href*=\"menu.xls\"]")
    private WebElementFacade excelMenuLink;

    public WebElementFacade getEnabledField() {
        return enabledField;
    }

    public WebElementFacade getDownloadField() {
        return downloadField;
    }

    public WebElementFacade getExcelMenuLink() {
        return excelMenuLink;
    }
}
