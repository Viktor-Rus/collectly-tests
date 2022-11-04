package tutu;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;


public class MainPageTests extends TestBase {

    @BeforeEach
    @DisplayName("Открытие главной страницы")
    public void visitMainPage() {
        new MainPage().openMainPage();
    }


    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка отображения логотипа на главной странице")
    void mainLogoVisible() {
        new MainPage().checkLogoVisible();
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка открытия формы 'Open an Account' ")
    void openAccountForm() {
        new MainPage().openAnAccount();
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Проверка переключателя языка в футере")
    void changeLanguage() {
        new MainPage().scrollToFooter()
                      .choiceLanguageInFooter("Українська");
    }

    @Test
    @Owner("vaurusov")
    @DisplayName("Переход на страницу FAQ")
    void visitPageFooter() {
        new MainPage()
                .hoverMenuNav("TRADING")
                .clickByText("FAQ")
                .checkSearchHeaderText("We've got answers to all of your questions");



    }

}
