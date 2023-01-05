import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;



/**
 * Тест "Меняются местами прямоугольники А и В при переносе прямоугольника А на место  В
 * на сайте https://the-internet.herokuapp.com/drag_and_drop"
 *
 * @author Bulatov
 * @version 01
 */
public class DragAndDropTest {
    @Test
    void changeRectangleWithDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }
}
