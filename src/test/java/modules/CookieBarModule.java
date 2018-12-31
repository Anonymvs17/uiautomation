package modules;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CookieBarModule extends PageObject {

    @FindBy(id = "cn-accept-cookie", timeoutInSeconds = "20")
    private WebElementFacade acceptCookies;

    public CookieBarModule acceptCookies(){
        acceptCookies
                .waitUntilClickable()
                .then()
                .click();
        return this;
    }
}
