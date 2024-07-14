package tests;

import com.codeborne.selenide.Selenide;
import config.ProjectConfiguration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration();
        projectConfiguration.setWebConfig();
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}