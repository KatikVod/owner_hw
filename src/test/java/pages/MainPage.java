package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainPage {
    private final SelenideElement
            searchInput = $("#searchInput"),
            searchResultsTitle = $(".searching-results__title");
    private final ElementsCollection
            searchResults = $$(".product-card");

    public MainPage openPage() {
        open("");
        return this;
    }

    public MainPage searchByText(String searchQuery) {
        searchInput.click();
        searchInput.sendKeys(searchQuery);
        searchInput.pressEnter();
        return this;
    }

    public void checkSearchResults(String searchQuery)
    {
        assertThat(searchResultsTitle.getText()).isEqualTo(searchQuery);
        assertThat(searchResults.size()).isNotNull();
    }
}
