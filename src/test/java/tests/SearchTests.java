package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTests extends TestBase {

    String searchQuery = "платье летнее";
    MainPage mainPage = new MainPage();

    @Test
    void searchTest() {
        mainPage.openPage()
                .searchByText(searchQuery)
                .checkSearchResults(searchQuery);
    }
}
