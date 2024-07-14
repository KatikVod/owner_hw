package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class ProjectConfiguration {

    private final WebConfig webConfig;

    public ProjectConfiguration() {
        this.webConfig = ConfigFactory.create(WebConfig.class);
    }

    public void setWebConfig() {
        Configuration.baseUrl = webConfig.baseUrl();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
        Configuration.pageLoadStrategy = "eager";

        if (webConfig.isRemote()) {
            Configuration.remote = webConfig.remoteUrl();
        }
    }
}