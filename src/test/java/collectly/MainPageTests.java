package collectly;

import io.qameta.allure.Owner;

import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.*;
import static io.qameta.allure.Allure.step;


public class MainPageTests extends TestBase {

    @BeforeEach
    @DisplayName("Открытие главной страницы сайта www.collectly.co")
    @Step("Переод на главную страницу")
    public void visitMainPage() {
        new MainPage().openMainPage();
    }


    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка отображения логотипа на главной странице")
    void mainLogoVisible() {
        step("Проверка отображаения логотипа на главной странице ", ()-> {
            new MainPage().getMainLogo().should(appear);
        });
    }

    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка наличия табов навигации")
    void checkTabsHeader() {
        MainPage mainPage = new MainPage();

        step("Проверка наличия табa About", ()-> {
            mainPage.getNavTabAbout().shouldHave(text("About"));
        });

        step("Проверка наличия табa Solutions", ()-> {
            mainPage.getNavTabSolutions().shouldHave(text("Solutions"));
        });
        step("Проверка наличия табa Testimonials", ()-> {
            mainPage.getNavTabTestimonials().shouldHave(text("Testimonials"));
        });
        step("Проверка наличия табa Plans", ()-> {
            mainPage.getNavTabPlans().shouldHave(text("Plans"));
        });
        step("Проверка наличия табa Pay Your Bill", ()-> {
            mainPage.getNavTabPayYourBill().shouldHave(text("Pay Your Bill"));
        });
        step("Проверка наличия табa Login", ()-> {
            mainPage.getNavTabLogin().shouldHave(text("Login"));
        });
    }

    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка отображения секции Plans")
    void checkSectionPlansVisible() {
        MainPage mainPage = new MainPage();

        step("Проскролить до секции Plans}", ()-> {
            mainPage.getSectionPlans().scrollTo();
        });

        step("Проверить отображение секции Plans", ()-> {
            mainPage.getSectionPlans().should(visible);
        });
    }






}
