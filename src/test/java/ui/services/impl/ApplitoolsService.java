package ui.services.impl;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import ui.services.ImageComparisonService;

public class ApplitoolsService implements ImageComparisonService {
    private Eyes eyes;
    private WebDriver driver;

    public ApplitoolsService(WebDriver driver, String apiKey) {
        // Initialize the eyes SDK and set your private API key.
        eyes = new Eyes();
        // Set Applitools API key
        eyes.setApiKey(apiKey);
        this.driver = driver;
    }

    @Override
    public void record(String testname) {
        try {
            // Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
            eyes.open(driver, "dev", testname);
            // Visual checkpoint.
            eyes.checkWindow(testname);
            eyes.close();
        } finally {
            driver.quit();
            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();
        }
    }
}
