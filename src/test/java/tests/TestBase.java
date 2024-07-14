package tests;

import com.codeborne.selenide.Selenide;
import config.ProjectConfiguration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    private static final WebConfig webConfig =
            ConfigFactory.create(WebConfig.class, System.getProperties());
    @BeforeAll
    static void beforeAll() {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(webConfig);
        projectConfiguration.setWebConfig();
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}