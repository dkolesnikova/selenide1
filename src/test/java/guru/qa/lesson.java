package guru.qa;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class lesson {
    void testAlpha() {
        open ("https://alfabank.ru/"); // arrange
        $("").closest("h1")//ищет элемент с таким же названием
                .sibling(0) //ребенок
                .preceding(0); //ребенок в обратную сторону


    //CSS селекторы
    //$(".class");
    //$("#id");
    //$("div");
    //$("div>div"); первый ребенок дива
    //$("div div"); любой ребенок дива



    }

}
