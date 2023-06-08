package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void solntsevShouldBeTheTopContributor() {
// открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
// подвести мышку к первому аватару из блока contributors
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
        .$$("ul li").first().hover();
 // проверка: во всплывающем окне есть текст Andrei Solntsev
        $(".Popover").shouldHave(text("Andrei Solntsev"));

    }
}
