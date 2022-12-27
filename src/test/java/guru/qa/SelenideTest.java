package guru.qa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest  {
    @Test
    void softAssertionTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(".wiki-pages-box").find(byText("SoftAssertions")).click();
        $(".gh-header-meta").shouldHave(text("Andrei Solntsev edited this page"));









    }
}
