package collectly;

import io.qameta.allure.Owner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class MainPageTests extends TestBase {

//    @BeforeEach
//    @DisplayName("Открытие главной страницы")
//    public void visitMainPage() {
//        new MainPage().openMainPage();
//    }


    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка отображения логотипа на главной странице")
    void mainLogoVisible() {

       open("https://www.collectly.co/");
       sleep(5000);
    }



}
