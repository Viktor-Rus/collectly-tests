package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    private SelenideElement
            mainLogo = $("img[class='brand-logo']"),
            navTabAbout =$("a[href='#about']"),
            navTabSolutions =$("a[href='#features'] div.menu-link"),
            navTabTestimonials =$("a[href='#reviews']"),
            navTabPlans =$("a[href='#pricing']"),
            navTabPayYourBill =$("a[href='http://pay.collectly.co']"),
            navTabLogin =$("a[href='http://app.collectly.co']");




    public MainPage openMainPage() {
        open(Configuration.baseUrl);
        return this;
    }

    public SelenideElement getMainLogo(){ return mainLogo; }

    public SelenideElement getNavTabAbout(){ return navTabAbout; }
    public SelenideElement getNavTabSolutions(){ return navTabSolutions; }
    public SelenideElement getNavTabTestimonials(){ return navTabTestimonials; }
    public SelenideElement getNavTabPlans(){ return navTabPlans; }
    public SelenideElement getNavTabPayYourBill(){ return navTabPayYourBill; }
    public SelenideElement getNavTabLogin(){ return navTabLogin; }


}
