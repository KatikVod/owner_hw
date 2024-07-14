package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("120.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("https://www.wildberries.ru")
    String baseUrl();

    @DefaultValue("false")
    boolean isRemote();

    String remoteUrl();
}