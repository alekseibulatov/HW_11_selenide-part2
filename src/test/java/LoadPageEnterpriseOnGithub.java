import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Тест "Заголовок страницы Enterprisе содержит BuildLikeTheBest после выбора на  главной странице
 * GitHub в меню Solutions -> Enterprize"
 *
 * @author Bulatov
 * @version 01
 */

public class LoadPageEnterpriseOnGithub {
    @Test
    void headerEnterpriseOnGithubContainsBuildLikeTheBest() {
        open("https://github.com/");
        $(".d-lg-flex").find(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(Condition.text("Enterprise")).click();
        $(".application-main").shouldHave(Condition.text("Build like the best"));
    }
}
